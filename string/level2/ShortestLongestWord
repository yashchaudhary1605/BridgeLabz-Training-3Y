import java.util.*;

public class ShortestLongestWord {
    public static int myLength(String text) {
        int count = 0;
        try { while (true) { text.charAt(count); count++; } }
        catch (Exception e) { return count; }
    }

    public static String[] mySplit(String text) {
        int len = myLength(text);
        List<String> words = new ArrayList<>();
        String word = "";
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') word += ch;
            else if (!word.isEmpty()) { words.add(word); word = ""; }
        }
        if (!word.isEmpty()) words.add(word);
        return words.toArray(new String[0]);
    }

    public static String[][] wordLengthTable(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(myLength(words[i]));
        }
        return result;
    }

    public static String[] shortestLongest(String[][] table) {
        String shortest = table[0][0];
        String longest = table[0][0];
        for (String[] row : table) {
            if (Integer.parseInt(row[1]) < shortest.length()) shortest = row[0];
            if (Integer.parseInt(row[1]) > longest.length()) longest = row[0];
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = mySplit(text);
        String[][] table = wordLengthTable(words);
        String[] result = shortestLongest(table);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}
