import java.util.*;

public class RockPaperScissors {
    static String[] choices = {"rock","paper","scissors"};

    public static String computerChoice() {
        int idx = (int)(Math.random()*3);
        return choices[idx];
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static void playGames(int rounds) {
        int userWins=0, compWins=0, draws=0;
        Scanner sc = new Scanner(System.in);

        for (int i=1;i<=rounds;i++) {
            System.out.print("Enter rock/paper/scissors: ");
            String user = sc.next().toLowerCase();
            String comp = computerChoice();
            String winner = findWinner(user, comp);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            else draws++;

            System.out.println("Round " + i + ": User=" + user + " Computer=" + comp + " Winner=" + winner);
        }

        int total = rounds;
        double userPercent = (userWins*100.0)/total;
        double compPercent = (compWins*100.0)/total;

        System.out.println("\nFinal Stats:");
        System.out.println("User Wins: " + userWins + " (" + userPercent + "%)");
        System.out.println("Computer Wins: " + compWins + " (" + compPercent + "%)");
        System.out.println("Draws: " + draws);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rounds? ");
        int rounds = sc.nextInt();
        playGames(rounds);
    }
}
