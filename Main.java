import java.util.Scanner;

public class Main {

    public static double calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    public static char determineGrade(double average) {
        if (average >= 85) {
            return 'A';
        } else if (average >= 70) {
            return 'B';
        } else if (average >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {

        System.out.print("Please enter the number of students: ");

        Scanner scanner = new Scanner(System.in);
        int numOfStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Please enter the student's name: ");
            String studentName = scanner.nextLine();

            System.out.print("Please enter the number of exam scores: ");
            int numOfScores = scanner.nextInt();
            scanner.nextLine();

            double[] scores = new double[numOfScores];

            for (int j = 0; j < numOfScores; j++) {
                System.out.print("Please enter score " + (j + 1) + ": ");
                scores[j] = scanner.nextDouble();
            }
            scanner.nextLine();

            double average = calculateAverage(scores);

            char grade = determineGrade(average);

            System.out.println("\nStudent: " + studentName);
            System.out.println("Average Score: " + average);
            System.out.println("Grade: " + grade);
        }

        scanner.close();
    }
}
