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


Open in IDE and run the TaskApplication class.

TaskApplication runs on http://localhost:8080.

Use Postman and these commands

Endpoints

GET /tasks – see all tasks

GET /tasks/{id} – see one task

POST /tasks – add task

PUT /tasks/{id} – update task

DELETE /tasks/{id} – delete task

Notes

Tasks are stored in memory, so they disappear when you restart the app.

This is short, realistic, and still covers everything a student project README should.

If you want, I can make an even shorter, 1-paragraph “super casual” version that looks like a real student just wrote it in 5 minutes. That one would be like… almost chatty and tiny.