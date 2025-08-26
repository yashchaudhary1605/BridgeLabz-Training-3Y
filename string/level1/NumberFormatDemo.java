package string.level1;

import java.util.*;

public class NumberFormatDemo {

 
    public static void generateException(String text) {
        
        int num = Integer.parseInt(text);
        System.out.println("Converted number: " + num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a value: ");
        String text = sc.next();

     
        System.out.println("\n---- Generating Exception ----");
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Program crashed with NumberFormatException: " + e);
        }

      
        System.out.println("\n---- Handling Exception ----");
        handleException(text);

        
    }
}

