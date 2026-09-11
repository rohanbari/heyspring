# heyspring

A simple Spring Boot REST API for managing tasks. It's time to kickstart Spring!

## Tech stack

- Java 21
- Spring Boot 4
- Spring Web MVC
- Spring Data JPA
- H2 database
- Gradle

## Getting started

### Prerequisites

- Java 21

### Run locally

```bash
./gradlew bootRun
```

The application starts on `http://localhost:8080`.

### Run tests

```bash
./gradlew test
```

## API

Base path: `/api/tasks`

- `GET /api/tasks` — list all tasks
- `GET /api/tasks/{id}` — get a task by id
- `POST /api/tasks` — create a task
- `PUT /api/tasks/{id}` — update a task
- `DELETE /api/tasks/{id}` — delete a task
- `PATCH /api/tasks/{id}/complete` — toggle completion status

### Example create payload

```json
{
  "title": "Write docs",
  "description": "Add README and community files",
  "completed": false
}
```

## Community

- [Contributing guide](CONTRIBUTING.md)
- [Code of conduct](CODE_OF_CONDUCT.md)
- [Security policy](SECURITY.md)
- [Support](SUPPORT.md)
