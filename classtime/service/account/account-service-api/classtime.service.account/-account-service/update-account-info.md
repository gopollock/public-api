//[account-service-api](../../../index.md)/[classtime.service.account](../index.md)/[AccountService](index.md)/[updateAccountInfo](update-account-info.md)

# updateAccountInfo

[jvm]\

@RequireRole(allowedRoles = [Role.Teacher, Role.Student])

abstract fun [updateAccountInfo](update-account-info.md)(context: RequestContext, request: [UpdateAccountInfoRequest](../-update-account-info-request/index.md)): [AccountInfoResponse](../-account-info-response/index.md)

Updates part of the user's account info.

#### Return

all information about the user's account.
