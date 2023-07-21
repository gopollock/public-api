//[account-service-api](../../../../index.md)/[classtime.service.account](../../index.md)/[ResetPasswordRequestKt](../index.md)/[Dsl](index.md)

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
| [email](email.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getEmail&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setEmail&quot;)<br>var [email](email.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br><code>string email = 1;</code> |
| [extendedAccountId](extended-account-id.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getExtendedAccountId&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setExtendedAccountId&quot;)<br>var [extendedAccountId](extended-account-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br><pre> If set, asks to extend the account with given id. Only valid for sign ups. </pre> |
| [isSignup](is-signup.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getIsSignup&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setIsSignup&quot;)<br>var [isSignup](is-signup.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><pre> ResetPassword endpoint is used both for reset password operation and signup. </pre> |
| [role](role.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getRole&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setRole&quot;)<br>var [role](role.md): Role<br><code>.classtime.service.common.Role role = 5;</code> |

## Functions

| Name | Summary |
|---|---|
| [clearEmail](clear-email.md) | [jvm]<br>fun [clearEmail](clear-email.md)()<br><code>string email = 1;</code> |
| [clearExtendedAccountId](clear-extended-account-id.md) | [jvm]<br>fun [clearExtendedAccountId](clear-extended-account-id.md)()<br><pre> If set, asks to extend the account with given id. Only valid for sign ups. </pre> |
| [clearIsSignup](clear-is-signup.md) | [jvm]<br>fun [clearIsSignup](clear-is-signup.md)()<br><pre> ResetPassword endpoint is used both for reset password operation and signup. </pre> |
| [clearRole](clear-role.md) | [jvm]<br>fun [clearRole](clear-role.md)()<br><code>.classtime.service.common.Role role = 5;</code> |
