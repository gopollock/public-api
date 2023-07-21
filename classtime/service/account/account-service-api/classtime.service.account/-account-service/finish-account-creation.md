//[account-service-api](../../../index.md)/[classtime.service.account](../index.md)/[AccountService](index.md)/[finishAccountCreation](finish-account-creation.md)

# finishAccountCreation

[jvm]\

@RequireRole(allowedRoles = [Role.Teacher])

abstract fun [finishAccountCreation](finish-account-creation.md)(context: RequestContext, request: &lt;Error class: unknown class&gt;): &lt;Error class: unknown class&gt;

Creates new teacher in django and sets userProfile.isNew to false in case of success.

#### Throws

| | |
|---|---|
| ServiceError.BadRequest | if django teacher was not created for any reason (usually related to     teacher itself). |
