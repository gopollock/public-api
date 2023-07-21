//[account-service-api](../../../index.md)/[classtime.service.account](../index.md)/[AuthTokenSource](index.md)

# AuthTokenSource

[jvm]\
enum [AuthTokenSource](index.md) : ProtocolMessageEnum

Protobuf enum `classtime.service.account.AuthTokenSource`

## Entries

| | |
|---|---|
| [COOKIE](-c-o-o-k-i-e/index.md) | [jvm]<br>[COOKIE](-c-o-o-k-i-e/index.md)<br>`COOKIE = 0;` |
| [URL_PARAM](-u-r-l_-p-a-r-a-m/index.md) | [jvm]<br>[URL_PARAM](-u-r-l_-p-a-r-a-m/index.md)<br>`URL_PARAM = 1;` |
| [UNRECOGNIZED](-u-n-r-e-c-o-g-n-i-z-e-d/index.md) | [jvm]<br>[UNRECOGNIZED](-u-n-r-e-c-o-g-n-i-z-e-d/index.md) |

## Properties

| Name | Summary |
|---|---|
| [COOKIE_VALUE](-c-o-o-k-i-e_-v-a-l-u-e.md) | [jvm]<br>val [COOKIE_VALUE](-c-o-o-k-i-e_-v-a-l-u-e.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0<br>`COOKIE = 0;` |
| [URL_PARAM_VALUE](-u-r-l_-p-a-r-a-m_-v-a-l-u-e.md) | [jvm]<br>val [URL_PARAM_VALUE](-u-r-l_-p-a-r-a-m_-v-a-l-u-e.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 1<br>`URL_PARAM = 1;` |

## Functions

| Name | Summary |
|---|---|
| [forNumber](for-number.md) | [jvm]<br>open fun [forNumber](for-number.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [AuthTokenSource](index.md) |
| [getDescriptor](get-descriptor.md) | [jvm]<br>fun [getDescriptor](get-descriptor.md)(): Descriptors.EnumDescriptor |
| [getDescriptorForType](get-descriptor-for-type.md) | [jvm]<br>fun [getDescriptorForType](get-descriptor-for-type.md)(): Descriptors.EnumDescriptor |
| [getNumber](get-number.md) | [jvm]<br>fun [getNumber](get-number.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getValueDescriptor](get-value-descriptor.md) | [jvm]<br>fun [getValueDescriptor](get-value-descriptor.md)(): Descriptors.EnumValueDescriptor |
| [internalGetValueMap](internal-get-value-map.md) | [jvm]<br>open fun [internalGetValueMap](internal-get-value-map.md)(): Internal.EnumLiteMap&lt;[AuthTokenSource](index.md)&gt; |
| [valueOf](value-of.md) | [jvm]<br>open fun [valueOf](value-of.md)(desc: Descriptors.EnumValueDescriptor): [AuthTokenSource](index.md)<br>open fun [~~valueOf~~](value-of.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [AuthTokenSource](index.md)<br>[jvm]<br>open fun [valueOf](value-of.md)(name: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [AuthTokenSource](index.md)<br>Returns the enum constant of this type with the specified name. The string must match exactly an identifier used to declare an enum constant in this type. (Extraneous whitespace characters are not permitted.) |
| [values](values.md) | [jvm]<br>open fun [values](values.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[AuthTokenSource](index.md)&gt;<br>Returns an array containing the constants of this enum type, in the order they're declared. This method may be used to iterate over the constants. |
