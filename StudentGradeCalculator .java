import java.util.Scanner;
public class StudentGradeCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();
        int totalMarks = 0;
        for (int i = 1; i <= subjects; i++) 
        {
            System.out.print("Enter marks for Subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();
            while (marks < 0 || marks > 100) 
            {
                System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                System.out.print("Enter marks for Subject " + i + " again: ");
                marks = scanner.nextInt();
            }
            
            totalMarks += marks;
        }
        double averagePercentage = (double) totalMarks / subjects;
        String grade;
        if (averagePercentage >= 90) 
        {
            grade = "A+";
        } 
        else if (averagePercentage >= 80) 
        {
            grade = "A";
        } 
        else if (averagePercentage >= 70) 
        {
            grade = "B";
        } 
        else if (averagePercentage >= 60) 
        {
            grade = "C";
        } 
        else if (averagePercentage >= 50) 
        {
            grade = "D";
        } 
        else 
        {
            grade = "F";
        }
        System.out.println("\n----- Student Grade Report -----");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}
