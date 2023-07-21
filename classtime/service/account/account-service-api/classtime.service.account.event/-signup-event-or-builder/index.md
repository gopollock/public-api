//[account-service-api](../../../index.md)/[classtime.service.account.event](../index.md)/[SignupEventOrBuilder](index.md)

# SignupEventOrBuilder

interface [SignupEventOrBuilder](index.md) : MessageOrBuilder

#### Inheritors

| |
|---|
| [SignupEvent](../-signup-event/index.md) |
| [Builder](../-signup-event/-builder/index.md) |

## Functions

| Name | Summary |
|---|---|
| [findInitializationErrors](index.md#1227463831%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [findInitializationErrors](index.md#1227463831%2FFunctions%2F1931141392)(): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt; |
| [getAcquisitionChannel](get-acquisition-channel.md) | [jvm]<br>abstract fun [getAcquisitionChannel](get-acquisition-channel.md)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)<br>`string acquisition_channel = 2;` |
| [getAcquisitionChannelBytes](get-acquisition-channel-bytes.md) | [jvm]<br>abstract fun [getAcquisitionChannelBytes](get-acquisition-channel-bytes.md)(): ByteString<br>`string acquisition_channel = 2;` |
| [getAllFields](index.md#-1735213033%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getAllFields](index.md#-1735213033%2FFunctions%2F1931141392)(): [Map](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)&lt;Descriptors.FieldDescriptor, [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; |
| [getDefaultInstanceForType](../-password-reset-event/-builder/index.md#-889905270%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getDefaultInstanceForType](../-password-reset-event/-builder/index.md#-889905270%2FFunctions%2F1931141392)(): MessageLite<br>abstract fun [getDefaultInstanceForType](index.md#1172508988%2FFunctions%2F1931141392)(): Message |
| [getDescriptorForType](index.md#-2023656483%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getDescriptorForType](index.md#-2023656483%2FFunctions%2F1931141392)(): Descriptors.Descriptor |
| [getEmail](get-email.md) | [jvm]<br>abstract fun [getEmail](get-email.md)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)<br>`string email = 4;` |
| [getEmailBytes](get-email-bytes.md) | [jvm]<br>abstract fun [getEmailBytes](get-email-bytes.md)(): ByteString<br>`string email = 4;` |
| [getField](index.md#-728711289%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getField](index.md#-728711289%2FFunctions%2F1931141392)(p: Descriptors.FieldDescriptor): [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [getInitializationErrorString](index.md#-106143432%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getInitializationErrorString](index.md#-106143432%2FFunctions%2F1931141392)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [getOneofFieldDescriptor](index.md#1767160798%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getOneofFieldDescriptor](index.md#1767160798%2FFunctions%2F1931141392)(p: Descriptors.OneofDescriptor): Descriptors.FieldDescriptor |
| [getProvider](get-provider.md) | [jvm]<br>abstract fun [getProvider](get-provider.md)(): [AuthenticationProvider](../../classtime.service.account/-authentication-provider/index.md)<br>`.classtime.service.account.AuthenticationProvider provider = 3;` |
| [getProviderValue](get-provider-value.md) | [jvm]<br>abstract fun [getProviderValue](get-provider-value.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>`.classtime.service.account.AuthenticationProvider provider = 3;` |
| [getReferralId](get-referral-id.md) | [jvm]<br>abstract fun [getReferralId](get-referral-id.md)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)<br>`string referral_id = 1;` |
| [getReferralIdBytes](get-referral-id-bytes.md) | [jvm]<br>abstract fun [getReferralIdBytes](get-referral-id-bytes.md)(): ByteString<br>`string referral_id = 1;` |
| [getRepeatedField](index.md#1425494465%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getRepeatedField](index.md#1425494465%2FFunctions%2F1931141392)(p: Descriptors.FieldDescriptor, p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [getRepeatedFieldCount](index.md#-950528252%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getRepeatedFieldCount](index.md#-950528252%2FFunctions%2F1931141392)(p: Descriptors.FieldDescriptor): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getUnknownFields](index.md#-1388384690%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [getUnknownFields](index.md#-1388384690%2FFunctions%2F1931141392)(): UnknownFieldSet |
| [hasField](index.md#2095008451%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [hasField](index.md#2095008451%2FFunctions%2F1931141392)(p: Descriptors.FieldDescriptor): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hasOneof](index.md#687391779%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [hasOneof](index.md#687391779%2FFunctions%2F1931141392)(p: Descriptors.OneofDescriptor): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isInitialized](index.md#-786502173%2FFunctions%2F1931141392) | [jvm]<br>abstract fun [isInitialized](index.md#-786502173%2FFunctions%2F1931141392)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
