//[account-service-api](../../../../index.md)/[classtime.service.account](../../index.md)/[LoginRequest](../index.md)/[Builder](index.md)/[setAudiencePermissionBytes](set-audience-permission-bytes.md)

# setAudiencePermissionBytes

[jvm]\
open fun [setAudiencePermissionBytes](set-audience-permission-bytes.md)(value: ByteString): [LoginRequest.Builder](index.md)

```kotlin
Narrows token audience. Value is added as postfix to a token role's audience. 

```
`string audience_permission = 6;`

#### Return

This builder for chaining.

#### Parameters

jvm

| | |
|---|---|
| value | The bytes for audiencePermission to set. |
