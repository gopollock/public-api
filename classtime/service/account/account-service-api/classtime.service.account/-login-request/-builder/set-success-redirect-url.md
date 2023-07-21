//[account-service-api](../../../../index.md)/[classtime.service.account](../../index.md)/[LoginRequest](../index.md)/[Builder](index.md)/[setSuccessRedirectUrl](set-success-redirect-url.md)

# setSuccessRedirectUrl

[jvm]\
open fun [setSuccessRedirectUrl](set-success-redirect-url.md)(value: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [LoginRequest.Builder](index.md)

```kotlin
Redirect url, where user will land after authentication process succeeds.
Must use the same protocol and host as classtime server.

```
`string success_redirect_url = 5;`

#### Return

This builder for chaining.

#### Parameters

jvm

| | |
|---|---|
| value | The successRedirectUrl to set. |
