//[account-service-api](../../../../index.md)/[classtime.service.account](../../index.md)/[UpdateAccountInfoRequestKt](../index.md)/[Dsl](index.md)

# Dsl

[jvm]\
class [Dsl](index.md)

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [jvm]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [primaryAuthenticationId](primary-authentication-id.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getPrimaryAuthenticationId&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setPrimaryAuthenticationId&quot;)<br>var [primaryAuthenticationId](primary-authentication-id.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br><pre> If set, request to change the primary AID. </pre> |
| [removedAuthenticationId](removed-authentication-id.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getRemovedAuthenticationId&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setRemovedAuthenticationId&quot;)<br>var [removedAuthenticationId](removed-authentication-id.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br><pre> If set, the given AID will be removed from the account. Returns error, if trying to remove primary AID. </pre> |
| [updateCase](update-case.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getUpdateCase&quot;)<br>val [updateCase](update-case.md): [UpdateAccountInfoRequest.UpdateCase](../../-update-account-info-request/-update-case/index.md) |
| [userProfile](user-profile.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getUserProfile&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setUserProfile&quot;)<br>var [userProfile](user-profile.md): [UserProfile](../../-user-profile/index.md)<br><pre> If set, overwrites all fields of the user profile. </pre> |

## Functions

| Name | Summary |
|---|---|
| [clearPrimaryAuthenticationId](clear-primary-authentication-id.md) | [jvm]<br>fun [clearPrimaryAuthenticationId](clear-primary-authentication-id.md)()<br><pre> If set, request to change the primary AID. </pre> |
| [clearRemovedAuthenticationId](clear-removed-authentication-id.md) | [jvm]<br>fun [clearRemovedAuthenticationId](clear-removed-authentication-id.md)()<br><pre> If set, the given AID will be removed from the account. Returns error, if trying to remove primary AID. </pre> |
| [clearUpdate](clear-update.md) | [jvm]<br>fun [clearUpdate](clear-update.md)() |
| [clearUserProfile](clear-user-profile.md) | [jvm]<br>fun [clearUserProfile](clear-user-profile.md)()<br><pre> If set, overwrites all fields of the user profile. </pre> |
| [hasPrimaryAuthenticationId](has-primary-authentication-id.md) | [jvm]<br>fun [hasPrimaryAuthenticationId](has-primary-authentication-id.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><pre> If set, request to change the primary AID. </pre> |
| [hasRemovedAuthenticationId](has-removed-authentication-id.md) | [jvm]<br>fun [hasRemovedAuthenticationId](has-removed-authentication-id.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><pre> If set, the given AID will be removed from the account. Returns error, if trying to remove primary AID. </pre> |
| [hasUserProfile](has-user-profile.md) | [jvm]<br>fun [hasUserProfile](has-user-profile.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><pre> If set, overwrites all fields of the user profile. </pre> |
