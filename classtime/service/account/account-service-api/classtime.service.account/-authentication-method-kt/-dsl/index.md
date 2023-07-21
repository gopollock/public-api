//[account-service-api](../../../../index.md)/[classtime.service.account](../../index.md)/[AuthenticationMethodKt](../index.md)/[Dsl](index.md)

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
| [email](email.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getEmail&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setEmail&quot;)<br>var [email](email.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br><code>string email = 2;</code> |
| [failedLoginAttempts](failed-login-attempts.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getFailedLoginAttempts&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setFailedLoginAttempts&quot;)<br>var [failedLoginAttempts](failed-login-attempts.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br><code>int32 failed_login_attempts = 6;</code> |
| [id](id.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getId&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setId&quot;)<br>var [id](id.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br><code>int32 id = 5;</code> |
| [lastSuccessLoginAt](last-success-login-at.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getLastSuccessLoginAt&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setLastSuccessLoginAt&quot;)<br>var [lastSuccessLoginAt](last-success-login-at.md): Timestamp<br><code>.google.protobuf.Timestamp last_success_login_at = 7;</code> |
| [passwordHashHash](password-hash-hash.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getPasswordHashHash&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setPasswordHashHash&quot;)<br>var [passwordHashHash](password-hash-hash.md): ByteString<br><pre> Additional fields required in case of SAML authentication, TBD </pre> |
| [provider](provider.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getProvider&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setProvider&quot;)<br>var [provider](provider.md): [AuthenticationProvider](../../-authentication-provider/index.md)<br><code>.classtime.service.account.AuthenticationProvider provider = 1;</code> |
| [secretsCase](secrets-case.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getSecretsCase&quot;)<br>val [secretsCase](secrets-case.md): [AuthenticationMethod.SecretsCase](../../-authentication-method/-secrets-case/index.md) |
| [subject](subject.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getSubject&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setSubject&quot;)<br>var [subject](subject.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br><pre> Unique identifier for the user in the given provider. </pre> |

## Functions

| Name | Summary |
|---|---|
| [clearEmail](clear-email.md) | [jvm]<br>fun [clearEmail](clear-email.md)()<br><code>string email = 2;</code> |
| [clearFailedLoginAttempts](clear-failed-login-attempts.md) | [jvm]<br>fun [clearFailedLoginAttempts](clear-failed-login-attempts.md)()<br><code>int32 failed_login_attempts = 6;</code> |
| [clearId](clear-id.md) | [jvm]<br>fun [clearId](clear-id.md)()<br><code>int32 id = 5;</code> |
| [clearLastSuccessLoginAt](clear-last-success-login-at.md) | [jvm]<br>fun [clearLastSuccessLoginAt](clear-last-success-login-at.md)()<br><code>.google.protobuf.Timestamp last_success_login_at = 7;</code> |
| [clearPasswordHashHash](clear-password-hash-hash.md) | [jvm]<br>fun [clearPasswordHashHash](clear-password-hash-hash.md)()<br><pre> Additional fields required in case of SAML authentication, TBD </pre> |
| [clearProvider](clear-provider.md) | [jvm]<br>fun [clearProvider](clear-provider.md)()<br><code>.classtime.service.account.AuthenticationProvider provider = 1;</code> |
| [clearSecrets](clear-secrets.md) | [jvm]<br>fun [clearSecrets](clear-secrets.md)() |
| [clearSubject](clear-subject.md) | [jvm]<br>fun [clearSubject](clear-subject.md)()<br><pre> Unique identifier for the user in the given provider. </pre> |
| [hasLastSuccessLoginAt](has-last-success-login-at.md) | [jvm]<br>fun [hasLastSuccessLoginAt](has-last-success-login-at.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><code>.google.protobuf.Timestamp last_success_login_at = 7;</code> |
| [hasPasswordHashHash](has-password-hash-hash.md) | [jvm]<br>fun [hasPasswordHashHash](has-password-hash-hash.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><pre> Additional fields required in case of SAML authentication, TBD </pre> |
