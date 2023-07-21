//[account-service-api](../../../../index.md)/[classtime.service.account](../../index.md)/[CreateAccountRequestKt](../index.md)/[Dsl](index.md)

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
| [locale](locale.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getLocale&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setLocale&quot;)<br>var [locale](locale.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br><code>string locale = 4;</code> |
| [role](role.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getRole&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setRole&quot;)<br>var [role](role.md): Role<br><code>.classtime.service.common.Role role = 1;</code> |
| [subject](subject.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getSubject&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setSubject&quot;)<br>var [subject](subject.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br><pre> Unique identifier for the user in the given provider. </pre> |
| [userProfile](user-profile.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getUserProfile&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setUserProfile&quot;)<br>var [userProfile](user-profile.md): [UserProfile](../../-user-profile/index.md)<br><code>.classtime.service.account.UserProfile user_profile = 2;</code> |

## Functions

| Name | Summary |
|---|---|
| [clearLocale](clear-locale.md) | [jvm]<br>fun [clearLocale](clear-locale.md)()<br><code>string locale = 4;</code> |
| [clearRole](clear-role.md) | [jvm]<br>fun [clearRole](clear-role.md)()<br><code>.classtime.service.common.Role role = 1;</code> |
| [clearSubject](clear-subject.md) | [jvm]<br>fun [clearSubject](clear-subject.md)()<br><pre> Unique identifier for the user in the given provider. </pre> |
| [clearUserProfile](clear-user-profile.md) | [jvm]<br>fun [clearUserProfile](clear-user-profile.md)()<br><code>.classtime.service.account.UserProfile user_profile = 2;</code> |
| [hasUserProfile](has-user-profile.md) | [jvm]<br>fun [hasUserProfile](has-user-profile.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><code>.classtime.service.account.UserProfile user_profile = 2;</code> |
