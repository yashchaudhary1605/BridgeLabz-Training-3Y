package string.level1;

import java.util.*;

public class IllegalArgumentDemo {

    
    public static void generateException(String text) {
      
        System.out.println("Substring with invalid range: " + text.substring(5, 2));
    }


    public static void handleException(String text) {
        try {
            // Start index > End index
            System.out.println("Substring with invalid range: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String text = sc.next();

      
        System.out.println("\n---- Generating Exception ----");
        try {
            generateException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Program crashed with IllegalArgumentException: " + e);
        }

        System.out.println("\n---- Handling Exception ----");
        handleException(text);

        
    }
}

