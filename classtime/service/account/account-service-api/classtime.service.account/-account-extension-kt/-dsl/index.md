//[account-service-api](../../../../index.md)/[classtime.service.account](../../index.md)/[AccountExtensionKt](../index.md)/[Dsl](index.md)

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
| [accountExtensionSecret](account-extension-secret.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getAccountExtensionSecret&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setAccountExtensionSecret&quot;)<br>var [accountExtensionSecret](account-extension-secret.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br><code>string account_extension_secret = 3;</code> |
| [accountId](account-id.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getAccountId&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setAccountId&quot;)<br>var [accountId](account-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br><pre> Id of account that requested an extension. </pre> |
| [authenticationMethod](authentication-method.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getAuthenticationMethod&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setAuthenticationMethod&quot;)<br>var [authenticationMethod](authentication-method.md): [AuthenticationMethod](../../-authentication-method/index.md)<br><pre> Source of authentication details without direct connection to some user account. Its id fields is unreliable. </pre> |
| [expirationDate](expiration-date.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getExpirationDate&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setExpirationDate&quot;)<br>var [expirationDate](expiration-date.md): Timestamp<br><code>.google.protobuf.Timestamp expiration_date = 4;</code> |

## Functions

| Name | Summary |
|---|---|
| [clearAccountExtensionSecret](clear-account-extension-secret.md) | [jvm]<br>fun [clearAccountExtensionSecret](clear-account-extension-secret.md)()<br><code>string account_extension_secret = 3;</code> |
| [clearAccountId](clear-account-id.md) | [jvm]<br>fun [clearAccountId](clear-account-id.md)()<br><pre> Id of account that requested an extension. </pre> |
| [clearAuthenticationMethod](clear-authentication-method.md) | [jvm]<br>fun [clearAuthenticationMethod](clear-authentication-method.md)()<br><pre> Source of authentication details without direct connection to some user account. Its id fields is unreliable. </pre> |
| [clearExpirationDate](clear-expiration-date.md) | [jvm]<br>fun [clearExpirationDate](clear-expiration-date.md)()<br><code>.google.protobuf.Timestamp expiration_date = 4;</code> |
| [hasAuthenticationMethod](has-authentication-method.md) | [jvm]<br>fun [hasAuthenticationMethod](has-authentication-method.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><pre> Source of authentication details without direct connection to some user account. Its id fields is unreliable. </pre> |
| [hasExpirationDate](has-expiration-date.md) | [jvm]<br>fun [hasExpirationDate](has-expiration-date.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><code>.google.protobuf.Timestamp expiration_date = 4;</code> |
