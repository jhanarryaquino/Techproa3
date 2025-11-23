import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many grades (1 to 5)? ");
        int n = scanner.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter grade " + i + ": ");
            double grade = scanner.nextDouble();
            sum += grade;
        }

        double average = sum / n;
        System.out.println("Average: " + average);

        // Determine letter grade
        char letter;
        if (average >= 90) {
            letter = 'A';
        } else if (average >= 80) {
            letter = 'B';
        } else if (average >= 70) {
            letter = 'C';
        } else if (average >= 60) {
            letter = 'D';
        } else {
            letter = 'F';
        }

        System.out.println("Letter grade: " + letter);
        scanner.close();
    }
}
