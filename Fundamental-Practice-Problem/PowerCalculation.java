import java.util.*;
public class PowerCalculation {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking base input
        System.out.print("Enter the base: ");
        double base = sc.nextDouble();

        // Taking exponent input
        System.out.print("Enter the exponent: ");
        double exponent = sc.nextDouble();

        // Calculating power without loops or conditionals
        double result = Math.pow(base, exponent);

        // Printing the result
        System.out.println(base + " raised to the power " + exponent + " is " + result);

        
    }
}
