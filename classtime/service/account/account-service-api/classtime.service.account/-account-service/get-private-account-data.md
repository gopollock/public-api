//[account-service-api](../../../index.md)/[classtime.service.account](../index.md)/[AccountService](index.md)/[getPrivateAccountData](get-private-account-data.md)

# getPrivateAccountData

[jvm]\

@RequireRole(allowedRoles = [Role.Machine])

abstract fun [getPrivateAccountData](get-private-account-data.md)(context: RequestContext, request: [GetPrivateAccountDataRequest](../-get-private-account-data-request/index.md)): [GetPrivateAccountDataResponse](../-get-private-account-data-response/index.md)

Return account data by id provided in request. It exposes account's private information, so must be limited internally for the Classtime.

If client requires his own data use [AccountService.getMyAccountInfo](get-my-account-info.md).

#### Throws

| | |
|---|---|
| ServiceError.NotFound | there is no account with provided id. |
