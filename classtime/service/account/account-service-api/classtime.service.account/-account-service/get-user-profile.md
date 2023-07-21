//[account-service-api](../../../index.md)/[classtime.service.account](../index.md)/[AccountService](index.md)/[getUserProfile](get-user-profile.md)

# getUserProfile

[jvm]\

@RequireRole(allowedRoles = [Role.Teacher, Role.Machine])

abstract fun [~~getUserProfile~~](get-user-profile.md)(context: RequestContext, request: [UserProfileRequest](../-user-profile-request/index.md)): [UserProfileResponse](../-user-profile-response/index.md)

---

### Deprecated

Use getPublicUserProfile or getPrivateAccountData

---

Return account's profile by id provided in request.

#### Throws

| | |
|---|---|
| ServiceError.NotFound | there is no account with provided id. |
