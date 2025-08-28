import java.util.*;

public class CinemaSeatAllocation {

   
    static int[][] seats = new int[5][10];

   
    public static void displaySeats() {
        System.out.println("\n--- Cinema Seat Layout (0 = Empty, 1 = Booked) ---");
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    
    public static boolean allocateFamilySeats(int row) {
        for (int j = 0; j <= seats[row].length - 3; j++) {
            if (seats[row][j] == 0 && seats[row][j + 1] == 0 && seats[row][j + 2] == 0) {
                // Book them
                seats[row][j] = seats[row][j + 1] = seats[row][j + 2] = 1;
                System.out.println("✅ Family of 3 allocated seats at Row " + (row + 1) + ", Seats " + (j + 1) + "-" + (j + 3));
                return true;
            }
        }
        return false;
    }

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== Cinema Seat Allocation =====");
            System.out.println("1. Display Seats");
            System.out.println("2. Allocate Family of 3");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    displaySeats();
                    break;

                case 2:
                    System.out.print("Enter row number (1 to 5): ");
                    int row = sc.nextInt() - 1;
                    if (row >= 0 && row < 5) {
                        if (!allocateFamilySeats(row)) {
                            System.out.println("❌ Not available in Row " + (row + 1));
                        }
                    } else {
                        System.out.println("Invalid row!");
                    }
                    break;

                case 3:
                    running = false;
                    System.out.println("Exiting system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        
    }
}
