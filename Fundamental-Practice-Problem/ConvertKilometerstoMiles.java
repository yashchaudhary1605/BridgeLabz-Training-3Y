import java.util.Scanner;

public class ConvertKilometerstoMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking distance in kilometers from user
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();

        // Converting kilometers to miles
        double miles = kilometers * 0.621371;

        // Displaying the result
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

       
    }
}
