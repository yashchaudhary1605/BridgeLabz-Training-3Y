class Vehicle {

    private String ownerName;
    private String vehicleType;

    private static double registrationFee = 5000;

   
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }


    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
        System.out.println("---------------------------");
    }

   
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}


public class VehicleRegistration {
    public static void main(String[] args) {
      
        Vehicle v1 = new Vehicle("Yash Chaudhary", "Car");
        Vehicle v2 = new Vehicle("Arjun Singh", "Bike");

       
        System.out.println("Before Updating Registration Fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

     
        Vehicle.updateRegistrationFee(7000);


        System.out.println("After Updating Registration Fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
