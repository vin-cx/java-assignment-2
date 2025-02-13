//program to output "STUDENT GRADING"
//Author: Vincent Mutunga Kioko
//Reg no: CT101/G/19150/23
//Date: February 8,2024
//

// Import the Scanner class for user input
import java.util.Scanner;

// This class represents a student with a name and their marks
class Student {
    String name; // The name of the student
    double marks; // The marks obtained by the student

    // Constructor to initialize student details
    public Student(String name, double marks) {
        this.name = name; // Initialize the name of the student
        this.marks = marks; // Initialize the marks of the student
    }

    // Method to display the student's details
    public void displayDetails() {
        System.out.println("Name: " + name); // Print out the student's name
        System.out.println("Marks: " + marks); // Print out the student's marks
    }
}

// This class handles the logic to calculate the student's grade
class GradeCalculator {
  
    // Method that calculates the grade based on the marks received
    public char calculateGrade(double marks) {
        // If marks are 90 or above, return grade 'A'
        if (marks >= 90) {
            return 'A';
        // If marks are between 75 and 89, return grade 'B'
        } else if (marks >= 75) {  
            return 'B';
        // If marks are between 50 and 74, return grade 'C'
        } else if (marks >= 50) { 
            return 'C';
        // If marks are below 50, return grade 'D'
        } else {
            return 'D';
        }
    }
}

// The main class where our program starts executing
public class MainApp1 {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner  scanner = new Scanner (System.in);

        // Ask the user to enter the student's name
        System.out.print("Enter student name: ");
        String name = scanner.nextLine(); // Read the name input from the user

        // Ask the user to enter the student's marks
        System.out.print("Enter student marks: ");
        double marks = scanner.nextDouble(); // Read the marks input from the user

        // Create a new Student object using the provided name and marks
        Student student = new Student(name, marks);

        // Create an instance of GradeCalculator to determine the student's grade
        GradeCalculator calculator = new GradeCalculator();
        char grade = calculator.calculateGrade(marks); // Get the grade based on marks

        // Display the student's details and their calculated grade
        student.displayDetails(); // Show student information
        System.out.println("Grade: " + grade); // Show the calculated grade

        // Close the scanner to free up resources
        scanner.close(); 
    }
}