# Project Management Service Challenge

Design/implement a system to manage projects an developers.


## API

### GET /status

Indicate the service has started up correctly and is ready to accept requests.

Responses:
- **200 OK** When the service is ready to receive requests.

### PUT /teams

Load the list of available teams in the service and remove all previous data (existing teams and projects).
This method may be called more than once during the life cycle of the service.

**Body** _required_ The list of teams to load.

**Content Type** `application/json`

Sample:

```json
[
  {
    "id": 1,
    "developers": 5
  },
  {
    "id": 2,
    "developers": 4
  }
]
```

Responses:
- **200 OK** When the list is registered correctly
- **400 Bad Request** When there is a failure in the request.

### POST /project

A project needs to be assigned to a team.

**Body** _required_ The project, that needs to be assigned to a team.

**Content Type** `application/json`

Sample:

```json
{
  "id": 1,
  "devs_needed": 3
}
```

Responses:

- **200 OK** When the project is assigned correctly.
- **400 Bad Request** When there is a failure in the request format.

### POST /completed

A project has been completed. Whether it has been started or not.

**Body** _required_ A form with the project ID, such that `ID=X`

**Content Type** `application/x-www-form-urlencoded`

- **200 OK** When the project is assigned correctly.
- **404 Not found** When the project was not found.
- **400 Bad Request** When there is a failure in the request format.

### POST /assigned

Given a project ID 'ID=x', return the team the project is assigned to, or no team if the project is waiting to be assigned.

**Body** _required_ A form with the project ID, such that `ID=X`

**Content Type** `application/x-www-form-urlencoded`

- **200 OK** With the team as payload when the project is assigned to a team.
- **204 No Content** When the project is waiting for an assignment.
- **404 Not found** When the project was not found.
- **400 Bad Request** When there is a failure in the request format.

