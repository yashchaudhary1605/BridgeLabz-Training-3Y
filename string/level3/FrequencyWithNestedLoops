import java.util.*;

public class FrequencyWithNestedLoops {

    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int n = chars.length;
        int[] freq = new int[n];

        for (int i = 0; i < n; i++) {
            freq[i] = 1; // initialize count
            if (chars[i] == '0') continue;

            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark visited
                }
            }
        }

        // Store results
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                result.add(chars[i] + " -> " + freq[i]);
            }
        }
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] result = findFrequency(input);
        System.out.println("Character Frequencies:");
        for (String s : result) {
            System.out.println(s);
        }
    }
}
