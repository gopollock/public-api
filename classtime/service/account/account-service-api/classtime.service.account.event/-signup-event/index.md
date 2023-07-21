//[account-service-api](../../../index.md)/[classtime.service.account.event](../index.md)/[SignupEvent](index.md)

# SignupEvent

[jvm]\
class [SignupEvent](index.md) : GeneratedMessageV3, [SignupEventOrBuilder](../-signup-event-or-builder/index.md)

Protobuf type `classtime.service.account.event.SignupEvent`

## Types

| Name | Summary |
|---|---|
| [Builder](-builder/index.md) | [jvm]<br>class [Builder](-builder/index.md) : GeneratedMessageV3.Builder&lt;BuilderType&gt; , [SignupEventOrBuilder](../-signup-event-or-builder/index.md)<br>Protobuf type `classtime.service.account.event.SignupEvent` |

## Properties

| Name | Summary |
|---|---|
| [ACQUISITION_CHANNEL_FIELD_NUMBER](-a-c-q-u-i-s-i-t-i-o-n_-c-h-a-n-n-e-l_-f-i-e-l-d_-n-u-m-b-e-r.md) | [jvm]<br>val [ACQUISITION_CHANNEL_FIELD_NUMBER](-a-c-q-u-i-s-i-t-i-o-n_-c-h-a-n-n-e-l_-f-i-e-l-d_-n-u-m-b-e-r.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 2 |
| [EMAIL_FIELD_NUMBER](-e-m-a-i-l_-f-i-e-l-d_-n-u-m-b-e-r.md) | [jvm]<br>val [EMAIL_FIELD_NUMBER](-e-m-a-i-l_-f-i-e-l-d_-n-u-m-b-e-r.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 4 |
| [PROVIDER_FIELD_NUMBER](-p-r-o-v-i-d-e-r_-f-i-e-l-d_-n-u-m-b-e-r.md) | [jvm]<br>val [PROVIDER_FIELD_NUMBER](-p-r-o-v-i-d-e-r_-f-i-e-l-d_-n-u-m-b-e-r.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 3 |
| [REFERRAL_ID_FIELD_NUMBER](-r-e-f-e-r-r-a-l_-i-d_-f-i-e-l-d_-n-u-m-b-e-r.md) | [jvm]<br>val [REFERRAL_ID_FIELD_NUMBER](-r-e-f-e-r-r-a-l_-i-d_-f-i-e-l-d_-n-u-m-b-e-r.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 1 |

## Functions

| Name | Summary |
|---|---|
| [copy](../copy.md) | [jvm]<br>inline fun [SignupEvent](index.md).[copy](../copy.md)(block: [SignupEventKt.Dsl](../-signup-event-kt/-dsl/index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [SignupEvent](index.md) |
| [equals](equals.md) | [jvm]<br>open fun [equals](equals.md)(obj: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [findInitializationErrors](../-password-reset-event/index.md#-812419917%2FFunctions%2F1931141392) | [jvm]<br>open fun [findInitializationErrors](../-password-reset-event/index.md#-812419917%2FFunctions%2F1931141392)(): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt; |
| [getAcquisitionChannel](get-acquisition-channel.md) | [jvm]<br>open fun [getAcquisitionChannel](get-acquisition-channel.md)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)<br>`string acquisition_channel = 2;` |
| [getAcquisitionChannelBytes](get-acquisition-channel-bytes.md) | [jvm]<br>open fun [getAcquisitionChannelBytes](get-acquisition-channel-bytes.md)(): ByteString<br>`string acquisition_channel = 2;` |
| [getAllFields](../-password-reset-event/index.md#-881691077%2FFunctions%2F1931141392) | [jvm]<br>open fun [getAllFields](../-password-reset-event/index.md#-881691077%2FFunctions%2F1931141392)(): [Map](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)&lt;Descriptors.FieldDescriptor, [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; |
| [getDefaultInstance](get-default-instance.md) | [jvm]<br>open fun [getDefaultInstance](get-default-instance.md)(): [SignupEvent](index.md) |
| [getDefaultInstanceForType](get-default-instance-for-type.md) | [jvm]<br>open fun [getDefaultInstanceForType](get-default-instance-for-type.md)(): [SignupEvent](index.md)<br>abstract fun [getDefaultInstanceForType](../-password-reset-event/-builder/index.md#-889905270%2FFunctions%2F1931141392)(): MessageLite |
| [getDescriptor](get-descriptor.md) | [jvm]<br>fun [getDescriptor](get-descriptor.md)(): Descriptors.Descriptor |
| [getDescriptorForType](../-password-reset-event/index.md#-339032575%2FFunctions%2F1931141392) | [jvm]<br>open fun [getDescriptorForType](../-password-reset-event/index.md#-339032575%2FFunctions%2F1931141392)(): Descriptors.Descriptor |
| [getEmail](get-email.md) | [jvm]<br>open fun [getEmail](get-email.md)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)<br>`string email = 4;` |
| [getEmailBytes](get-email-bytes.md) | [jvm]<br>open fun [getEmailBytes](get-email-bytes.md)(): ByteString<br>`string email = 4;` |
| [getField](../-password-reset-event/index.md#-1468392733%2FFunctions%2F1931141392) | [jvm]<br>open fun [getField](../-password-reset-event/index.md#-1468392733%2FFunctions%2F1931141392)(field: Descriptors.FieldDescriptor): [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [getInitializationErrorString](../-password-reset-event/index.md#150260564%2FFunctions%2F1931141392) | [jvm]<br>open fun [getInitializationErrorString](../-password-reset-event/index.md#150260564%2FFunctions%2F1931141392)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [getOneofFieldDescriptor](../-password-reset-event/index.md#278248706%2FFunctions%2F1931141392) | [jvm]<br>open fun [getOneofFieldDescriptor](../-password-reset-event/index.md#278248706%2FFunctions%2F1931141392)(oneof: Descriptors.OneofDescriptor): Descriptors.FieldDescriptor |
| [getParserForType](get-parser-for-type.md) | [jvm]<br>open fun [getParserForType](get-parser-for-type.md)(): Parser&lt;[SignupEvent](index.md)&gt;<br>abstract fun [getParserForType](../-password-reset-event/index.md#778616491%2FFunctions%2F1931141392)(): Parser&lt;out Message&gt;<br>abstract fun [getParserForType](../-password-reset-event/index.md#-723557255%2FFunctions%2F1931141392)(): Parser&lt;out MessageLite&gt; |
| [getProvider](get-provider.md) | [jvm]<br>open fun [getProvider](get-provider.md)(): [AuthenticationProvider](../../classtime.service.account/-authentication-provider/index.md)<br>`.classtime.service.account.AuthenticationProvider provider = 3;` |
| [getProviderValue](get-provider-value.md) | [jvm]<br>open fun [getProviderValue](get-provider-value.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>`.classtime.service.account.AuthenticationProvider provider = 3;` |
| [getReferralId](get-referral-id.md) | [jvm]<br>open fun [getReferralId](get-referral-id.md)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)<br>`string referral_id = 1;` |
| [getReferralIdBytes](get-referral-id-bytes.md) | [jvm]<br>open fun [getReferralIdBytes](get-referral-id-bytes.md)(): ByteString<br>`string referral_id = 1;` |
| [getRepeatedField](../-password-reset-event/index.md#-574192867%2FFunctions%2F1931141392) | [jvm]<br>open fun [getRepeatedField](../-password-reset-event/index.md#-574192867%2FFunctions%2F1931141392)(field: Descriptors.FieldDescriptor, index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [getRepeatedFieldCount](../-password-reset-event/index.md#1483673896%2FFunctions%2F1931141392) | [jvm]<br>open fun [getRepeatedFieldCount](../-password-reset-event/index.md#1483673896%2FFunctions%2F1931141392)(field: Descriptors.FieldDescriptor): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getSerializedSize](get-serialized-size.md) | [jvm]<br>open fun [getSerializedSize](get-serialized-size.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getUnknownFields](get-unknown-fields.md) | [jvm]<br>fun [getUnknownFields](get-unknown-fields.md)(): UnknownFieldSet |
| [hasField](../-password-reset-event/index.md#1355327007%2FFunctions%2F1931141392) | [jvm]<br>open fun [hasField](../-password-reset-event/index.md#1355327007%2FFunctions%2F1931141392)(field: Descriptors.FieldDescriptor): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hashCode](hash-code.md) | [jvm]<br>open fun [hashCode](hash-code.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [hasOneof](../-password-reset-event/index.md#-52289665%2FFunctions%2F1931141392) | [jvm]<br>open fun [hasOneof](../-password-reset-event/index.md#-52289665%2FFunctions%2F1931141392)(oneof: Descriptors.OneofDescriptor): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isInitialized](is-initialized.md) | [jvm]<br>fun [isInitialized](is-initialized.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [newBuilder](new-builder.md) | [jvm]<br>open fun [newBuilder](new-builder.md)(): [SignupEvent.Builder](-builder/index.md)<br>open fun [newBuilder](new-builder.md)(prototype: [SignupEvent](index.md)): [SignupEvent.Builder](-builder/index.md) |
| [newBuilderForType](new-builder-for-type.md) | [jvm]<br>open fun [newBuilderForType](new-builder-for-type.md)(): [SignupEvent.Builder](-builder/index.md) |
| [parseDelimitedFrom](parse-delimited-from.md) | [jvm]<br>open fun [parseDelimitedFrom](parse-delimited-from.md)(input: [InputStream](https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)): [SignupEvent](index.md)<br>open fun [parseDelimitedFrom](parse-delimited-from.md)(input: [InputStream](https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html), extensionRegistry: ExtensionRegistryLite): [SignupEvent](index.md) |
| [parseFrom](parse-from.md) | [jvm]<br>open fun [parseFrom](parse-from.md)(data: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)&gt;): [SignupEvent](index.md)<br>open fun [parseFrom](parse-from.md)(data: ByteString): [SignupEvent](index.md)<br>open fun [parseFrom](parse-from.md)(input: CodedInputStream): [SignupEvent](index.md)<br>open fun [parseFrom](parse-from.md)(input: [InputStream](https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)): [SignupEvent](index.md)<br>open fun [parseFrom](parse-from.md)(data: [ByteBuffer](https://docs.oracle.com/javase/8/docs/api/java/nio/ByteBuffer.html)): [SignupEvent](index.md)<br>open fun [parseFrom](parse-from.md)(data: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)&gt;, extensionRegistry: ExtensionRegistryLite): [SignupEvent](index.md)<br>open fun [parseFrom](parse-from.md)(data: ByteString, extensionRegistry: ExtensionRegistryLite): [SignupEvent](index.md)<br>open fun [parseFrom](parse-from.md)(input: CodedInputStream, extensionRegistry: ExtensionRegistryLite): [SignupEvent](index.md)<br>open fun [parseFrom](parse-from.md)(input: [InputStream](https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html), extensionRegistry: ExtensionRegistryLite): [SignupEvent](index.md)<br>open fun [parseFrom](parse-from.md)(data: [ByteBuffer](https://docs.oracle.com/javase/8/docs/api/java/nio/ByteBuffer.html), extensionRegistry: ExtensionRegistryLite): [SignupEvent](index.md) |
| [parser](parser.md) | [jvm]<br>open fun [parser](parser.md)(): Parser&lt;[SignupEvent](index.md)&gt; |
| [toBuilder](to-builder.md) | [jvm]<br>open fun [toBuilder](to-builder.md)(): [SignupEvent.Builder](-builder/index.md) |
| [toByteArray](../-password-reset-event/index.md#-893058881%2FFunctions%2F1931141392) | [jvm]<br>open fun [toByteArray](../-password-reset-event/index.md#-893058881%2FFunctions%2F1931141392)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)&gt; |
| [toByteString](../-password-reset-event/index.md#1590314737%2FFunctions%2F1931141392) | [jvm]<br>open fun [toByteString](../-password-reset-event/index.md#1590314737%2FFunctions%2F1931141392)(): ByteString |
| [toString](../-password-reset-event/index.md#-1084302645%2FFunctions%2F1931141392) | [jvm]<br>fun [toString](../-password-reset-event/index.md#-1084302645%2FFunctions%2F1931141392)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [writeDelimitedTo](../-password-reset-event/index.md#938978067%2FFunctions%2F1931141392) | [jvm]<br>open fun [writeDelimitedTo](../-password-reset-event/index.md#938978067%2FFunctions%2F1931141392)(output: [OutputStream](https://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)) |
| [writeTo](write-to.md) | [jvm]<br>open fun [writeTo](write-to.md)(output: CodedOutputStream) |
