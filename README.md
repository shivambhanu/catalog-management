# Catalog Management System

## Objective
Design and implement a Catalog Management System using Spring Boot to manage product data (name, brand, description, etc.).

## Features
- **Product Entity**: Fields include `id`, `name`, `brand`, `description`, `price`, `quantity`, `category`, and `dateAdded`. Use JPA for data persistence.
- **CRUD Operations**: RESTful API endpoints for Create, Read, Update, and Delete operations using Spring Data JPA.
- **Search & Filter**: Implement query parameters to search and filter products by criteria like name, brand, category, and price range.
- **Data Validation**: Use annotations like `@NotBlank`, `@NotNull`, etc., and handle validation errors with appropriate HTTP status codes.
- **Database**: Use a relational database (MySQL, H2) for persistence.
- **Logging & Auditing**: Use SLF4J/Logback for logging and implement auditing for product changes.

## Setup Instructions

1. **Clone Repository**:
   ```bash
   git clone https://github.com/shivambhanu/catalog-management.git
   cd catalog
