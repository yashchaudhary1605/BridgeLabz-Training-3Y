package FewProblemRealtedToJava;

import java.util.Scanner;

public class CalculateSimpleInterest {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate (annual percent): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time (years): ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100.0;

        System.out.printf("Simple Interest = %.2f%n", simpleInterest);      
    }
}
