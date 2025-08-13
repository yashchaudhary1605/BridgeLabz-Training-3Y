package FewProblemRealtedToJava;

import java.util.Scanner;

public class VolumeofaCylinder {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder (integer): ");
        int radius = scanner.nextInt();

        System.out.print("Enter the height of the cylinder (integer): ");
        int height = scanner.nextInt();

        // Approximate pi as 3 for integer calculation
        int pi = 3;

        // Compute volume (integer)
        int volume = pi * radius * radius * height;

        System.out.println("Approximate volume (integer) of the cylinder is: " + volume);

        
    }
}
