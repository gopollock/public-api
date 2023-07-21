//[account-service-api](../../../index.md)/[classtime.service.account](../index.md)/[AccountService](index.md)/[refreshToken](refresh-token.md)

# refreshToken

[jvm]\

@RequireRole(allowedRoles = [Role.Teacher])

abstract fun [refreshToken](refresh-token.md)(context: RequestContext, request: &lt;Error class: unknown class&gt;): &lt;Error class: unknown class&gt;

Refresh user's JWT token, by replacing old token with a newly created one.

#### Return

a new token's creation and expiration timestamp data
