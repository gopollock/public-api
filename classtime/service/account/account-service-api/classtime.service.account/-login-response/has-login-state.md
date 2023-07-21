//[account-service-api](../../../index.md)/[classtime.service.account](../index.md)/[LoginResponse](index.md)/[hasLoginState](has-login-state.md)

# hasLoginState

[jvm]\
open fun [hasLoginState](has-login-state.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

```kotlin
If set, the client should pass along the state in the subsequent AuthorizationRequest.

```
`.classtime.service.account.LoginState login_state = 2;`

#### Return

Whether the loginState field is set.
