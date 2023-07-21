//[account-service-api](../../../index.md)/[classtime.service.account](../index.md)/[AccountService](index.md)/[resetPassword](reset-password.md)

# resetPassword

[jvm]\

@Public

@RateLimit(limit = 30, unitCount = 1, chronoUnit = [ChronoUnit.HOURS](https://docs.oracle.com/javase/8/docs/api/java/time/temporal/ChronoUnit.HOURS.html))

abstract fun [resetPassword](reset-password.md)(context: RequestContext, request: &lt;Error class: unknown class&gt;): &lt;Error class: unknown class&gt;

Creates new EmailLinkVerification entity and send an email with specific text (reset/signup) and link to the page, where user can set new password.

#### Throws

| | |
|---|---|
| ServiceError.NotFound | when password authentication method with email for which reset password is requested does not exist. |
| ServiceError.BadRequest | when password signup requested for already existing password method with non-empty password hash. |
