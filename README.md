🎓 Student Management System (Java)

A simple console-based Student Management System built using Java.
This application allows users to add, view, search, update, and delete student records using an array-based storage system.

📌 Features

➕ Add a new student

📋 View all students

🔍 Search student by ID

✏️ Update student marks

❌ Delete student

🚪 Exit the program

🏗️ Project Structure

The program contains three main classes:

1️⃣ Main

Contains the main() method.

Provides a menu-driven interface.

Handles user input using Scanner.

Calls appropriate methods from StudentManager.

2️⃣ Student

Represents a student object.

Attributes:

id (int)

name (String)

department (String)

marks (double)

Methods:

getId()

getMarks()

setMarks(double marks)

display() – Prints student details

3️⃣ StudentManager

Manages student records using an array.

Attributes:

Student[] students – Stores student objects

int count – Tracks number of students

Methods:

addStudent(Student s)

displayAll()

findById(int id)

updateMarks(int id, double newMarks)

deleteStudent(int id)

⚙️ How It Works

The system initializes a StudentManager with a maximum capacity of 10 students.

Students are stored in an array.

When deleting a student, the array shifts elements left to avoid gaps.

Searching is performed using a simple linear search.

▶️ How to Run
Step 1: Compile
javac Main.java
Step 2: Run
java Main
🖥️ Sample Menu
--- Student Management System ---
1. Add Student
2. View All Students
3. Search Student by ID
4. Update Student Marks
5. Delete Student
6. Exit
Enter choice:
📚 Concepts Used

Object-Oriented Programming (OOP)

Classes and Objects

Encapsulation

Arrays

Linear Search

Menu-driven programs

Java Scanner class

⚠️ Limitations

Fixed maximum of 10 students.

Data is not stored permanently (no file/database).

Uses linear search (not optimized for large data).

🚀 Possible Improvements

Replace array with ArrayList

Add file storage (serialization or text file)

Add grade calculation logic

Add input validation

Implement sorting by marks or name

Convert to GUI application (JavaFX/Swing)
