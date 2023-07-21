//[account-service-api](../../../../index.md)/[classtime.service.account](../../index.md)/[LoginRequestKt](../index.md)/[Dsl](index.md)/[successRedirectUrl](success-redirect-url.md)

# successRedirectUrl

[jvm]\

@get:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;getSuccessRedirectUrl&quot;)

@set:[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = &quot;setSuccessRedirectUrl&quot;)

var [successRedirectUrl](success-redirect-url.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

<pre>
Redirect url, where user will land after authentication process succeeds.
Must use the same protocol and host as classtime server.
</pre>

<code>string success_redirect_url = 5;</code>
