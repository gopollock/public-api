//[account-service-api](../../../index.md)/[classtime.service.account](../index.md)/[MsTeamsAuthInfoOrBuilder](index.md)

# MsTeamsAuthInfoOrBuilder

interface [MsTeamsAuthInfoOrBuilder](index.md) : MessageOrBuilder

#### Inheritors

| |
|---|
| [MsTeamsAuthInfo](../-ms-teams-auth-info/index.md) |
| [Builder](../-ms-teams-auth-info/-builder/index.md) |

## Functions

| Name | Summary |
|---|---|
| [findInitializationErrors](../../classtime.service.account.event/-signup-event-or-builder/index.md#1227463831%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [findInitializationErrors](../../classtime.service.account.event/-signup-event-or-builder/index.md#1227463831%2FFunctions%2F1931141392)(): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt; |
| [getAadTenantId](get-aad-tenant-id.md) | [jvm]<br>abstract fun [getAadTenantId](get-aad-tenant-id.md)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)<br>```kotlin id of a tenant in MS Azure Active Directory<br>``` `string aad_tenant_id = 2;` |
| [getAadTenantIdBytes](get-aad-tenant-id-bytes.md) | [jvm]<br>abstract fun [getAadTenantIdBytes](get-aad-tenant-id-bytes.md)(): ByteString<br>```kotlin id of a tenant in MS Azure Active Directory<br>``` `string aad_tenant_id = 2;` |
| [getAllFields](../../classtime.service.account.event/-signup-event-or-builder/index.md#-1735213033%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getAllFields](../../classtime.service.account.event/-signup-event-or-builder/index.md#-1735213033%2FFunctions%2F1931141392)(): [Map](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)&lt;Descriptors.FieldDescriptor, [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; |
| [getAuthToken](get-auth-token.md) | [jvm]<br>abstract fun [getAuthToken](get-auth-token.md)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)<br>```kotlin token that was created by MS Teams JS SDK<br>``` `string auth_token = 1;` |
| [getAuthTokenBytes](get-auth-token-bytes.md) | [jvm]<br>abstract fun [getAuthTokenBytes](get-auth-token-bytes.md)(): ByteString<br>```kotlin token that was created by MS Teams JS SDK<br>``` `string auth_token = 1;` |
| [getDefaultInstanceForType](../../classtime.service.account.event/-password-reset-event/-builder/index.md#-889905270%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getDefaultInstanceForType](../../classtime.service.account.event/-password-reset-event/-builder/index.md#-889905270%2FFunctions%2F1931141392)(): MessageLite<br>abstract fun [getDefaultInstanceForType](../../classtime.service.account.event/-signup-event-or-builder/index.md#1172508988%2FFunctions%2F1931141392)(): Message |
| [getDescriptorForType](../../classtime.service.account.event/-signup-event-or-builder/index.md#-2023656483%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getDescriptorForType](../../classtime.service.account.event/-signup-event-or-builder/index.md#-2023656483%2FFunctions%2F1931141392)(): Descriptors.Descriptor |
| [getField](../../classtime.service.account.event/-signup-event-or-builder/index.md#-728711289%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getField](../../classtime.service.account.event/-signup-event-or-builder/index.md#-728711289%2FFunctions%2F1931141392)(p: Descriptors.FieldDescriptor): [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [getInitializationErrorString](../../classtime.service.account.event/-signup-event-or-builder/index.md#-106143432%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getInitializationErrorString](../../classtime.service.account.event/-signup-event-or-builder/index.md#-106143432%2FFunctions%2F1931141392)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [getOneofFieldDescriptor](../../classtime.service.account.event/-signup-event-or-builder/index.md#1767160798%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getOneofFieldDescriptor](../../classtime.service.account.event/-signup-event-or-builder/index.md#1767160798%2FFunctions%2F1931141392)(p: Descriptors.OneofDescriptor): Descriptors.FieldDescriptor |
| [getRepeatedField](../../classtime.service.account.event/-signup-event-or-builder/index.md#1425494465%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getRepeatedField](../../classtime.service.account.event/-signup-event-or-builder/index.md#1425494465%2FFunctions%2F1931141392)(p: Descriptors.FieldDescriptor, p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [getRepeatedFieldCount](../../classtime.service.account.event/-signup-event-or-builder/index.md#-950528252%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getRepeatedFieldCount](../../classtime.service.account.event/-signup-event-or-builder/index.md#-950528252%2FFunctions%2F1931141392)(p: Descriptors.FieldDescriptor): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getUnknownFields](../../classtime.service.account.event/-signup-event-or-builder/index.md#-1388384690%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getUnknownFields](../../classtime.service.account.event/-signup-event-or-builder/index.md#-1388384690%2FFunctions%2F1931141392)(): UnknownFieldSet |
| [hasField](../../classtime.service.account.event/-signup-event-or-builder/index.md#2095008451%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [hasField](../../classtime.service.account.event/-signup-event-or-builder/index.md#2095008451%2FFunctions%2F1931141392)(p: Descriptors.FieldDescriptor): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hasOneof](../../classtime.service.account.event/-signup-event-or-builder/index.md#687391779%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [hasOneof](../../classtime.service.account.event/-signup-event-or-builder/index.md#687391779%2FFunctions%2F1931141392)(p: Descriptors.OneofDescriptor): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isInitialized](../../classtime.service.account.event/-signup-event-or-builder/index.md#-786502173%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [isInitialized](../../classtime.service.account.event/-signup-event-or-builder/index.md#-786502173%2FFunctions%2F1931141392)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
