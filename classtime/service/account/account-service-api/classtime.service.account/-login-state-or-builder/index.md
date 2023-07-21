//[account-service-api](../../../index.md)/[classtime.service.account](../index.md)/[LoginStateOrBuilder](index.md)

# LoginStateOrBuilder

interface [LoginStateOrBuilder](index.md) : MessageOrBuilder

#### Inheritors

| |
|---|
| [LoginState](../-login-state/index.md) |
| [Builder](../-login-state/-builder/index.md) |

## Functions

| Name | Summary |
|---|---|
| [findInitializationErrors](../../classtime.service.account.event/-signup-event-or-builder/index.md#1227463831%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [findInitializationErrors](../../classtime.service.account.event/-signup-event-or-builder/index.md#1227463831%2FFunctions%2F1931141392)(): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt; |
| [getAccountExtension](get-account-extension.md) | [jvm]<br>abstract fun [getAccountExtension](get-account-extension.md)(): [AccountExtensionState](../-account-extension-state/index.md)<br>`.classtime.service.account.AccountExtensionState account_extension = 5;` |
| [getAccountExtensionOrBuilder](get-account-extension-or-builder.md) | [jvm]<br>abstract fun [getAccountExtensionOrBuilder](get-account-extension-or-builder.md)(): [AccountExtensionStateOrBuilder](../-account-extension-state-or-builder/index.md)<br>`.classtime.service.account.AccountExtensionState account_extension = 5;` |
| [getAllFields](../../classtime.service.account.event/-signup-event-or-builder/index.md#-1735213033%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getAllFields](../../classtime.service.account.event/-signup-event-or-builder/index.md#-1735213033%2FFunctions%2F1931141392)(): [Map](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)&lt;Descriptors.FieldDescriptor, [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; |
| [getCsrfTokenHash](get-csrf-token-hash.md) | [jvm]<br>abstract fun [getCsrfTokenHash](get-csrf-token-hash.md)(): ByteString<br>`bytes csrf_token_hash = 1;` |
| [getDefaultInstanceForType](../../classtime.service.account.event/-password-reset-event/-builder/index.md#-889905270%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getDefaultInstanceForType](../../classtime.service.account.event/-password-reset-event/-builder/index.md#-889905270%2FFunctions%2F1931141392)(): MessageLite<br>abstract fun [getDefaultInstanceForType](../../classtime.service.account.event/-signup-event-or-builder/index.md#1172508988%2FFunctions%2F1931141392)(): Message |
| [getDescriptorForType](../../classtime.service.account.event/-signup-event-or-builder/index.md#-2023656483%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getDescriptorForType](../../classtime.service.account.event/-signup-event-or-builder/index.md#-2023656483%2FFunctions%2F1931141392)(): Descriptors.Descriptor |
| [getField](../../classtime.service.account.event/-signup-event-or-builder/index.md#-728711289%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getField](../../classtime.service.account.event/-signup-event-or-builder/index.md#-728711289%2FFunctions%2F1931141392)(p: Descriptors.FieldDescriptor): [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [getInitializationErrorString](../../classtime.service.account.event/-signup-event-or-builder/index.md#-106143432%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getInitializationErrorString](../../classtime.service.account.event/-signup-event-or-builder/index.md#-106143432%2FFunctions%2F1931141392)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [getLoginRequest](get-login-request.md) | [jvm]<br>abstract fun [getLoginRequest](get-login-request.md)(): [LoginRequest](../-login-request/index.md)<br>`.classtime.service.account.LoginRequest login_request = 9;` |
| [getLoginRequestOrBuilder](get-login-request-or-builder.md) | [jvm]<br>abstract fun [getLoginRequestOrBuilder](get-login-request-or-builder.md)(): [LoginRequestOrBuilder](../-login-request-or-builder/index.md)<br>`.classtime.service.account.LoginRequest login_request = 9;` |
| [getOneofFieldDescriptor](../../classtime.service.account.event/-signup-event-or-builder/index.md#1767160798%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getOneofFieldDescriptor](../../classtime.service.account.event/-signup-event-or-builder/index.md#1767160798%2FFunctions%2F1931141392)(p: Descriptors.OneofDescriptor): Descriptors.FieldDescriptor |
| [getRepeatedField](../../classtime.service.account.event/-signup-event-or-builder/index.md#1425494465%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getRepeatedField](../../classtime.service.account.event/-signup-event-or-builder/index.md#1425494465%2FFunctions%2F1931141392)(p: Descriptors.FieldDescriptor, p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [getRepeatedFieldCount](../../classtime.service.account.event/-signup-event-or-builder/index.md#-950528252%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getRepeatedFieldCount](../../classtime.service.account.event/-signup-event-or-builder/index.md#-950528252%2FFunctions%2F1931141392)(p: Descriptors.FieldDescriptor): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getUnknownFields](../../classtime.service.account.event/-signup-event-or-builder/index.md#-1388384690%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getUnknownFields](../../classtime.service.account.event/-signup-event-or-builder/index.md#-1388384690%2FFunctions%2F1931141392)(): UnknownFieldSet |
| [hasAccountExtension](has-account-extension.md) | [jvm]<br>abstract fun [hasAccountExtension](has-account-extension.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>`.classtime.service.account.AccountExtensionState account_extension = 5;` |
| [hasField](../../classtime.service.account.event/-signup-event-or-builder/index.md#2095008451%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [hasField](../../classtime.service.account.event/-signup-event-or-builder/index.md#2095008451%2FFunctions%2F1931141392)(p: Descriptors.FieldDescriptor): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hasLoginRequest](has-login-request.md) | [jvm]<br>abstract fun [hasLoginRequest](has-login-request.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>`.classtime.service.account.LoginRequest login_request = 9;` |
| [hasOneof](../../classtime.service.account.event/-signup-event-or-builder/index.md#687391779%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [hasOneof](../../classtime.service.account.event/-signup-event-or-builder/index.md#687391779%2FFunctions%2F1931141392)(p: Descriptors.OneofDescriptor): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isInitialized](../../classtime.service.account.event/-signup-event-or-builder/index.md#-786502173%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [isInitialized](../../classtime.service.account.event/-signup-event-or-builder/index.md#-786502173%2FFunctions%2F1931141392)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
