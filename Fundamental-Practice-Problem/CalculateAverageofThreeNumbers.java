import java.util.Scanner;

public class CalculateAverageofThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking three numbers as input
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = sc.nextDouble();

        // Calculating average
        double average = (num1 + num2 + num3) / 3;

        // Printing the result
        System.out.println("The average is: " + average);

       
    }
}
