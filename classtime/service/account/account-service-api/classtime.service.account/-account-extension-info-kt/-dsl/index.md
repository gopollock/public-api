//[account-service-api](../../../../index.md)/[classtime.service.account](../../index.md)/[AccountExtensionInfoKt](../index.md)/[Dsl](index.md)

# Dsl

[jvm]\
class [Dsl](index.md)

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [jvm]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [extendedAccountId](extended-account-id.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getExtendedAccountId&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setExtendedAccountId&quot;)<br>var [extendedAccountId](extended-account-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br><code>string extended_account_id = 7;</code> |
| [isMerge](is-merge.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getIsMerge&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setIsMerge&quot;)<br>var [isMerge](is-merge.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><code>bool is_merge = 2;</code> |
| [primaryUser](primary-user.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getPrimaryUser&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setPrimaryUser&quot;)<br>var [primaryUser](primary-user.md): [AccountExtensionInfo.User](../../-account-extension-info/-user/index.md)<br><code>.classtime.service.account.AccountExtensionInfo.User primary_user = 3;</code> |
| [primaryUserExtraInfo](primary-user-extra-info.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getPrimaryUserExtraInfo&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setPrimaryUserExtraInfo&quot;)<br>var [primaryUserExtraInfo](primary-user-extra-info.md): [AccountExtensionInfo.AccountInfo](../../-account-extension-info/-account-info/index.md)<br><code>.classtime.service.account.AccountExtensionInfo.AccountInfo primary_user_extra_info = 5;</code> |
| [secondaryUser](secondary-user.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getSecondaryUser&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setSecondaryUser&quot;)<br>var [secondaryUser](secondary-user.md): [AccountExtensionInfo.User](../../-account-extension-info/-user/index.md)<br><code>.classtime.service.account.AccountExtensionInfo.User secondary_user = 4;</code> |
| [secondaryUserExtraInfo](secondary-user-extra-info.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getSecondaryUserExtraInfo&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setSecondaryUserExtraInfo&quot;)<br>var [secondaryUserExtraInfo](secondary-user-extra-info.md): [AccountExtensionInfo.AccountInfo](../../-account-extension-info/-account-info/index.md)<br><code>.classtime.service.account.AccountExtensionInfo.AccountInfo secondary_user_extra_info = 6;</code> |

## Functions

| Name | Summary |
|---|---|
| [clearExtendedAccountId](clear-extended-account-id.md) | [jvm]<br>fun [clearExtendedAccountId](clear-extended-account-id.md)()<br><code>string extended_account_id = 7;</code> |
| [clearIsMerge](clear-is-merge.md) | [jvm]<br>fun [clearIsMerge](clear-is-merge.md)()<br><code>bool is_merge = 2;</code> |
| [clearPrimaryUser](clear-primary-user.md) | [jvm]<br>fun [clearPrimaryUser](clear-primary-user.md)()<br><code>.classtime.service.account.AccountExtensionInfo.User primary_user = 3;</code> |
| [clearPrimaryUserExtraInfo](clear-primary-user-extra-info.md) | [jvm]<br>fun [clearPrimaryUserExtraInfo](clear-primary-user-extra-info.md)()<br><code>.classtime.service.account.AccountExtensionInfo.AccountInfo primary_user_extra_info = 5;</code> |
| [clearSecondaryUser](clear-secondary-user.md) | [jvm]<br>fun [clearSecondaryUser](clear-secondary-user.md)()<br><code>.classtime.service.account.AccountExtensionInfo.User secondary_user = 4;</code> |
| [clearSecondaryUserExtraInfo](clear-secondary-user-extra-info.md) | [jvm]<br>fun [clearSecondaryUserExtraInfo](clear-secondary-user-extra-info.md)()<br><code>.classtime.service.account.AccountExtensionInfo.AccountInfo secondary_user_extra_info = 6;</code> |
| [hasPrimaryUser](has-primary-user.md) | [jvm]<br>fun [hasPrimaryUser](has-primary-user.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><code>.classtime.service.account.AccountExtensionInfo.User primary_user = 3;</code> |
| [hasPrimaryUserExtraInfo](has-primary-user-extra-info.md) | [jvm]<br>fun [hasPrimaryUserExtraInfo](has-primary-user-extra-info.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><code>.classtime.service.account.AccountExtensionInfo.AccountInfo primary_user_extra_info = 5;</code> |
| [hasSecondaryUser](has-secondary-user.md) | [jvm]<br>fun [hasSecondaryUser](has-secondary-user.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><code>.classtime.service.account.AccountExtensionInfo.User secondary_user = 4;</code> |
| [hasSecondaryUserExtraInfo](has-secondary-user-extra-info.md) | [jvm]<br>fun [hasSecondaryUserExtraInfo](has-secondary-user-extra-info.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><code>.classtime.service.account.AccountExtensionInfo.AccountInfo secondary_user_extra_info = 6;</code> |
