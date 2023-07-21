//[account-service-api](../../../../index.md)/[classtime.service.account](../../index.md)/[EmailPasswordAuthInfoKt](../index.md)/[Dsl](index.md)

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
| [emailLinkSecretId](email-link-secret-id.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getEmailLinkSecretId&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setEmailLinkSecretId&quot;)<br>var [emailLinkSecretId](email-link-secret-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br><pre> Reference to EmailLinkVerification entity. </pre> |
| [passwordHash](password-hash.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getPasswordHash&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setPasswordHash&quot;)<br>var [passwordHash](password-hash.md): ByteString<br><code>bytes password_hash = 2;</code> |
| [token](token.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getToken&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setToken&quot;)<br>var [token](token.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br><pre> Email verification secret query parameter. </pre> |

## Functions

| Name | Summary |
|---|---|
| [clearEmail](clear-email.md) | [jvm]<br>fun [clearEmail](clear-email.md)()<br><code>string email = 1;</code> |
| [clearEmailLinkSecretId](clear-email-link-secret-id.md) | [jvm]<br>fun [clearEmailLinkSecretId](clear-email-link-secret-id.md)()<br><pre> Reference to EmailLinkVerification entity. </pre> |
| [clearPasswordHash](clear-password-hash.md) | [jvm]<br>fun [clearPasswordHash](clear-password-hash.md)()<br><code>bytes password_hash = 2;</code> |
| [clearToken](clear-token.md) | [jvm]<br>fun [clearToken](clear-token.md)()<br><pre> Email verification secret query parameter. </pre> |
