//[account-service-api](../../../index.md)/[classtime.service.account](../index.md)/[AccountService](index.md)

# AccountService

[jvm]\
interface [AccountService](index.md) : Service

Service that handles accounts and authorization and creates authentication tokens.

See https://ct.rocks/unified-authentication

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [jvm]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [accountExtension](account-extension.md) | [jvm]<br>@Public<br>abstract fun [accountExtension](account-extension.md)(context: RequestContext, request: &lt;Error class: unknown class&gt;): &lt;Error class: unknown class&gt;<br>Process pending accountExtension entity. As a result, the account receives an additional authentication method. Merges two accounts into a single one, if the authentication method references an email of an existing account. The main account will gain all accesses and privileges of the merged account. |
| [authorize](authorize.md) | [jvm]<br>@Public<br>abstract fun [authorize](authorize.md)(context: RequestContext, request: &lt;Error class: unknown class&gt;): &lt;Error class: unknown class&gt;<br>Verifies authentication information. Registers new Classtime accounts if needed. Creates a new JWT token that the user can use for authorizing requests. |
| [createAccount](create-account.md) | [jvm]<br>@RequireRole(allowedRoles = [Role.Machine, Role.SchoolAdmin])<br>abstract fun [createAccount](create-account.md)(context: RequestContext, request: &lt;Error class: unknown class&gt;): &lt;Error class: unknown class&gt;<br>Creates account with External provider and subject with org prefix. E.g &quot;maxbrain:subject&quot; |
| [createToken](create-token.md) | [jvm]<br>@RequireRole(allowedRoles = [Role.Machine, Role.SchoolAdmin])<br>abstract fun [createToken](create-token.md)(context: RequestContext, request: &lt;Error class: unknown class&gt;): &lt;Error class: unknown class&gt;<br>Generates token for account by given classtime id, role and permission. |
| [finishAccountCreation](finish-account-creation.md) | [jvm]<br>@RequireRole(allowedRoles = [Role.Teacher])<br>abstract fun [finishAccountCreation](finish-account-creation.md)(context: RequestContext, request: &lt;Error class: unknown class&gt;): &lt;Error class: unknown class&gt;<br>Creates new teacher in django and sets userProfile.isNew to false in case of success. |
| [getAccountInfo](get-account-info.md) | [jvm]<br>@Public<br>abstract fun [~~getAccountInfo~~](get-account-info.md)(context: RequestContext, request: &lt;Error class: unknown class&gt;): &lt;Error class: unknown class&gt; |
| [getMyAccountInfo](get-my-account-info.md) | [jvm]<br>@Public<br>abstract fun [getMyAccountInfo](get-my-account-info.md)(context: RequestContext, request: &lt;Error class: unknown class&gt;): &lt;Error class: unknown class&gt; |
| [getPrivateAccountData](get-private-account-data.md) | [jvm]<br>@RequireRole(allowedRoles = [Role.Machine])<br>abstract fun [getPrivateAccountData](get-private-account-data.md)(context: RequestContext, request: &lt;Error class: unknown class&gt;): &lt;Error class: unknown class&gt;<br>Return account data by id provided in request. It exposes account's private information, so must be limited internally for the Classtime. |
| [getPublicUserProfile](get-public-user-profile.md) | [jvm]<br>@RequireRole(allowedRoles = [Role.Teacher])<br>abstract fun [getPublicUserProfile](get-public-user-profile.md)(context: RequestContext, request: &lt;Error class: unknown class&gt;): &lt;Error class: unknown class&gt;<br>Return account's public profile data by id provided in request. |
| [getUserProfile](get-user-profile.md) | [jvm]<br>@RequireRole(allowedRoles = [Role.Teacher, Role.Machine])<br>abstract fun [~~getUserProfile~~](get-user-profile.md)(context: RequestContext, request: &lt;Error class: unknown class&gt;): &lt;Error class: unknown class&gt;<br>Return account's profile by id provided in request. |
| [login](login.md) | [jvm]<br>@Public<br>abstract fun [login](login.md)(context: RequestContext, request: &lt;Error class: unknown class&gt;): &lt;Error class: unknown class&gt;<br>Initiates a log in process. It will redirect the user to the authentication provider. |
| [logout](logout.md) | [jvm]<br>@Public<br>abstract fun [logout](logout.md)(context: RequestContext, request: &lt;Error class: unknown class&gt;): &lt;Error class: unknown class&gt;<br>Logs the user out by clearing authentication tokens. |
| [refreshToken](refresh-token.md) | [jvm]<br>@RequireRole(allowedRoles = [Role.Teacher])<br>abstract fun [refreshToken](refresh-token.md)(context: RequestContext, request: &lt;Error class: unknown class&gt;): &lt;Error class: unknown class&gt;<br>Refresh user's JWT token, by replacing old token with a newly created one. |
| [resetPassword](reset-password.md) | [jvm]<br>@Public<br>@RateLimit(limit = 30, unitCount = 1, chronoUnit = [ChronoUnit.HOURS](https://docs.oracle.com/javase/8/docs/api/java/time/temporal/ChronoUnit.HOURS.html))<br>abstract fun [resetPassword](reset-password.md)(context: RequestContext, request: &lt;Error class: unknown class&gt;): &lt;Error class: unknown class&gt;<br>Creates new EmailLinkVerification entity and send an email with specific text (reset/signup) and link to the page, where user can set new password. |
| [shutdown](index.md#-610305814%2FFunctions%2F1931141392) | [jvm]<br>open fun [shutdown](index.md#-610305814%2FFunctions%2F1931141392)() |
| [updateAccountInfo](update-account-info.md) | [jvm]<br>@RequireRole(allowedRoles = [Role.Teacher, Role.Student])<br>abstract fun [updateAccountInfo](update-account-info.md)(context: RequestContext, request: &lt;Error class: unknown class&gt;): &lt;Error class: unknown class&gt;<br>Updates part of the user's account info. |
