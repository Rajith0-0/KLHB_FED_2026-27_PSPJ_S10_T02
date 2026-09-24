import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //giving basic student details 
        System.out.println("=== UNIVERSITY GRADE & ATTENDANCE TRACKER ===");
        
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();
        
        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();
        

        // to track attendance % 
        System.out.print("Total number of classes held: ");
        int totalClasses = scanner.nextInt();
        
        System.out.print("Number of classes attended: ");
        int attendedClasses = scanner.nextInt();
        
        double attendancePercentage = ((double) attendedClasses / totalClasses) * 100;
        
        // enter marks 
        System.out.print("Enter the number of subjects to track: ");
        int numSubjects = scanner.nextInt();
        
        int[] marks = new int[numSubjects];
        int totalMarks = 0;
        
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }
        
        double averageGrade = (double) totalMarks / numSubjects;
        
        // report card
        System.out.println(" ACADEMIC PERFORMANCE REPOrtm ");
       
        System.out.println("Student Name : " + studentName);
        System.out.println("Student ID   : " + studentID);
        System.out.println("Average Grade: " + String.format("%.2f", averageGrade) + "%");
        System.out.println("Attendance   : " + String.format("%.2f", attendancePercentage) + "%");
        
        // rule for 75%
        if (attendancePercentage >= 75.0) {
            System.out.println("Exam Status  : ELIGIBLE ");
        } else {
            System.out.println("Exam Status  : DETAINED (Attendance below 75%) ");
        }
        
        
       
    }
}
