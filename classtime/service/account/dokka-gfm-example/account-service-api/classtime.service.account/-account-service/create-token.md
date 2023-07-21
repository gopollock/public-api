//[account-service-api](../../../index.md)/[classtime.service.account](../index.md)/[AccountService](index.md)/[createToken](create-token.md)

# createToken

[jvm]\

@RequireRole(allowedRoles = [Role.Machine, Role.SchoolAdmin])

abstract fun [createToken](create-token.md)(context: RequestContext, request: &lt;Error class: unknown class&gt;): &lt;Error class: unknown class&gt;

Generates token for account by given classtime id, role and permission.

#### Throws

| | |
|---|---|
| ServiceError.NotFound | if account does not exist in store. |
