import java.util.Scanner;

public class Seatwerkthirteen {

    public static String calculateGrade(double percentage) { // Corrected method name
        if (percentage >= 90) return "A";
        else if (percentage >= 80) return "B"; // Corrected the condition to be >= 80
        else if (percentage >= 70) return "C";
        else if (percentage >= 60) return "D";
        else return "F";
    }

    public static String calculateGrade(int score, int maxScore) { // Corrected method name
        double percentage = (double) score / maxScore * 100; // Corrected percentage calculation
        return calculateGrade(percentage);
    }

    public static String calculateGrade(double[] subjectScores) { // Corrected method name
        double total = 0;
        for (double score : subjectScores) { // Enhanced for-each loop
            total += score; // Corrected total accumulation
        }
        double average = total / subjectScores.length;
        return calculateGrade(average);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage:
        System.out.println("Enter percentage: ");
        double percentage = scanner.nextDouble();
        System.out.println("Grade for " + percentage + "%: " + calculateGrade(percentage));

        System.out.println("Enter score and max score: ");
        int score = scanner.nextInt();
        int maxScore = scanner.nextInt();
        System.out.println("Grade for score " + score + " out of " + maxScore + ": " + calculateGrade(score, maxScore));

        System.out.println("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        double[] subjectScores = new double[numSubjects];
        System.out.println("Enter scores for each subject: ");
        for (int i = 0; i < numSubjects; i++) {
            subjectScores[i] = scanner.nextDouble();
        }
        System.out.println("Grade for subject scores: " + calculateGrade(subjectScores));

        scanner.close();
    }
                           }
