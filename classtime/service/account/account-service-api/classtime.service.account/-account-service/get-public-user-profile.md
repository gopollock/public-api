//[account-service-api](../../../index.md)/[classtime.service.account](../index.md)/[AccountService](index.md)/[getPublicUserProfile](get-public-user-profile.md)

# getPublicUserProfile

[jvm]\

@RequireRole(allowedRoles = [Role.Teacher])

abstract fun [getPublicUserProfile](get-public-user-profile.md)(context: RequestContext, request: &lt;Error class: unknown class&gt;): &lt;Error class: unknown class&gt;

Return account's public profile data by id provided in request.

#### Throws

| | |
|---|---|
| ServiceError.NotFound | there is no account with provided id. |
