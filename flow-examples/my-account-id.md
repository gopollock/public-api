# Get my account id flow

1. You need to have an access token. You could follow [this guide](../README.md#get-testing-access-token).
2. You need to perform an Account.getMyAccountInfo request.
3. In response you will find your account id.

```
curl -v https://www.classtime.com/service/public/Account/getMyAccountInfo \
    -X POST \
    -H 'Content-Type: application/json' \
    -H 'Accept: application/json,*/*' \
    -H 'Authorization: JWT ${yourAccessToken}' \
    -d '{ }'
```
```
Response: {
    classtimeId: "your-id",
    ...
}
```
