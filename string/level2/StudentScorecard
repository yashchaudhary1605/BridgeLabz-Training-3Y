import java.util.*;

public class StudentScorecard {

    // a. Generate random scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3]; // PCM
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + rand.nextInt(90); // random 2-digit (10-99)
            }
        }
        return scores;
    }

    // b. Calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3]; 
        // [total, average, percentage]

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100;

            // round to 2 decimal places
            avg = Math.round(avg * 100.0) / 100.0;
            perc = Math.round(perc * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = avg;
            results[i][2] = perc;
        }
        return results;
    }

    // c. Assign grade based on percentage
    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double perc = results[i][2];
            if (perc >= 80) grades[i] = "A";
            else if (perc >= 70) grades[i] = "B";
            else if (perc >= 60) grades[i] = "C";
            else if (perc >= 50) grades[i] = "D";
            else if (perc >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    // d. Display scorecard
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-5s %-8s %-8s %-8s %-8s %-10s %-12s %-6s\n", 
                          "ID", "Physics", "Chem", "Math", "Total", "Average", "Percent", "Grade");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-5d %-8d %-8d %-8d %-8.0f %-10.2f %-12.2f %-6s\n", 
                              (i+1), scores[i][0], scores[i][1], scores[i][2], 
                              results[i][0], results[i][1], results[i][2], grades[i]);
        }
        System.out.println("---------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);

        displayScorecard(scores, results, grades);
    }
}
