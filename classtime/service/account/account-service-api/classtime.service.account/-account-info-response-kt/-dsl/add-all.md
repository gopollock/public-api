//[account-service-api](../../../../index.md)/[classtime.service.account](../../index.md)/[AccountInfoResponseKt](../index.md)/[Dsl](index.md)/[addAll](add-all.md)

# addAll

[jvm]\

@[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;addAllAuthenticationInfos&quot;)

fun DslList&lt;[AuthenticationInfo](../../-authentication-info/index.md), [AccountInfoResponseKt.Dsl.AuthenticationInfosProxy](-authentication-infos-proxy/index.md)&gt;.[addAll](add-all.md)(values: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[AuthenticationInfo](../../-authentication-info/index.md)&gt;)

<code>repeated .classtime.service.account.AuthenticationInfo authentication_infos = 4;</code>

#### Parameters

jvm

| | |
|---|---|
| values | The authenticationInfos to add. |

[jvm]\

@[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;addAllOrganizations&quot;)

fun DslList&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [AccountInfoResponseKt.Dsl.OrganizationsProxy](-organizations-proxy/index.md)&gt;.[addAll](add-all.md)(values: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)

<code>repeated string organizations = 13;</code>

#### Parameters

jvm

| | |
|---|---|
| values | The organizations to add. |
