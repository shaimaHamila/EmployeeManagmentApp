# EmployeeManagmentApp
Spring MVC web app
# Employee Management API - EmployeeController

## Overview

The EmployeeController in this API provides CRUD (Create, Read, Update, Delete) operations for managing employee information. It utilizes the EmployeeService to interact with the underlying data.

## Endpoints

### Create Employee

- **Endpoint:** `POST /api/employee`
- **Request Body:** JSON representing the employee details.
- **Response:** Returns the created employee details in the response body.
- **Example Usage:**
  ```bash
  curl -X POST -H "Content-Type: application/json" -d '{"firstName":"John","lastName":"Doe","email":"john.doe@example.com","psw": "test"}' http://localhost:8084/api/employee
