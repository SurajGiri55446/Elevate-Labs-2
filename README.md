# Student Management System

## Project Description
This project is a Java-based console application designed to manage student information. It allows users to add, delete, view, and update student records, including their ID, name, and marks. The program supports names with spaces (e.g., "suraj giri") and uses a menu-driven interface with a loop to perform multiple operations until the user chooses to exit. Proper input handling prevents exceptions like `InputMismatchException`.

## Tools Used
- **Java Development Kit (JDK) 24**: For writing, compiling, and running the Java code.
- **VS Code**: Used as the code editor for development.
- **Terminal/Command Prompt with javac**: For compiling the code using the `javac` compiler.
- **Git and GitHub**: For version control and submission.

## Code
- `Student.java`: The main Java file containing the `Information`, `StudentOperations`, and `Student` classes with logic for managing student records.

## Screenshots
- **[Output] Screenshot**:
  <img width="772" height="797" alt="Screenshot 2025-08-05 130150" src="https://github.com/user-attachments/assets/c73481c4-dba6-4bee-8ccf-f4994df244b7" />


## Step-by-Step Process
1. Created the `Student.java` file using VS Code.
2. Implemented the `Information` class to store student details (ID, name, marks) with getters, setters, and a `toString()` method.
3. Developed the `StudentOperations` class with methods to add, delete, view, and update students, using an `ArrayList` to store data.
4. Used `Scanner` for user input, ensuring `sc.nextLine()` handles names with spaces and consuming newlines after numeric inputs to avoid exceptions.
5. Compiled the code with `javac Student.java` using JDK 24.
6. Ran the code with `java Student` .
7. Initialized a Git repository, committed the code, and pushed it to GitHub.

