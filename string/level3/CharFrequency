import java.util.*;

public class CharFrequency {

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];

        // Count frequencies
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Prepare 2D result
        List<String[]> resultList = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] > 0) {
                resultList.add(new String[]{String.valueOf(c), String.valueOf(freq[c])});
                freq[c] = 0; // avoid duplication
            }
        }

        return resultList.toArray(new String[0][0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] result = findFrequency(input);
        System.out.println("Character | Frequency");
        for (String[] row : result) {
            System.out.println(row[0] + "         | " + row[1]);
        }
    }
}
