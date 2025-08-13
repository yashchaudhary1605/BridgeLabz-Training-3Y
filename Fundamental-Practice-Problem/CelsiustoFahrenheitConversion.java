package FewProblemRealtedToJava;

import java.util.Scanner;

public class CelsiustoFahrenheitConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

        System.out.printf("%.2f °C = %.2f °F%n", celsius, fahrenheit);

        
    }
}
