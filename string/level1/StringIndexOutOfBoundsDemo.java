package string.level1;

import java.util.*;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Accessing index beyond string length
        System.out.println("Character at invalid index: " + text.charAt(text.length())); 
        // (last valid index is text.length()-1)
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            // Accessing index beyond string length
            System.out.println("Character at invalid index: " + text.charAt(text.length())); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
            System.out.println("Invalid index! Valid range: 0 to " + (text.length() - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take string input from user
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("\n---- Generating Exception ----");
        try {
            generateException(text); // This will throw exception
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Program crashed with: " + e);
        }

        System.out.println("\n---- Handling Exception ----");
        handleException(text); // This will safely handle exception

        
    }
}
