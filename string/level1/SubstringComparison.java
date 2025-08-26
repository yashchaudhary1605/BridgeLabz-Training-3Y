package string.level1;

import java.util.*;

public class SubstringComparison {

    public static String substringWithCharAt(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareWithCharAt(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return s1 == s2;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();   // ✅ allows spaces

        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // ✅ basic validation
        if (start < 0 || end > text.length() || start >= end) {
            System.out.println("Invalid indices!");
        } else {
            String manualSub = substringWithCharAt(text, start, end);
            String builtInSub = text.substring(start, end);

            boolean compareResult = compareWithCharAt(manualSub, builtInSub);

            System.out.println("Substring using charAt(): " + manualSub);
            System.out.println("Substring using substring(): " + builtInSub);
            System.out.println("Do both substrings match? " + compareResult);
        }

        sc.close();
    }
}
