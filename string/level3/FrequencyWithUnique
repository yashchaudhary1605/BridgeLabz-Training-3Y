import java.util.*;

public class FrequencyWithUnique {

    // Method to find unique characters
    public static char[] uniqueCharacters(String text) {
        int n = text.length();
        char[] unique = new char[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean isUnique = true;

            // check if already added
            for (int j = 0; j < index; j++) {
                if (unique[j] == c) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[index++] = c;
            }
        }

        // shrink array
        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = unique[i];
        }
        return result;
    }

    // Method to find frequency using unique characters + ASCII
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; // ASCII frequencies

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] uniques = uniqueCharacters(text);

        String[][] result = new String[uniques.length][2];
        for (int i = 0; i < uniques.length; i++) {
            result[i][0] = String.valueOf(uniques[i]);
            result[i][1] = String.valueOf(freq[uniques[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] res = findFrequency(input);
        System.out.println("Character | Frequency");
        for (String[] row : res) {
            System.out.println("    " + row[0] + "     |    " + row[1]);
        }
    }
}
