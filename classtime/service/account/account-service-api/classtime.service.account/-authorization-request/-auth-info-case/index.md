//[account-service-api](../../../../index.md)/[classtime.service.account](../../index.md)/[AuthorizationRequest](../index.md)/[AuthInfoCase](index.md)

# AuthInfoCase

[jvm]\
enum [AuthInfoCase](index.md) : Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum

## Entries

| | |
|---|---|
| [EMAIL_PASSWORD](-e-m-a-i-l_-p-a-s-s-w-o-r-d/index.md) | [jvm]<br>[EMAIL_PASSWORD](-e-m-a-i-l_-p-a-s-s-w-o-r-d/index.md) |
| [OPEN_ID_CONNECT](-o-p-e-n_-i-d_-c-o-n-n-e-c-t/index.md) | [jvm]<br>[OPEN_ID_CONNECT](-o-p-e-n_-i-d_-c-o-n-n-e-c-t/index.md) |
| [TEAMS_USER](-t-e-a-m-s_-u-s-e-r/index.md) | [jvm]<br>[TEAMS_USER](-t-e-a-m-s_-u-s-e-r/index.md) |
| [SAML_RESPONSE](-s-a-m-l_-r-e-s-p-o-n-s-e/index.md) | [jvm]<br>[SAML_RESPONSE](-s-a-m-l_-r-e-s-p-o-n-s-e/index.md) |
| [NICKNAME](-n-i-c-k-n-a-m-e/index.md) | [jvm]<br>[NICKNAME](-n-i-c-k-n-a-m-e/index.md) |
| [EMAIL_VERIFICATION_AUTH_INFO](-e-m-a-i-l_-v-e-r-i-f-i-c-a-t-i-o-n_-a-u-t-h_-i-n-f-o/index.md) | [jvm]<br>[EMAIL_VERIFICATION_AUTH_INFO](-e-m-a-i-l_-v-e-r-i-f-i-c-a-t-i-o-n_-a-u-t-h_-i-n-f-o/index.md) |
| [MS_TEAMS](-m-s_-t-e-a-m-s/index.md) | [jvm]<br>[MS_TEAMS](-m-s_-t-e-a-m-s/index.md) |
| [AUTHINFO_NOT_SET](-a-u-t-h-i-n-f-o_-n-o-t_-s-e-t/index.md) | [jvm]<br>[AUTHINFO_NOT_SET](-a-u-t-h-i-n-f-o_-n-o-t_-s-e-t/index.md) |

## Functions

| Name | Summary |
|---|---|
| [forNumber](for-number.md) | [jvm]<br>open fun [forNumber](for-number.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [AuthorizationRequest.AuthInfoCase](index.md) |
| [getNumber](get-number.md) | [jvm]<br>open fun [getNumber](get-number.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [valueOf](value-of.md) | [jvm]<br>open fun [~~valueOf~~](value-of.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [AuthorizationRequest.AuthInfoCase](index.md)<br>[jvm]<br>open fun [valueOf](value-of.md)(name: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [AuthorizationRequest.AuthInfoCase](index.md)<br>Returns the enum constant of this type with the specified name. The string must match exactly an identifier used to declare an enum constant in this type. (Extraneous whitespace characters are not permitted.) |
| [values](values.md) | [jvm]<br>open fun [values](values.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[AuthorizationRequest.AuthInfoCase](index.md)&gt;<br>Returns an array containing the constants of this enum type, in the order they're declared. This method may be used to iterate over the constants. |
