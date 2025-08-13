package FewProblemRealtedToJava;

import java.util.Scanner;

public class AreaofaCircle {
    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle (integer): ");
        int radius = scanner.nextInt();

        // Approximate pi as 3 for integer calculation
        int pi = 3;
        int area = pi * radius * radius; // area as integer

        System.out.println("Approximate area  of the circle with radius " + radius + " is: " + area);

}
    
}
