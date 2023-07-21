//[account-service-api](../../../index.md)/[classtime.service.account](../index.md)/[ResetPasswordRequestOrBuilder](index.md)

# ResetPasswordRequestOrBuilder

interface [ResetPasswordRequestOrBuilder](index.md) : MessageOrBuilder

#### Inheritors

| |
|---|
| [ResetPasswordRequest](../-reset-password-request/index.md) |
| [Builder](../-reset-password-request/-builder/index.md) |

## Functions

| Name | Summary |
|---|---|
| [findInitializationErrors](../../classtime.service.account.event/-signup-event-or-builder/index.md#1227463831%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [findInitializationErrors](../../classtime.service.account.event/-signup-event-or-builder/index.md#1227463831%2FFunctions%2F1931141392)(): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt; |
| [getAllFields](../../classtime.service.account.event/-signup-event-or-builder/index.md#-1735213033%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getAllFields](../../classtime.service.account.event/-signup-event-or-builder/index.md#-1735213033%2FFunctions%2F1931141392)(): [Map](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)&lt;Descriptors.FieldDescriptor, [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; |
| [getDefaultInstanceForType](../../classtime.service.account.event/-password-reset-event/-builder/index.md#-889905270%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getDefaultInstanceForType](../../classtime.service.account.event/-password-reset-event/-builder/index.md#-889905270%2FFunctions%2F1931141392)(): MessageLite<br>abstract fun [getDefaultInstanceForType](../../classtime.service.account.event/-signup-event-or-builder/index.md#1172508988%2FFunctions%2F1931141392)(): Message |
| [getDescriptorForType](../../classtime.service.account.event/-signup-event-or-builder/index.md#-2023656483%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getDescriptorForType](../../classtime.service.account.event/-signup-event-or-builder/index.md#-2023656483%2FFunctions%2F1931141392)(): Descriptors.Descriptor |
| [getEmail](get-email.md) | [jvm]<br>abstract fun [getEmail](get-email.md)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)<br>`string email = 1;` |
| [getEmailBytes](get-email-bytes.md) | [jvm]<br>abstract fun [getEmailBytes](get-email-bytes.md)(): ByteString<br>`string email = 1;` |
| [getExtendedAccountId](get-extended-account-id.md) | [jvm]<br>abstract fun [getExtendedAccountId](get-extended-account-id.md)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)<br>```kotlin If set, asks to extend the account with given id. Only valid for sign ups. <br>``` `string extended_account_id = 4;` |
| [getExtendedAccountIdBytes](get-extended-account-id-bytes.md) | [jvm]<br>abstract fun [getExtendedAccountIdBytes](get-extended-account-id-bytes.md)(): ByteString<br>```kotlin If set, asks to extend the account with given id. Only valid for sign ups. <br>``` `string extended_account_id = 4;` |
| [getField](../../classtime.service.account.event/-signup-event-or-builder/index.md#-728711289%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getField](../../classtime.service.account.event/-signup-event-or-builder/index.md#-728711289%2FFunctions%2F1931141392)(p: Descriptors.FieldDescriptor): [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [getInitializationErrorString](../../classtime.service.account.event/-signup-event-or-builder/index.md#-106143432%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getInitializationErrorString](../../classtime.service.account.event/-signup-event-or-builder/index.md#-106143432%2FFunctions%2F1931141392)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [getIsSignup](get-is-signup.md) | [jvm]<br>abstract fun [getIsSignup](get-is-signup.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>```kotlin ResetPassword endpoint is used both for reset password operation and signup. <br>``` `bool is_signup = 2;` |
| [getOneofFieldDescriptor](../../classtime.service.account.event/-signup-event-or-builder/index.md#1767160798%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getOneofFieldDescriptor](../../classtime.service.account.event/-signup-event-or-builder/index.md#1767160798%2FFunctions%2F1931141392)(p: Descriptors.OneofDescriptor): Descriptors.FieldDescriptor |
| [getRepeatedField](../../classtime.service.account.event/-signup-event-or-builder/index.md#1425494465%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getRepeatedField](../../classtime.service.account.event/-signup-event-or-builder/index.md#1425494465%2FFunctions%2F1931141392)(p: Descriptors.FieldDescriptor, p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [getRepeatedFieldCount](../../classtime.service.account.event/-signup-event-or-builder/index.md#-950528252%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getRepeatedFieldCount](../../classtime.service.account.event/-signup-event-or-builder/index.md#-950528252%2FFunctions%2F1931141392)(p: Descriptors.FieldDescriptor): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getRole](get-role.md) | [jvm]<br>abstract fun [getRole](get-role.md)(): Role<br>`.classtime.service.common.Role role = 5;` |
| [getRoleValue](get-role-value.md) | [jvm]<br>abstract fun [getRoleValue](get-role-value.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>`.classtime.service.common.Role role = 5;` |
| [getUnknownFields](../../classtime.service.account.event/-signup-event-or-builder/index.md#-1388384690%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getUnknownFields](../../classtime.service.account.event/-signup-event-or-builder/index.md#-1388384690%2FFunctions%2F1931141392)(): UnknownFieldSet |
| [hasField](../../classtime.service.account.event/-signup-event-or-builder/index.md#2095008451%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [hasField](../../classtime.service.account.event/-signup-event-or-builder/index.md#2095008451%2FFunctions%2F1931141392)(p: Descriptors.FieldDescriptor): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hasOneof](../../classtime.service.account.event/-signup-event-or-builder/index.md#687391779%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [hasOneof](../../classtime.service.account.event/-signup-event-or-builder/index.md#687391779%2FFunctions%2F1931141392)(p: Descriptors.OneofDescriptor): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isInitialized](../../classtime.service.account.event/-signup-event-or-builder/index.md#-786502173%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [isInitialized](../../classtime.service.account.event/-signup-event-or-builder/index.md#-786502173%2FFunctions%2F1931141392)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
