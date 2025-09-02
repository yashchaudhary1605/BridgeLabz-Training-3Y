import java.util.*;

public class DeckOfCards {

    // Method to initialize deck
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle deck
    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute cards
    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsEach) {
        if (numPlayers * cardsEach > deck.length) {
            throw new IllegalArgumentException("Not enough cards to distribute!");
        }

        String[][] players = new String[numPlayers][cardsEach];
        int index = 0;

        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsEach; j++) {
                players[i][j] = deck[index++];
            }
        }
        return players;
    }

    // Method to print players' cards
    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + Arrays.toString(players[i]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] deck = initializeDeck();
        shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int numPlayers = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cardsEach = sc.nextInt();

        String[][] players = distributeCards(deck, numPlayers, cardsEach);
        printPlayers(players);
    }
}
