TASKbootcamp

Hey! This is TASKbootcamp, a simple task manager made with Spring Boot. It lets you add, view, update, and delete tasks quickly—perfect for practicing APIs.

Features

Add tasks with title, description, and status (TODO, IN_PROGRESS, COMPLETED, BLOCKED)

View all tasks or a single task

Update tasks

Delete tasks

Task Example
{
  "id": 1,
  "title": "Finish Homework",
  "description": "Math and science assignments",
  "status": "TODO"
}

How to Run

Clone the repo:

git clone https://github.com/irfanahmed0489/160923733282-IrfanAhmed.git


Open in IDE and run.

App runs on http://localhost:8080.

RUN THE TaskApplication class !! first

Use Postman or browser to test.

Endpoints

GET /tasks – see all tasks

GET /tasks/{id} – see one task ( GET http://localhost:8080/tasks )( POST http://localhost:8080/tasks )

POST /tasks – add task ( POST http://localhost:8080/tasks )

PUT /tasks/{id} – update task ( PUT http://localhost:8080/tasks/1 )

DELETE /tasks/{id} – delete task ( DELETE http://localhost:8080/tasks/1 )

Notes

Tasks are stored in memory, so they disappear when you restart the app.
