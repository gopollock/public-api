//[account-service-api](../../../../index.md)/[classtime.service.account](../../index.md)/[LoginResponseKt](../index.md)/[Dsl](index.md)

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
| [loginState](login-state.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getLoginState&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setLoginState&quot;)<br>var [loginState](login-state.md): [LoginState](../../-login-state/index.md)<br><pre> If set, the client should pass along the state in the subsequent AuthorizationRequest. </pre> |
| [redirectUrl](redirect-url.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getRedirectUrl&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setRedirectUrl&quot;)<br>var [redirectUrl](redirect-url.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br><pre> If set, the client should redirect the browser to the given url. </pre> |

## Functions

| Name | Summary |
|---|---|
| [clearLoginState](clear-login-state.md) | [jvm]<br>fun [clearLoginState](clear-login-state.md)()<br><pre> If set, the client should pass along the state in the subsequent AuthorizationRequest. </pre> |
| [clearRedirectUrl](clear-redirect-url.md) | [jvm]<br>fun [clearRedirectUrl](clear-redirect-url.md)()<br><pre> If set, the client should redirect the browser to the given url. </pre> |
| [hasLoginState](has-login-state.md) | [jvm]<br>fun [hasLoginState](has-login-state.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><pre> If set, the client should pass along the state in the subsequent AuthorizationRequest. </pre> |
