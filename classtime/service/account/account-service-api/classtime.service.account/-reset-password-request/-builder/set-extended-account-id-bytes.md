//[account-service-api](../../../../index.md)/[classtime.service.account](../../index.md)/[ResetPasswordRequest](../index.md)/[Builder](index.md)/[setExtendedAccountIdBytes](set-extended-account-id-bytes.md)

# setExtendedAccountIdBytes

[jvm]\
open fun [setExtendedAccountIdBytes](set-extended-account-id-bytes.md)(value: ByteString): [ResetPasswordRequest.Builder](index.md)

```kotlin
If set, asks to extend the account with given id. Only valid for sign ups. 

```
`string extended_account_id = 4;`

#### Return

This builder for chaining.

#### Parameters

jvm

| | |
|---|---|
| value | The bytes for extendedAccountId to set. |
