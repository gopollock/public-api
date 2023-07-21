# Classtime public API

Classtime servers communicate using a protobuf-over-HTTP protocol. In this repository under [the services directory](./classtime/services/), you would be able to find all interface definitions and protobuf messages. However, we also support plain [JSON requests](./README.md#json-requests) based on protobuf messages.

To become familiar with service usage you could jump right into specific [flow examples](./flow-examples/). Or you could follow this ReadMe for some general explanations and examples.

## Interface sample

We will use this interface and proto messages as a sample in the examples below:

```kotlin
@Public
interface AccountService : Service {

    /**
     * Initiates a log in process. It will redirect the user to the authentication provider.
     */
    fun login(context: RequestContext, request: LoginRequest): LoginResponse

    /**
     * Updates part of the user's account info.
     *
     * @return all information about the user's account.
     */
    @RequireRole(Role.Teacher)
    fun updateAccountInfo(context: RequestContext, request: UpdateAccountInfoRequest): AccountInfoResponse

    ...
}
```

```protobuf
message LoginRequest {
  AuthenticationProvider provider = 1;
  classtime.service.common.Role role = 2;
}

message LoginResponse {
  string redirect_url = 1;
}

message UserProfileRequest {
  string account_id = 1;
}

message UserProfileResponse {
  string email = 1;
  string first_name = 2;
  string last_name = 3;
  classtime.service.common.Role role = 4;
}
```

## URLs construction

Each API end point consists of 3 concatenated parts:
1. Our server public host: https://www.classtime.com/service/public/
2. Service name (e.g. Account, School, Library)
3. Service method name (e.g. createAccount, login, associateTeacher)

Based on [interface sample](./README.md#interface-sample), we could specify such endpoints:
```
https://www.classtime.com/service/public/Account/login
https://www.classtime.com/service/public/Account/getPublicUserProfile
```

## Role permissions

Each service and service method contains an annotation limiting access to specific roles. And of course, method annotations have higher priority. For example, in the [interface sample](./README.md#interface-sample), there are:
- `AccountService` with `@Public` service annotation, which makes all methods available for all.
- `login` method without an annotation. And as a result, it uses `AccountService` scope - `@Public`.
- `getPublicUserProfile` method with `@RequireRole(Role.Teacher)`. Only teachers are allowed to call this endpoint.

### Auth Header

To get access scope of some roles, you need to have an access token tied to an account with that role.  
Your access token must be sent in Auth header with a request in the following schema:

```
Authorization: JWT ${accessToken}
```

#### Get testing access token
The easiest way to get an access token for some test purposes is through classtime website:
1. Go to a [Classtime website](https://www.classtime.com/auth/login) and authorize using any method (e.g. with Google).
2. Open "classtime.com" cookies in the developer console of the browser. (see e.g. [how to do it in Google Chrome](https://developer.chrome.com/docs/devtools/application/cookies/#open))
3. Copy the value of the cookie with the name: "service-jwt-0". It is the access token of your teacher account.

## JSON requests

JSON requests are the easiest point to start. However, we are recommending to use binary requests.  
Note: **All requests use the HTTP POST method**

### Public AccountService.login call:
```bash
curl -v https://www.classtime.com/service/public/Account/login \
    -X POST \
    -H 'Content-Type: application/json' \
    -H 'Accept: application/json,*/*' \
    -d '{ provider: "Google", role: "Teacher" }'
```
```json
Response: { "redirectUrl": "https://accounts.google.com..." }
```

### Restricted AccountService.getPublicUserProfile call:
Pre-requirement: you must know your account id and access token. You could obtain it following [this small guide](./flow-examples/my-account-id.md).

```bash
curl -v https://www.classtime.com/service/public/Account/updateAccountInfo \
    -X POST \
    -H 'Content-Type: application/json' \
    -H 'Accept: application/json,*/*' \
    -H 'Authorization: JWT ${yourTeacherAccessToken}' \
    -d '{ user_profile: { firstName: "John", lastName: "White" } }'
```
```json
Response: {
    "email": "you@email.com",
    "userProfile": {
      "firstName": "John",
      "lastName": "White",
      "picture": "",
    }
}
```

## Binary requests

Pre-requirement for binary requests are generated protobuf. They would help you to serialize requests and deserialize responses.  
The full process of protobuf generation and usage is described in [generating protos guide](./generate_porotos.md).

### Public AccountService.login call:
```bash
curl -v https://www.classtime.com/service/public/Account/login \
    -X POST \
    -H 'Content-Type: application/protobuf' \
    -H 'Accept: application/protobuf,*/*' \
    -d '' \
    -o output.bin
```
Response: `LoginResponse` in binary format

`-d ''` is an empty binary. It will result in default values for all fields.  
You could replace it with your serialized value.

### Restricted AccountService.getPublicUserProfile call:
Pre-requirement: you must know your account id and access token. You could obtain it following [this small guide](./flow-examples/my-account-id.md).

```bash
curl -v https://www.classtime.com/service/public/Account/updateAccountInfo \
    -X POST \
    -H 'Content-Type: application/protobuf' \
    -H 'Accept: application/protobuf,*/*' \
    -H 'Authorization: JWT ${yourTeacherAccessToken}' \
    -d ${protobufBinaryRequestData} \
    -o output.bin

```
Response: `UserProfileResponse` in binary format

## Rate limits

Classtime limits requests to 800 (requests / min). It is either:
- per IP address for unauthorized requests or
- per user for authorized requests.

Please, contact our support@classtime.com, if you believe it's a too low value for you.

## API versions

Currently, there is only 1 ongoing continuously developed real-time version of API.  
Protobuf serialization by its nature provides backward and forward compatibility in communication. Each field has a default value and additional fields get ignored. Yet, this doesn't save from breaking changes in the application layer itself.  

We are planning to introduce versioning somewhere in the future.
