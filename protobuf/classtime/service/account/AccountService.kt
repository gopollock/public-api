package classtime.service.account

import classtime.service.RequestContext
import classtime.service.Service
import classtime.service.ServiceError
import classtime.service.annotations.RateLimit
import classtime.service.common.Public
import classtime.service.common.RequireRole
import classtime.service.common.Role
import java.time.temporal.ChronoUnit

/**
 * Service that handles accounts and authorization and creates authentication tokens.
 *
 * See https://ct.rocks/unified-authentication
 */
interface AccountService : Service {

    companion object {
        const val NAME = "Account"
    }

    /**
     * Initiates a log in process. It will redirect the user to the authentication provider.
     */
    @Public
    fun login(context: RequestContext, request: LoginRequest): LoginResponse

    /**
     * Verifies authentication information. Registers new Classtime accounts if needed.
     * Creates a new JWT token that the user can use for authorizing requests.
     *
     * @return response containing the url to redirect the user to.
     *
     * @throws ServiceError.BadRequest if successRedirectUrl is invalid or leads to (unsecure / not classtime) resource.
     *
     * @throws ServiceError.BadRequest if openId connect provided email is missing or not verified.
     * @throws ServiceError.BadRequest if openId connect provided csrf token is missing, invalid or expired.
     *
     * @throws ServiceError.NotFound if emailPassword provided email is not linked to any account.
     * @throws ServiceError.Unauthorized if emailPassword provided password hash is mismatched with hash from account.
     * @throws ServiceError.NotFound if emailPassword provided secret id is not linked to any verification or expired.
     * @throws ServiceError.BadRequest if emailPassword did not provide password hash.
     * @throws ServiceError.Forbidden if account reach max failed attempts and block duration is not exceeded.
     */
    @Public
    fun authorize(context: RequestContext, request: AuthorizationRequest): AuthorizationResponse

    /**
     * @return all information about the user's account or an empty response if the user is not logged in.
     */
    @Public
    @Deprecated("Use AccountService.getMyAccountInfo instead!")
    // TODO(https://app.asana.com/0/1200624621639592/1205007555415135): Remove this method
    fun getAccountInfo(context: RequestContext, request: AccountInfoRequest): AccountInfoResponse

    /**
     * @return all information about the user's account or an empty response if the user is not logged in.
     */
    @Public
    fun getMyAccountInfo(context: RequestContext, request: AccountInfoRequest): AccountInfoResponse

    /**
     * Logs the user out by clearing authentication tokens.
     */
    @Public
    fun logout(context: RequestContext, request: LogoutRequest): LogoutResponse

    /**
     * Creates new EmailLinkVerification entity and send an email with specific text (reset/signup) and link
     * to the page, where user can set new password.
     *
     * @throws ServiceError.NotFound when password authentication method with email for which
     * reset password is requested does not exist.
     * @throws ServiceError.BadRequest when password signup requested for already existing
     * password method with non-empty password hash.
     */
    @Public
    @RateLimit(limit = 30, unitCount = 1, chronoUnit = ChronoUnit.HOURS)
    fun resetPassword(context: RequestContext, request: ResetPasswordRequest): ResetPasswordResponse

    /**
     * Process pending accountExtension entity. As a result, the account receives an additional authentication method.
     * Merges two accounts into a single one, if the authentication method references an email of an existing account.
     * The main account will gain all accesses and privileges of the merged account.
     *
     * @throws ServiceError.NotFound when accountExtension with requested id missing in entity store.
     * @throws ServiceError.NotFound when main or merged account is missing in entity store.
     * @throws ServiceError.Forbidden for mismatched or expired secrets.
     */
    @Public // Must be public as we call it unauthorized when extension is done through email confirmation link
    fun accountExtension(context: RequestContext, request: AccountExtensionRequest): AccountExtensionResponse

    /**
     * Refresh user's JWT token, by replacing old token with a newly created one.
     *
     * @return a new token's creation and expiration timestamp data
     */
    @RequireRole(Role.Teacher)
    fun refreshToken(context: RequestContext, request: RefreshTokenRequest): RefreshTokenResponse

    /**
     * Updates part of the user's account info.
     *
     * @return all information about the user's account.
     */
    @RequireRole(Role.Teacher, Role.Student)
    fun updateAccountInfo(context: RequestContext, request: UpdateAccountInfoRequest): AccountInfoResponse

    /**
     * Creates new teacher in django and sets userProfile.isNew to false in case of success.
     *
     * @throws ServiceError.BadRequest if django teacher was not created for any reason (usually related to
     *         teacher itself).
     */
    @RequireRole(Role.Teacher)
    fun finishAccountCreation(context: RequestContext, request: FinishAccountCreationRequest): AccountInfoResponse

    /**
     * Return account's profile by id provided in request.
     *
     * @throws ServiceError.NotFound there is no account with provided id.
     */
    @RequireRole(Role.Teacher, Role.Machine)
    @Deprecated("Use getPublicUserProfile or getPrivateAccountData")
    // TODO(https://app.asana.com/0/1200624621639592/1205007555415135): Remove this method
    fun getUserProfile(context: RequestContext, request: UserProfileRequest): UserProfileResponse

    /**
     * Return account's public profile data by id provided in request.
     *
     * @throws ServiceError.NotFound there is no account with provided id.
     */
    @RequireRole(Role.Teacher)
    fun getPublicUserProfile(context: RequestContext, request: UserProfileRequest): UserProfileResponse

    /**
     * Return account data by id provided in request. It exposes account's private information, so must be limited
     * internally for the Classtime.
     *
     * If client requires his own data use [AccountService.getMyAccountInfo].
     *
     * @throws ServiceError.NotFound there is no account with provided id.
     */
    @RequireRole(Role.Machine)
    fun getPrivateAccountData(context: RequestContext, request: GetPrivateAccountDataRequest): GetPrivateAccountDataResponse

    /**
     * Generates token for account by given classtime id, role and permission.
     *
     * @throws ServiceError.NotFound if account does not exist in store.
     */
    @RequireRole(Role.Machine, Role.SchoolAdmin)
    fun createToken(context: RequestContext, request: CreateTokenRequest): CreateTokenResponse

    /**
     * Creates account with External provider and subject with org prefix. E.g "maxbrain:subject"
     *
     * @throws ServiceError.BadRequest if request role is not Teacher or Student.
     * @throws ServiceError.BadRequest if an account with subject already exist in store.
     */
    @RequireRole(Role.Machine, Role.SchoolAdmin)
    fun createAccount(context: RequestContext, request: CreateAccountRequest): CreateAccountResponse
}
