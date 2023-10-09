import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Take marks obtained (out of 100) in each subject.
        System.out.print("Enter marks obtained in Subject 1: ");
        int subject1Marks = scanner.nextInt();
        
        System.out.print("Enter marks obtained in Subject 2: ");
        int subject2Marks = scanner.nextInt();
        
        System.out.print("Enter marks obtained in Subject 3: ");
        int subject3Marks = scanner.nextInt();
        
        // Calculate Total Marks: Sum up the marks obtained in all subjects.
        int totalMarks = subject1Marks + subject2Marks + subject3Marks;
        
        // Calculate Average Percentage: Divide the total marks by the total number of subjects.
        double averagePercentage = totalMarks / 3.0;
        
        // Grade Calculation: Assign grades based on the average percentage achieved.
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        // Display Results: Show the total marks, average percentage, and the corresponding grade to the user.
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
