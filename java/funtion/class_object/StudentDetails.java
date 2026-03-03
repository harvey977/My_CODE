import java.util.Scanner;

class Student {
    String name;
    int id;
    int[] marks = new int[5];
    double percentage;
    String grade;

    // Student details
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Calculate percentage
    public void CP() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        percentage = (double) totalMarks / 5;
    }

    // percentage
    public void AG() {
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

    // Input
    public void IM() {
        Scanner uu = new Scanner(System.in);
        System.out.println("Enter marks for " + name + ":");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = uu.nextInt();
        }
    }

    // Display
    public void DD() {
        System.out.println("\n Student Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Marks in Subjects: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner us = new Scanner(System.in);

        // Input
        System.out.print("Enter student's name: ");
        String name = us.nextLine();

        System.out.print("Enter student's ID: ");
        int id = us.nextInt();

        // call
        Student uss = new Student(name, id);

        // Input marks and calculate percentage
        uss.IM();
        uss.CP();
        uss.AG();

        // Display
        uss.DD();
    }
}
