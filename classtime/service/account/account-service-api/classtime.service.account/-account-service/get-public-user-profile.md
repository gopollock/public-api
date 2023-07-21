//[account-service-api](../../../index.md)/[classtime.service.account](../index.md)/[AccountService](index.md)/[getPublicUserProfile](get-public-user-profile.md)

# getPublicUserProfile

[jvm]\

@RequireRole(allowedRoles = [Role.Teacher])

abstract fun [getPublicUserProfile](get-public-user-profile.md)(context: RequestContext, request: [UserProfileRequest](../-user-profile-request/index.md)): [UserProfileResponse](../-user-profile-response/index.md)

Return account's public profile data by id provided in request.

#### Throws

| | |
|---|---|
| ServiceError.NotFound | there is no account with provided id. |
