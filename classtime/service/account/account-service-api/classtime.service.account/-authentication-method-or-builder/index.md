//[account-service-api](../../../index.md)/[classtime.service.account](../index.md)/[AuthenticationMethodOrBuilder](index.md)

# AuthenticationMethodOrBuilder

interface [AuthenticationMethodOrBuilder](index.md) : MessageOrBuilder

#### Inheritors

| |
|---|
| [AuthenticationMethod](../-authentication-method/index.md) |
| [Builder](../-authentication-method/-builder/index.md) |

## Functions

| Name | Summary |
|---|---|
| [findInitializationErrors](../../classtime.service.account.event/-signup-event-or-builder/index.md#1227463831%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [findInitializationErrors](../../classtime.service.account.event/-signup-event-or-builder/index.md#1227463831%2FFunctions%2F1931141392)(): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt; |
| [getAllFields](../../classtime.service.account.event/-signup-event-or-builder/index.md#-1735213033%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getAllFields](../../classtime.service.account.event/-signup-event-or-builder/index.md#-1735213033%2FFunctions%2F1931141392)(): [Map](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)&lt;Descriptors.FieldDescriptor, [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; |
| [getDefaultInstanceForType](../../classtime.service.account.event/-password-reset-event/-builder/index.md#-889905270%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getDefaultInstanceForType](../../classtime.service.account.event/-password-reset-event/-builder/index.md#-889905270%2FFunctions%2F1931141392)(): MessageLite<br>abstract fun [getDefaultInstanceForType](../../classtime.service.account.event/-signup-event-or-builder/index.md#1172508988%2FFunctions%2F1931141392)(): Message |
| [getDescriptorForType](../../classtime.service.account.event/-signup-event-or-builder/index.md#-2023656483%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getDescriptorForType](../../classtime.service.account.event/-signup-event-or-builder/index.md#-2023656483%2FFunctions%2F1931141392)(): Descriptors.Descriptor |
| [getEmail](get-email.md) | [jvm]<br>abstract fun [getEmail](get-email.md)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)<br>`string email = 2;` |
| [getEmailBytes](get-email-bytes.md) | [jvm]<br>abstract fun [getEmailBytes](get-email-bytes.md)(): ByteString<br>`string email = 2;` |
| [getFailedLoginAttempts](get-failed-login-attempts.md) | [jvm]<br>abstract fun [getFailedLoginAttempts](get-failed-login-attempts.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>`int32 failed_login_attempts = 6;` |
| [getField](../../classtime.service.account.event/-signup-event-or-builder/index.md#-728711289%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getField](../../classtime.service.account.event/-signup-event-or-builder/index.md#-728711289%2FFunctions%2F1931141392)(p: Descriptors.FieldDescriptor): [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [getId](get-id.md) | [jvm]<br>abstract fun [getId](get-id.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>`int32 id = 5;` |
| [getInitializationErrorString](../../classtime.service.account.event/-signup-event-or-builder/index.md#-106143432%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getInitializationErrorString](../../classtime.service.account.event/-signup-event-or-builder/index.md#-106143432%2FFunctions%2F1931141392)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [getLastSuccessLoginAt](get-last-success-login-at.md) | [jvm]<br>abstract fun [getLastSuccessLoginAt](get-last-success-login-at.md)(): Timestamp<br>`.google.protobuf.Timestamp last_success_login_at = 7;` |
| [getLastSuccessLoginAtOrBuilder](get-last-success-login-at-or-builder.md) | [jvm]<br>abstract fun [getLastSuccessLoginAtOrBuilder](get-last-success-login-at-or-builder.md)(): TimestampOrBuilder<br>`.google.protobuf.Timestamp last_success_login_at = 7;` |
| [getOneofFieldDescriptor](../../classtime.service.account.event/-signup-event-or-builder/index.md#1767160798%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getOneofFieldDescriptor](../../classtime.service.account.event/-signup-event-or-builder/index.md#1767160798%2FFunctions%2F1931141392)(p: Descriptors.OneofDescriptor): Descriptors.FieldDescriptor |
| [getPasswordHashHash](get-password-hash-hash.md) | [jvm]<br>abstract fun [getPasswordHashHash](get-password-hash-hash.md)(): ByteString<br>```kotlin Additional fields required in case of SAML authentication, TBD<br>``` `bytes password_hash_hash = 3;` |
| [getProvider](get-provider.md) | [jvm]<br>abstract fun [getProvider](get-provider.md)(): [AuthenticationProvider](../-authentication-provider/index.md)<br>`.classtime.service.account.AuthenticationProvider provider = 1;` |
| [getProviderValue](get-provider-value.md) | [jvm]<br>abstract fun [getProviderValue](get-provider-value.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>`.classtime.service.account.AuthenticationProvider provider = 1;` |
| [getRepeatedField](../../classtime.service.account.event/-signup-event-or-builder/index.md#1425494465%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getRepeatedField](../../classtime.service.account.event/-signup-event-or-builder/index.md#1425494465%2FFunctions%2F1931141392)(p: Descriptors.FieldDescriptor, p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [getRepeatedFieldCount](../../classtime.service.account.event/-signup-event-or-builder/index.md#-950528252%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getRepeatedFieldCount](../../classtime.service.account.event/-signup-event-or-builder/index.md#-950528252%2FFunctions%2F1931141392)(p: Descriptors.FieldDescriptor): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getSecretsCase](get-secrets-case.md) | [jvm]<br>abstract fun [getSecretsCase](get-secrets-case.md)(): [AuthenticationMethod.SecretsCase](../-authentication-method/-secrets-case/index.md) |
| [getSubject](get-subject.md) | [jvm]<br>abstract fun [getSubject](get-subject.md)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)<br>```kotlin Unique identifier for the user in the given provider.<br>``` `string subject = 4;` |
| [getSubjectBytes](get-subject-bytes.md) | [jvm]<br>abstract fun [getSubjectBytes](get-subject-bytes.md)(): ByteString<br>```kotlin Unique identifier for the user in the given provider.<br>``` `string subject = 4;` |
| [getUnknownFields](../../classtime.service.account.event/-signup-event-or-builder/index.md#-1388384690%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getUnknownFields](../../classtime.service.account.event/-signup-event-or-builder/index.md#-1388384690%2FFunctions%2F1931141392)(): UnknownFieldSet |
| [hasField](../../classtime.service.account.event/-signup-event-or-builder/index.md#2095008451%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [hasField](../../classtime.service.account.event/-signup-event-or-builder/index.md#2095008451%2FFunctions%2F1931141392)(p: Descriptors.FieldDescriptor): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hasLastSuccessLoginAt](has-last-success-login-at.md) | [jvm]<br>abstract fun [hasLastSuccessLoginAt](has-last-success-login-at.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>`.google.protobuf.Timestamp last_success_login_at = 7;` |
| [hasOneof](../../classtime.service.account.event/-signup-event-or-builder/index.md#687391779%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [hasOneof](../../classtime.service.account.event/-signup-event-or-builder/index.md#687391779%2FFunctions%2F1931141392)(p: Descriptors.OneofDescriptor): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hasPasswordHashHash](has-password-hash-hash.md) | [jvm]<br>abstract fun [hasPasswordHashHash](has-password-hash-hash.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>```kotlin Additional fields required in case of SAML authentication, TBD<br>``` `bytes password_hash_hash = 3;` |
| [isInitialized](../../classtime.service.account.event/-signup-event-or-builder/index.md#-786502173%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [isInitialized](../../classtime.service.account.event/-signup-event-or-builder/index.md#-786502173%2FFunctions%2F1931141392)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
