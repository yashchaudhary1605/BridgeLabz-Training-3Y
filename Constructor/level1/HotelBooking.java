class HotelBooking {
    
    String guestName;
    String roomType;
    int nights;

 
    HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

   
    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

  
    void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

   
    public static void main(String[] args) {
        
        HotelBooking b1 = new HotelBooking();
        System.out.println("Booking 1 (Default Constructor):");
        b1.displayBooking();

        System.out.println();

      
        HotelBooking b2 = new HotelBooking("Yash Chaudhary", "Deluxe", 3);
        System.out.println("Booking 2 (Parameterized Constructor):");
        b2.displayBooking();

        System.out.println();

        
        HotelBooking b3 = new HotelBooking(b2);
        System.out.println("Booking 3 (Copy Constructor):");
        b3.displayBooking();
    }
}
