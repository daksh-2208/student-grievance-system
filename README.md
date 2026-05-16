# Student Grievance Management System

A full-stack web application developed using Java Spring Boot and MongoDB that allows students to submit and manage grievances related to academics, infrastructure, faculty, hostel facilities, and campus services.

The project is designed to provide a simple and organized platform for handling student complaints digitally instead of using manual processes.

---

# Objectives

* Provide an online grievance submission platform
* Store complaint records securely using MongoDB
* Improve communication between students and administration
* Reduce manual paperwork and complaint handling

---

# Features

* Student grievance submission form
* Category-based grievance system
* MongoDB database integration
* REST API backend using Spring Boot
* Simple and responsive frontend interface
* Real-time data storage
* Easy form handling using JavaScript Fetch API

---

# Tech Stack

## Frontend

* HTML
* CSS
* JavaScript

## Backend

* Java
* Spring Boot

## Database

* MongoDB

## Tools Used

* VS Code
* MongoDB Compass
* GitHub

---

# Project Structure

```text id="r8n1pn"
src/
 ├── main/
 │   ├── java/
 │   ├── resources/
 │   └── templates/
 └── test/
```

---

# How to Run the Project

## Step 1 — Clone Repository

```bash id="wnw7ji"
git clone <your-repository-link>
```

---

## Step 2 — Open Project

Open the project folder using:

* VS Code
* IntelliJ IDEA

---

## Step 3 — Configure MongoDB

Update the MongoDB connection string inside:

```text id="ubjpf1"
src/main/resources/application.properties
```

Example:

```properties id="jlwm0j"
spring.data.mongodb.uri=mongodb://localhost:27017/grievanceDB
```

---

## Step 4 — Run Spring Boot Application

```bash id="pllu2r"
.\mvnw.cmd spring-boot:run
```

Server runs on:

```text id="xg3jkk"
http://localhost:8080
```

---

## Step 5 — Open Frontend

Run:

```text id="vobd5v"
index.html
```

using Live Server extension or browser.

---

# Future Improvements

* Admin Dashboard
* Student Login System
* Authentication & Authorization
* Complaint Status Tracking
* Email Notifications
* File Upload Support
* Better UI/UX Design

---

# Learning Outcomes

This project helped in understanding:

* Spring Boot backend development
* REST API creation
* MongoDB database handling
* Frontend and backend integration
* Form handling using JavaScript
* Full-stack project workflow

---

# Project Status

Project is currently under development and continuously improving with additional features and enhancements.

---

# Developed By

Daksh Kumar Sharma
