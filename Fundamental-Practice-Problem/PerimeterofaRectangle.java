package FewProblemRealtedToJava;

import java.util.Scanner;

public class PerimeterofaRectangle {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle (integer): ");
        int length = scanner.nextInt();

        System.out.print("Enter the width of the rectangle (integer): ");
        int width = scanner.nextInt();

        int perimeter = 2 * (length + width);

        System.out.println("Perimeter of the rectangle is: " + perimeter);

       
    }

}
