//[account-service-api](../../../../index.md)/[classtime.service.account](../../index.md)/[OpenIdConnectAuthInfoKt](../index.md)/[Dsl](index.md)

# Dsl

[jvm]\
class [Dsl](index.md)

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [jvm]<br>object [Companion](-companion/index.md) |
| [ScopeProxy](-scope-proxy/index.md) | [jvm]<br>class [ScopeProxy](-scope-proxy/index.md) : DslProxy<br>An uninstantiable, behaviorless type to represent the field in generics. |

## Properties

| Name | Summary |
|---|---|
| [code](code.md) | [jvm]<br>@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getCode&quot;)<br>@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setCode&quot;)<br>var [code](code.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br><code>string code = 1;</code> |
| [scope](scope.md) | [jvm]<br>val [scope](scope.md): DslList&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [OpenIdConnectAuthInfoKt.Dsl.ScopeProxy](-scope-proxy/index.md)&gt;<br><code>repeated string scope = 3;</code> |

## Functions

| Name | Summary |
|---|---|
| [add](add.md) | [jvm]<br>@[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;addScope&quot;)<br>fun DslList&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [OpenIdConnectAuthInfoKt.Dsl.ScopeProxy](-scope-proxy/index.md)&gt;.[add](add.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br><code>repeated string scope = 3;</code> |
| [addAll](add-all.md) | [jvm]<br>@[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;addAllScope&quot;)<br>fun DslList&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [OpenIdConnectAuthInfoKt.Dsl.ScopeProxy](-scope-proxy/index.md)&gt;.[addAll](add-all.md)(values: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br><code>repeated string scope = 3;</code> |
| [clear](clear.md) | [jvm]<br>@[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;clearScope&quot;)<br>fun DslList&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [OpenIdConnectAuthInfoKt.Dsl.ScopeProxy](-scope-proxy/index.md)&gt;.[clear](clear.md)()<br><code>repeated string scope = 3;</code> |
| [clearCode](clear-code.md) | [jvm]<br>fun [clearCode](clear-code.md)()<br><code>string code = 1;</code> |
| [plusAssign](plus-assign.md) | [jvm]<br>@[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;plusAssignScope&quot;)<br>inline operator fun DslList&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [OpenIdConnectAuthInfoKt.Dsl.ScopeProxy](-scope-proxy/index.md)&gt;.[plusAssign](plus-assign.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>@[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;plusAssignAllScope&quot;)<br>inline operator fun DslList&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [OpenIdConnectAuthInfoKt.Dsl.ScopeProxy](-scope-proxy/index.md)&gt;.[plusAssign](plus-assign.md)(values: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br><code>repeated string scope = 3;</code> |
| [set](set.md) | [jvm]<br>@[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setScope&quot;)<br>operator fun DslList&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [OpenIdConnectAuthInfoKt.Dsl.ScopeProxy](-scope-proxy/index.md)&gt;.[set](set.md)(index: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br><code>repeated string scope = 3;</code> |
