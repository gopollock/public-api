//[account-service-api](../../../../index.md)/[classtime.service.account](../../index.md)/[AccountKt](../index.md)/[Dsl](index.md)

# Dsl

[jvm]\
class [Dsl](index.md)

## Types

| Name | Summary |
|---|---|
| [AuthenticationMethodsProxy](-authentication-methods-proxy/index.md) | [jvm]<br>class [AuthenticationMethodsProxy](-authentication-methods-proxy/index.md) : DslProxy<br>An uninstantiable, behaviorless type to represent the field in generics. |
| [Companion](-companion/index.md) | [jvm]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [authenticationMethods](authentication-methods.md) | [jvm]<br>val [authenticationMethods](authentication-methods.md): DslList&lt;[AuthenticationMethod](../../-authentication-method/index.md), [AccountKt.Dsl.AuthenticationMethodsProxy](-authentication-methods-proxy/index.md)&gt;<br><code>repeated .classtime.service.account.AuthenticationMethod authentication_methods = 4;</code> |
| [blockedAt](blocked-at.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getBlockedAt&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setBlockedAt&quot;)<br>var [blockedAt](blocked-at.md): Timestamp<br><code>.google.protobuf.Timestamp blocked_at = 7;</code> |
| [locale](locale.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getLocale&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setLocale&quot;)<br>var [locale](locale.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br><code>string locale = 10;</code> |
| [primaryAuthenticationMethodId](primary-authentication-method-id.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getPrimaryAuthenticationMethodId&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setPrimaryAuthenticationMethodId&quot;)<br>var [primaryAuthenticationMethodId](primary-authentication-method-id.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br><code>int32 primary_authentication_method_id = 2;</code> |
| [role](role.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getRole&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setRole&quot;)<br>var [role](role.md): Role<br><code>.classtime.service.common.Role role = 9;</code> |
| [userProfile](user-profile.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getUserProfile&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setUserProfile&quot;)<br>var [userProfile](user-profile.md): [UserProfile](../../-user-profile/index.md)<br><code>.classtime.service.account.UserProfile user_profile = 1;</code> |

## Functions

| Name | Summary |
|---|---|
| [add](add.md) | [jvm]<br>@[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;addAuthenticationMethods&quot;)<br>fun DslList&lt;[AuthenticationMethod](../../-authentication-method/index.md), [AccountKt.Dsl.AuthenticationMethodsProxy](-authentication-methods-proxy/index.md)&gt;.[add](add.md)(value: [AuthenticationMethod](../../-authentication-method/index.md))<br><code>repeated .classtime.service.account.AuthenticationMethod authentication_methods = 4;</code> |
| [addAll](add-all.md) | [jvm]<br>@[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;addAllAuthenticationMethods&quot;)<br>fun DslList&lt;[AuthenticationMethod](../../-authentication-method/index.md), [AccountKt.Dsl.AuthenticationMethodsProxy](-authentication-methods-proxy/index.md)&gt;.[addAll](add-all.md)(values: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[AuthenticationMethod](../../-authentication-method/index.md)&gt;)<br><code>repeated .classtime.service.account.AuthenticationMethod authentication_methods = 4;</code> |
| [clear](clear.md) | [jvm]<br>@[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;clearAuthenticationMethods&quot;)<br>fun DslList&lt;[AuthenticationMethod](../../-authentication-method/index.md), [AccountKt.Dsl.AuthenticationMethodsProxy](-authentication-methods-proxy/index.md)&gt;.[clear](clear.md)()<br><code>repeated .classtime.service.account.AuthenticationMethod authentication_methods = 4;</code> |
| [clearBlockedAt](clear-blocked-at.md) | [jvm]<br>fun [clearBlockedAt](clear-blocked-at.md)()<br><code>.google.protobuf.Timestamp blocked_at = 7;</code> |
| [clearLocale](clear-locale.md) | [jvm]<br>fun [clearLocale](clear-locale.md)()<br><code>string locale = 10;</code> |
| [clearPrimaryAuthenticationMethodId](clear-primary-authentication-method-id.md) | [jvm]<br>fun [clearPrimaryAuthenticationMethodId](clear-primary-authentication-method-id.md)()<br><code>int32 primary_authentication_method_id = 2;</code> |
| [clearRole](clear-role.md) | [jvm]<br>fun [clearRole](clear-role.md)()<br><code>.classtime.service.common.Role role = 9;</code> |
| [clearUserProfile](clear-user-profile.md) | [jvm]<br>fun [clearUserProfile](clear-user-profile.md)()<br><code>.classtime.service.account.UserProfile user_profile = 1;</code> |
| [hasBlockedAt](has-blocked-at.md) | [jvm]<br>fun [hasBlockedAt](has-blocked-at.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><code>.google.protobuf.Timestamp blocked_at = 7;</code> |
| [hasUserProfile](has-user-profile.md) | [jvm]<br>fun [hasUserProfile](has-user-profile.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br><code>.classtime.service.account.UserProfile user_profile = 1;</code> |
| [plusAssign](plus-assign.md) | [jvm]<br>@[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;plusAssignAuthenticationMethods&quot;)<br>inline operator fun DslList&lt;[AuthenticationMethod](../../-authentication-method/index.md), [AccountKt.Dsl.AuthenticationMethodsProxy](-authentication-methods-proxy/index.md)&gt;.[plusAssign](plus-assign.md)(value: [AuthenticationMethod](../../-authentication-method/index.md))<br>@[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;plusAssignAllAuthenticationMethods&quot;)<br>inline operator fun DslList&lt;[AuthenticationMethod](../../-authentication-method/index.md), [AccountKt.Dsl.AuthenticationMethodsProxy](-authentication-methods-proxy/index.md)&gt;.[plusAssign](plus-assign.md)(values: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[AuthenticationMethod](../../-authentication-method/index.md)&gt;)<br><code>repeated .classtime.service.account.AuthenticationMethod authentication_methods = 4;</code> |
| [set](set.md) | [jvm]<br>@[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setAuthenticationMethods&quot;)<br>operator fun DslList&lt;[AuthenticationMethod](../../-authentication-method/index.md), [AccountKt.Dsl.AuthenticationMethodsProxy](-authentication-methods-proxy/index.md)&gt;.[set](set.md)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), value: [AuthenticationMethod](../../-authentication-method/index.md))<br><code>repeated .classtime.service.account.AuthenticationMethod authentication_methods = 4;</code> |
