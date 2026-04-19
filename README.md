# Question Bank Service

[![Build Status](https://img.shields.io/badge/build-passing-brightgreen)](#)
[![License](https://img.shields.io/badge/license-MIT-blue)](#)
[![Java](https://img.shields.io/badge/Java-21-orange)](#)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.x-6DB33F)](#)

## Service purpose

Question Bank Service is a REST API for managing interview-style questions. It supports basic question management and filtering by category and difficulty.

## Endpoints list

Base path: `/api/questions`

- `GET /api/questions`  
  Returns all questions.

- `GET /api/questions/{id}`  
  Returns a question by its ID.

- `POST /api/questions`  
  Creates a new question.

- `DELETE /api/questions/{id}`  
  Deletes a question by its ID.

- `GET /api/questions/category/{category}`  
  Returns questions filtered by category.

- `GET /api/questions/difficulty/{difficulty}`  
  Returns questions filtered by difficulty.

## Setup instructions

### Prerequisites

- Java 21
- Maven

### Run locally

1. Clone the repository.
2. Start the application:
3. Open the service in your browser or API client:

- Service: `http://localhost:8081`
- H2 console: `http://localhost:8081/h2-console`

### Default configuration

The application runs with an in-memory H2 database and uses common local-development settings.

### Example request

## Badges

The badges above are placeholders and can be replaced with repository-specific badges such as:

- build status
- license
- Java version
- coverage
- release/version