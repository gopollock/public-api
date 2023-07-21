//[account-service-api](../../../../index.md)/[classtime.service.account](../../index.md)/[UpdateAccountInfoRequest](../index.md)/[Builder](index.md)/[setRemovedAuthenticationId](set-removed-authentication-id.md)

# setRemovedAuthenticationId

[jvm]\
open fun [setRemovedAuthenticationId](set-removed-authentication-id.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [UpdateAccountInfoRequest.Builder](index.md)

```kotlin
If set, the given AID will be removed from the account.
Returns error, if trying to remove primary AID.

```
`int32 removed_authentication_id = 2;`

#### Return

This builder for chaining.

#### Parameters

jvm

| | |
|---|---|
| value | The removedAuthenticationId to set. |
