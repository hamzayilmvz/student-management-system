# Student Management System (Console-Based)

This project is a simple student management system designed to practice
core Java backend concepts without using any frameworks.

## Features
- Add students with unique IDs
- Enroll students into courses
- Prevent duplicate course enrollment
- Manage student states (ACTIVE, DROPPED, GRADUATED)
- Enforce business rules based on student status
- Manual test scenarios via `Main` class

## Key Concepts Practiced
- Object-Oriented Programming (OOP)
- Encapsulation & Responsibility Separation
- State management using enums
- HashMap for fast student lookup (ID as primary key)
- HashSet with `equals` & `hashCode` for course uniqueness
- Entity vs Manager (Service-like) design
- Rule-based business logic
- Defensive programming (no invalid state transitions)

## Project Structure
- `Student` → Entity containing behavior and state
- `Course` → Value object with identity-based equality
- `StudentManager` → Coordinator for application logic
- `Main` → Manual test scenarios (no UI, no framework)

## Notes
This project intentionally avoids frameworks (e.g. Spring)
to focus on understanding backend fundamentals at a low level.

## Possible Improvements
- Return operation result enums instead of console messages
- Convert to REST API using Spring Boot
- Add persistence layer

---

Author: Hamza Yilmaz
