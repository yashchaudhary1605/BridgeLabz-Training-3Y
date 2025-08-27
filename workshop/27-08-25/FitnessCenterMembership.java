import java.util.Scanner;

public class FitnessCenterMembership {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int monthlyFee = 1000;
        int quarterlyFee = 2500;
        int yearlyFee = 8000;

        boolean centerOpen = true; 

      
        while (centerOpen) {
           
            do {
              
                System.out.println("Select Membership Type:");
                System.out.println("1. Monthly (Rs." + monthlyFee + ")");
                System.out.println("2. Quarterly (Rs." + quarterlyFee + ")");
                System.out.println("3. Yearly (Rs." + yearlyFee + ")");
                int choice = sc.nextInt();

                int baseFee = 0;
                switch (choice) {
                    case 1:
                        baseFee = monthlyFee;
                        System.out.println("You selected Monthly Membership.");
                        break;
                    case 2:
                        baseFee = quarterlyFee;
                        System.out.println("You selected Quarterly Membership.");
                        break;
                    case 3:
                        baseFee = yearlyFee;
                        System.out.println("You selected Yearly Membership.");
                        break;
                    default:
                        System.out.println("Invalid choice! Defaulting to Monthly.");
                        baseFee = monthlyFee;
                }

               
                System.out.print("Enter number of members to register: ");
                int n = sc.nextInt();

                for (int i = 1; i <= n; i++) {
                    System.out.println("Registering Member " + i);

                
                    System.out.println("Is the member a Student or Senior Citizen? (yes=1 / no=0): ");
                    int discountChoice = sc.nextInt();

                    double finalFee = baseFee;
                    if (discountChoice == 1) {
                        finalFee = baseFee * 0.8; // 20% discount
                        System.out.println("Discount Applied! Final Fee = Rs." + finalFee);
                    } else {
                        System.out.println("No Discount. Final Fee = Rs." + finalFee);
                    }
                }

              
                System.out.println("Do you want to register more members? (yes=1 / no=0): ");
            } while (sc.nextInt() == 1);

          
            System.out.println("Keep the center open for more registrations? (yes=1 / no=0): ");
            int adminChoice = sc.nextInt();
            if (adminChoice == 0) {
                centerOpen = false;
                System.out.println("Center Closed. Thank you!");
            }
        }

        sc.close();
    }
}
