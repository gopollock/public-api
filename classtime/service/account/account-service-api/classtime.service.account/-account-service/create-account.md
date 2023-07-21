//[account-service-api](../../../index.md)/[classtime.service.account](../index.md)/[AccountService](index.md)/[createAccount](create-account.md)

# createAccount

[jvm]\

@RequireRole(allowedRoles = [Role.Machine, Role.SchoolAdmin])

abstract fun [createAccount](create-account.md)(context: RequestContext, request: &lt;Error class: unknown class&gt;): &lt;Error class: unknown class&gt;

Creates account with External provider and subject with org prefix. E.g &quot;maxbrain:subject&quot;

#### Throws

| | |
|---|---|
| ServiceError.BadRequest | if an account with subject already exist in store. |
