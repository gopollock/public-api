//[account-service-api](../../../index.md)/[classtime.service.account](../index.md)/[LoginRequestOrBuilder](index.md)/[getSuccessRedirectUrlBytes](get-success-redirect-url-bytes.md)

# getSuccessRedirectUrlBytes

[jvm]\
abstract fun [getSuccessRedirectUrlBytes](get-success-redirect-url-bytes.md)(): ByteString

```kotlin
Redirect url, where user will land after authentication process succeeds.
Must use the same protocol and host as classtime server.

```
`string success_redirect_url = 5;`

#### Return

The bytes for successRedirectUrl.
