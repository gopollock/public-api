//[account-service-api](../../../../index.md)/[classtime.service.account](../../index.md)/[AuthorizationRequestKt](../index.md)/[Dsl](index.md)

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
| [authInfoCase](auth-info-case.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getAuthInfoCase&quot;)<br>val [authInfoCase](auth-info-case.md): [AuthorizationRequest.AuthInfoCase](../../-authorization-request/-auth-info-case/index.md) |
| [emailPassword](email-password.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getEmailPassword&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setEmailPassword&quot;)<br>var [emailPassword](email-password.md): [EmailPasswordAuthInfo](../../-email-password-auth-info/index.md)<br><code>.classtime.service.account.EmailPasswordAuthInfo email_password = 2;</code> |
| [emailVerificationAuthInfo](email-verification-auth-info.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getEmailVerificationAuthInfo&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setEmailVerificationAuthInfo&quot;)<br>var [emailVerificationAuthInfo](email-verification-auth-info.md): [EmailVerificationAuthInfo](../../-email-verification-auth-info/index.md)<br><code>.classtime.service.account.EmailVerificationAuthInfo email_verification_auth_info = 8;</code> |
| [loginState](login-state.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getLoginState&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setLoginState&quot;)<br>var [loginState](login-state.md): [LoginState](../../-login-state/index.md)<br><code>.classtime.service.account.LoginState login_state = 4;</code> |
| [msTeams](ms-teams.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getMsTeams&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setMsTeams&quot;)<br>var [msTeams](ms-teams.md): [MsTeamsAuthInfo](../../-ms-teams-auth-info/index.md)<br><code>.classtime.service.account.MsTeamsAuthInfo ms_teams = 9;</code> |
| [nickname](nickname.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getNickname&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setNickname&quot;)<br>var [nickname](nickname.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br><code>string nickname = 7;</code> |
| [openIdConnect](open-id-connect.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getOpenIdConnect&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setOpenIdConnect&quot;)<br>var [openIdConnect](open-id-connect.md): [OpenIdConnectAuthInfo](../../-open-id-connect-auth-info/index.md)<br><code>.classtime.service.account.OpenIdConnectAuthInfo open_id_connect = 3;</code> |
| [samlResponse](saml-response.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getSamlResponse&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setSamlResponse&quot;)<br>var [samlResponse](saml-response.md): [SamlAuthInfo](../../-saml-auth-info/index.md)<br><code>.classtime.service.account.SamlAuthInfo saml_response = 6;</code> |
| [teamsUser](teams-user.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getTeamsUser&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setTeamsUser&quot;)<br>var [teamsUser](teams-user.md): [TeamsUserAuthInfo](../../-teams-user-auth-info/index.md)<br><code>.classtime.service.account.TeamsUserAuthInfo teams_user = 5;</code> |

## Functions

| Name | Summary |
|---|---|
| [clearAuthInfo](clear-auth-info.md) | [jvm]<br>fun [clearAuthInfo](clear-auth-info.md)() |
| [clearEmailPassword](clear-email-password.md) | [jvm]<br>fun [clearEmailPassword](clear-email-password.md)()<br><code>.classtime.service.account.EmailPasswordAuthInfo email_password = 2;</code> |
| [clearEmailVerificationAuthInfo](clear-email-verification-auth-info.md) | [jvm]<br>fun [clearEmailVerificationAuthInfo](clear-email-verification-auth-info.md)()<br><code>.classtime.service.account.EmailVerificationAuthInfo email_verification_auth_info = 8;</code> |
| [clearLoginState](clear-login-state.md) | [jvm]<br>fun [clearLoginState](clear-login-state.md)()<br><code>.classtime.service.account.LoginState login_state = 4;</code> |
| [clearMsTeams](clear-ms-teams.md) | [jvm]<br>fun [clearMsTeams](clear-ms-teams.md)()<br><code>.classtime.service.account.MsTeamsAuthInfo ms_teams = 9;</code> |
| [clearNickname](clear-nickname.md) | [jvm]<br>fun [clearNickname](clear-nickname.md)()<br><code>string nickname = 7;</code> |
| [clearOpenIdConnect](clear-open-id-connect.md) | [jvm]<br>fun [clearOpenIdConnect](clear-open-id-connect.md)()<br><code>.classtime.service.account.OpenIdConnectAuthInfo open_id_connect = 3;</code> |
| [clearSamlResponse](clear-saml-response.md) | [jvm]<br>fun [clearSamlResponse](clear-saml-response.md)()<br><code>.classtime.service.account.SamlAuthInfo saml_response = 6;</code> |
| [clearTeamsUser](clear-teams-user.md) | [jvm]<br>fun [clearTeamsUser](clear-teams-user.md)()<br><code>.classtime.service.account.TeamsUserAuthInfo teams_user = 5;</code> |
| [hasEmailPassword](has-email-password.md) | [jvm]<br>fun [hasEmailPassword](has-email-password.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><code>.classtime.service.account.EmailPasswordAuthInfo email_password = 2;</code> |
| [hasEmailVerificationAuthInfo](has-email-verification-auth-info.md) | [jvm]<br>fun [hasEmailVerificationAuthInfo](has-email-verification-auth-info.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><code>.classtime.service.account.EmailVerificationAuthInfo email_verification_auth_info = 8;</code> |
| [hasLoginState](has-login-state.md) | [jvm]<br>fun [hasLoginState](has-login-state.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><code>.classtime.service.account.LoginState login_state = 4;</code> |
| [hasMsTeams](has-ms-teams.md) | [jvm]<br>fun [hasMsTeams](has-ms-teams.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><code>.classtime.service.account.MsTeamsAuthInfo ms_teams = 9;</code> |
| [hasNickname](has-nickname.md) | [jvm]<br>fun [hasNickname](has-nickname.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><code>string nickname = 7;</code> |
| [hasOpenIdConnect](has-open-id-connect.md) | [jvm]<br>fun [hasOpenIdConnect](has-open-id-connect.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><code>.classtime.service.account.OpenIdConnectAuthInfo open_id_connect = 3;</code> |
| [hasSamlResponse](has-saml-response.md) | [jvm]<br>fun [hasSamlResponse](has-saml-response.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><code>.classtime.service.account.SamlAuthInfo saml_response = 6;</code> |
| [hasTeamsUser](has-teams-user.md) | [jvm]<br>fun [hasTeamsUser](has-teams-user.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><code>.classtime.service.account.TeamsUserAuthInfo teams_user = 5;</code> |
