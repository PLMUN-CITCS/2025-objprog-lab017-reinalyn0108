import java.util.Scanner;

public class StudentGrading {

    // Method to get the student's score from the user
    public static int getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");

        while (!scanner.hasNextInt()) {  // Input validation
            System.out.println("Invalid input. Please enter a numeric score.");
            scanner.next(); // Consume invalid input
            System.out.print("Enter your score: ");
        }

        int score = scanner.nextInt();
        scanner.close(); // Close the scanner
        return score;
    }

    // Method to calculate the grade based on the score
    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        int score = getStudentScore(); // Get score from user
        String grade = calculateGrade(score); // Calculate grade

        System.out.println("Your Grade is: " + grade); // Display result
    }
}
