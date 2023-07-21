//[account-service-api](../../../../index.md)/[classtime.service.account](../../index.md)/[LoginRequestKt](../index.md)/[Dsl](index.md)

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
| [audiencePermission](audience-permission.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getAudiencePermission&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setAudiencePermission&quot;)<br>var [audiencePermission](audience-permission.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br><pre> Narrows token audience. Value is added as postfix to a token role's audience. </pre> |
| [extendedAccountId](extended-account-id.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getExtendedAccountId&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setExtendedAccountId&quot;)<br>var [extendedAccountId](extended-account-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br><code>string extended_account_id = 3;</code> |
| [loginInfoCase](login-info-case.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getLoginInfoCase&quot;)<br>val [loginInfoCase](login-info-case.md): [LoginRequest.LoginInfoCase](../../-login-request/-login-info-case/index.md) |
| [openIdConnect](open-id-connect.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getOpenIdConnect&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setOpenIdConnect&quot;)<br>var [openIdConnect](open-id-connect.md): [OpenIdConnectLoginInfo](../../-open-id-connect-login-info/index.md)<br><code>.classtime.service.account.OpenIdConnectLoginInfo open_id_connect = 7;</code> |
| [provider](provider.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getProvider&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setProvider&quot;)<br>var [provider](provider.md): [AuthenticationProvider](../../-authentication-provider/index.md)<br><code>.classtime.service.account.AuthenticationProvider provider = 1;</code> |
| [role](role.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getRole&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setRole&quot;)<br>var [role](role.md): Role<br><code>.classtime.service.common.Role role = 4;</code> |
| [successRedirectUrl](success-redirect-url.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getSuccessRedirectUrl&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setSuccessRedirectUrl&quot;)<br>var [successRedirectUrl](success-redirect-url.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br><pre> Redirect url, where user will land after authentication process succeeds. Must use the same protocol and host as classtime server. </pre> |
| [tokenSource](token-source.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getTokenSource&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setTokenSource&quot;)<br>var [tokenSource](token-source.md): [AuthTokenSource](../../-auth-token-source/index.md)<br><pre> Defines where client will expect to find a token. </pre> |

## Functions

| Name | Summary |
|---|---|
| [clearAudiencePermission](clear-audience-permission.md) | [jvm]<br>fun [clearAudiencePermission](clear-audience-permission.md)()<br><pre> Narrows token audience. Value is added as postfix to a token role's audience. </pre> |
| [clearExtendedAccountId](clear-extended-account-id.md) | [jvm]<br>fun [clearExtendedAccountId](clear-extended-account-id.md)()<br><code>string extended_account_id = 3;</code> |
| [clearLoginInfo](clear-login-info.md) | [jvm]<br>fun [clearLoginInfo](clear-login-info.md)() |
| [clearOpenIdConnect](clear-open-id-connect.md) | [jvm]<br>fun [clearOpenIdConnect](clear-open-id-connect.md)()<br><code>.classtime.service.account.OpenIdConnectLoginInfo open_id_connect = 7;</code> |
| [clearProvider](clear-provider.md) | [jvm]<br>fun [clearProvider](clear-provider.md)()<br><code>.classtime.service.account.AuthenticationProvider provider = 1;</code> |
| [clearRole](clear-role.md) | [jvm]<br>fun [clearRole](clear-role.md)()<br><code>.classtime.service.common.Role role = 4;</code> |
| [clearSuccessRedirectUrl](clear-success-redirect-url.md) | [jvm]<br>fun [clearSuccessRedirectUrl](clear-success-redirect-url.md)()<br><pre> Redirect url, where user will land after authentication process succeeds. Must use the same protocol and host as classtime server. </pre> |
| [clearTokenSource](clear-token-source.md) | [jvm]<br>fun [clearTokenSource](clear-token-source.md)()<br><pre> Defines where client will expect to find a token. </pre> |
| [hasOpenIdConnect](has-open-id-connect.md) | [jvm]<br>fun [hasOpenIdConnect](has-open-id-connect.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><code>.classtime.service.account.OpenIdConnectLoginInfo open_id_connect = 7;</code> |
