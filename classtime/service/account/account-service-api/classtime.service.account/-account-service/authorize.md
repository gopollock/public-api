//[account-service-api](../../../index.md)/[classtime.service.account](../index.md)/[AccountService](index.md)/[authorize](authorize.md)

# authorize

[jvm]\

@Public

abstract fun [authorize](authorize.md)(context: RequestContext, request: [AuthorizationRequest](../-authorization-request/index.md)): [AuthorizationResponse](../-authorization-response/index.md)

Verifies authentication information. Registers new Classtime accounts if needed. Creates a new JWT token that the user can use for authorizing requests.

#### Return

response containing the url to redirect the user to.

#### Throws

| | |
|---|---|
| ServiceError.BadRequest | if emailPassword did not provide password hash. |
| ServiceError.NotFound | if emailPassword provided secret id is not linked to any verification or expired. |
| ServiceError.Unauthorized | if emailPassword provided password hash is mismatched with hash from account. |
| ServiceError.Forbidden | if account reach max failed attempts and block duration is not exceeded. |
