//[account-service-api](../../../../index.md)/[classtime.service.account](../../index.md)/[LoginStateKt](../index.md)/[Dsl](index.md)

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
| [accountExtension](account-extension.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getAccountExtension&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setAccountExtension&quot;)<br>var [accountExtension](account-extension.md): [AccountExtensionState](../../-account-extension-state/index.md)<br><code>.classtime.service.account.AccountExtensionState account_extension = 5;</code> |
| [csrfTokenHash](csrf-token-hash.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getCsrfTokenHash&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setCsrfTokenHash&quot;)<br>var [csrfTokenHash](csrf-token-hash.md): ByteString<br><code>bytes csrf_token_hash = 1;</code> |
| [loginRequest](login-request.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getLoginRequest&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setLoginRequest&quot;)<br>var [loginRequest](login-request.md): [LoginRequest](../../-login-request/index.md)<br><code>.classtime.service.account.LoginRequest login_request = 9;</code> |

## Functions

| Name | Summary |
|---|---|
| [clearAccountExtension](clear-account-extension.md) | [jvm]<br>fun [clearAccountExtension](clear-account-extension.md)()<br><code>.classtime.service.account.AccountExtensionState account_extension = 5;</code> |
| [clearCsrfTokenHash](clear-csrf-token-hash.md) | [jvm]<br>fun [clearCsrfTokenHash](clear-csrf-token-hash.md)()<br><code>bytes csrf_token_hash = 1;</code> |
| [clearLoginRequest](clear-login-request.md) | [jvm]<br>fun [clearLoginRequest](clear-login-request.md)()<br><code>.classtime.service.account.LoginRequest login_request = 9;</code> |
| [hasAccountExtension](has-account-extension.md) | [jvm]<br>fun [hasAccountExtension](has-account-extension.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><code>.classtime.service.account.AccountExtensionState account_extension = 5;</code> |
| [hasLoginRequest](has-login-request.md) | [jvm]<br>fun [hasLoginRequest](has-login-request.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><code>.classtime.service.account.LoginRequest login_request = 9;</code> |
