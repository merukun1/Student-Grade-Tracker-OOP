# Student-Grade-Tracker-OOP
Student grade tracker using object-oriented programming (OOP) in Java.
It includes three classes: Student, Course, and Grade.

The Student class represents a student, and it has properties such as the student's name, ID, and a list of courses taken. It also has behaviors such as the ability to add or remove courses, calculate the overall GPA, and generate a transcript.

The Course class represents a course, and it has properties such as the course's name and credit hours, and a list of grades. It also has behaviors such as the ability to add or remove grades, calculate the overall grade for the course, and get the letter grade for the course.

The Grade class represents a grade, and it has properties such as the score and weight of the grade. It does not have any behaviors.

The main class, Main, is used to test the student grade tracker. It uses a Scanner to input the student's name and ID, creates a Student object, adds courses and grades for the student using the addCourse() and addGrade() methods, and then prints the student's overall GPA and transcript using the calculateGPA() and generateTranscript() methods.
