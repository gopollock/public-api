# Organization flow

Organization is a set of independent users, which could use Classtime.  
All organization users could be controlled by organization admin.

## Organization admin creation

Only Classtime internally has privileges to create organization admin.  
Please, contact support@classtime.com to create admin with a school.  

We will provide you with organization **admin access token** and **school id** connected to organization.

## Create teachers

With admin access token you would be allowed to create users within your organization. `Account.createAccount` is a responsible method:

```bash
curl -v https://www.classtime.com/service/public/Account/createAccount \
    -X POST \
    -H 'Content-Type: application/json' \
    -H 'Accept: application/json,*/*' \
    -H 'Authorization: JWT ${mySchoolAdminToken}' \
    -d '{ role: "Teacher", subject: "some-unique-id", userProfile: { firstName: "John", lastName: "White" } }'
```
Response:
```json
{ "accountId": "unique-id-of-created-account" }
```

## Assign teacher to school

Now when there is a teacher within organization you would need to add him to your school. `School.associateTeacher` is a responsible method:

```bash
curl -v https://www.classtime.com/service/public/School/associateTeacher \
    -X POST \
    -H 'Content-Type: application/json' \
    -H 'Accept: application/json,*/*' \
    -H 'Authorization: JWT ${mySchoolAdminToken}' \
    -d '{ schoolId: ${mySchoolId}, accountId: ${organizationTeacherId} }'
```
Response:
```json
{}
```

## Create user access token

Finally, you could create an access token for users within your organization. `Account.createToken` is a responsible method:

```bash
curl -v https://www.classtime.com/service/public/Account/createToken \
    -X POST \
    -H 'Content-Type: application/json' \
    -H 'Accept: application/json,*/*' \
    -H 'Authorization: JWT ${mySchoolAdminToken}' \
    -d '{ classtime_id: ${userId} }'
```
Response:
```json
{
    "token": "teacher access token",
    "validUntil": 1689694256, // Timestamp of token expiration date
}
```

## Use user token

Now you could validly perform any calls as a teacher with his access token. For example:
```bash
curl -v https://www.classtime.com/service/public/Account/getMyAccountInfo \
    -X POST \
    -H 'Content-Type: application/json' \
    -H 'Accept: application/json,*/*' \
    -H 'Authorization: JWT ${createdTeacherAccessToken}' \
    -d ''
```
Response:
```json
{
    "userProfile": {
        "firstName": "John",
        "lastName": "White",
    },
    "classtimeId": "user id",
    "role": "Teacher",
    "organization": "MaxBrain",
}
```
