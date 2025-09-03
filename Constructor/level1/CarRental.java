class CarRental {
   
    String customerName;
    String carModel;
    int rentalDays;


    CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

  
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    
    double calculateTotalCost() {
        double dailyRate;

       
        switch (carModel.toLowerCase()) {
            case "sedan":
                dailyRate = 2000;
                break;
            case "suv":
                dailyRate = 3000;
                break;
            case "luxury":
                dailyRate = 5000;
                break;
            default:
                dailyRate = 1500;
        }

        return rentalDays * dailyRate;
    }

    
    void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: Rs. " + calculateTotalCost());
    }

  
    public static void main(String[] args) {
      
        CarRental r1 = new CarRental();
        System.out.println("Rental 1 (Default Constructor):");
        r1.displayDetails();

        System.out.println();

     
        CarRental r2 = new CarRental("Yash Chaudhary", "SUV", 4);
        System.out.println("Rental 2 (Parameterized Constructor):");
        r2.displayDetails();
    }
}
