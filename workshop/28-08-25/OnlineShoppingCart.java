


import java.util.*;

public class OnlineShoppingCart {

    
    public static void showMenu() {
        System.out.println("===== Product Menu =====");
        System.out.println("1. Laptop - Rs. 40000");
        System.out.println("2. Mobile - Rs. 15000");
        System.out.println("3. Headphones - Rs. 2000");
        System.out.println("4. Smartwatch - Rs. 5000");
        System.out.println("5. Exit");
        System.out.println("========================");
    }


    public static int getProductPrice(int choice) {
        switch (choice) {
            case 1: return 40000;
            case 2: return 15000;
            case 3: return 2000;
            case 4: return 5000;
            default: return 0;
        }
    }

 
    public static int calculateFinalAmount(int totalAmount) {
        if (totalAmount > 5000) {
            System.out.println("Discount Applied: 10%");
            totalAmount -= totalAmount * 0.1;
        }
        return totalAmount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean moreCustomers = true;
        while (moreCustomers) {
            int totalAmount = 0;
            int choice;
            do {
                showMenu();
                System.out.print("Enter product choice: ");
                choice = sc.nextInt();

                if (choice >= 1 && choice <= 4) {
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    totalAmount += getProductPrice(choice) * qty;
                }
            } while (choice != 5);
            totalAmount = calculateFinalAmount(totalAmount);
            System.out.println("Final Bill: Rs. " + totalAmount);

            System.out.print("\nNext Customer? (yes/no): ");
            String ans = sc.next();
            moreCustomers = ans.equalsIgnoreCase("yes");
        }
        System.out.println("Thank you for shopping!");
        
    }
}
