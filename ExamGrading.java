package Assignment;

import java.util.Scanner;

// Assignment 2: Exam Grading System
// Write a program that determines whether a student passes an exam based on three subjects. 
// A student passes if the average score is at least 60, and none of the individual scores is below 40.

public class ExamGrading {
    private String name;
    private double average;
    private int sub1, sub2, sub3;
    private int rollNo;

    Scanner sc = new Scanner(System.in);

    public void accept() {
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter the marks for subject 1, subject 2, and subject 3: ");
        sub1 = sc.nextInt();
        sub2 = sc.nextInt();
        sub3 = sc.nextInt();
        System.out.print("Enter the roll number of the student: ");
        rollNo = sc.nextInt();
    }

    public void grading() {
        average = (sub1 + sub2 + sub3) / 3.0;

       
        if ((average >= 60) && (sub1 >= 40 && sub2 >= 40 && sub3 >= 40)) {
            System.out.println("The student has passed the Average score: " + average);
        } else if (sub1 < 40 || sub2 < 40 || sub3 < 40) {
            System.out.println("The student has failed due to one or more subject scores below 40.");
        } else {
            System.out.println("The student has failed Average score: " + average);
        }
    }

    public void display() {
        System.out.println("Name of the student: " + name);
        System.out.println("Roll number of the student: " + rollNo);
        System.out.println("Average marks of the student: " + average);
    }

}

