//[account-service-api](../../../index.md)/[classtime.service.account](../index.md)/[AccountService](index.md)/[accountExtension](account-extension.md)

# accountExtension

[jvm]\

@Public

abstract fun [accountExtension](account-extension.md)(context: RequestContext, request: &lt;Error class: unknown class&gt;): &lt;Error class: unknown class&gt;

Process pending accountExtension entity. As a result, the account receives an additional authentication method. Merges two accounts into a single one, if the authentication method references an email of an existing account. The main account will gain all accesses and privileges of the merged account.

#### Throws

| | |
|---|---|
| ServiceError.NotFound | when main or merged account is missing in entity store. |
| ServiceError.Forbidden | for mismatched or expired secrets. |
