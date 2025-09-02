import java.util.*;

public class VowelConsonantTable {
    public static String classifyChar(char ch) {
        if (!Character.isLetter(ch)) return "Not a Letter";
        char low = (ch >= 'A' && ch <= 'Z') ? (char)(ch+32) : ch;
        if ("aeiou".indexOf(low) != -1) return "Vowel";
        return "Consonant";
    }

    public static String[][] analyze(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = classifyChar(text.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] table = analyze(text);

        System.out.println("Char\tType");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
