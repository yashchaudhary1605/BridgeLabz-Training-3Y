import java.util.Scanner;

public class CricketScoreAnalyzer {
    
  
    public static int findHighest(int[] scores) {
        int highest = scores[0];
        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
        }
        return highest;
    }

  
    public static int findLowest(int[] scores) {
        int lowest = scores[0];
        for (int score : scores) {
            if (score < lowest) {
                lowest = score;
            }
        }
        return lowest;
    }

   
    public static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }


    public static void printCenturyScorers(int[] scores) {
        boolean found = false;
        for (int score : scores) {
            if (score >= 100) {
                System.out.println("Century Scorer: " + score);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No Century Scorer.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter number of batsmen: ");
        int n = sc.nextInt();
        int[] scores = new int[n];

     
        System.out.println("Enter runs scored by each batsman:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }


        int highest = findHighest(scores);
        int lowest = findLowest(scores);
        double average = calculateAverage(scores);

        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Average Score: " + average);
    
        printCenturyScorers(scores);
    }
}
