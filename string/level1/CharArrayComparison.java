package string.level1;

import java.util.Scanner;

public class CharArrayComparison {

    // Method to return characters of a string without using toCharArray()
    public static char[] getCharsManual(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1 == null || arr2 == null) {
            return arr1 == arr2; // both null → true
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String text = sc.next();   // using next() as per hint

        // Get character array manually
        char[] manualChars = getCharsManual(text);

        // Get character array using built-in method
        char[] builtInChars = text.toCharArray();

        // Compare the arrays
        boolean arraysEqual = compareCharArrays(manualChars, builtInChars);

        // Display results
        System.out.print("Manual char array: ");
        for (char c : manualChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("Built-in char array: ");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Do both arrays match? " + arraysEqual);

        sc.close();
    }
}
