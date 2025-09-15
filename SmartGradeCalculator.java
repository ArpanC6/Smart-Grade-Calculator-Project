/**
 * Student Grade Calculator
 * Takes marks of multiple subjects and calculates:
 * → Total Marks, Average, Grade (A, B, C, F)
 */

 import java.util.Scanner;
public class SmartGradeCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int marks[] = new int[n];
        int sum = 0;

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        
        double average = (double) sum / n;

        
        char grade;
        if (average >= 90) grade = 'A';
        else if (average >= 75) grade = 'B';
        else if (average >= 50) grade = 'C';
        else grade = 'F';

        
        System.out.println("\n===== Result =====");
        System.out.println("Total Marks: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}