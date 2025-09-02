class MovieTicket {
    
    String movieName;
    String seatNumber;
    double price;

   
    MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

  
    void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

  
    void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
        System.out.println("----------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
    
        MovieTicket ticket1 = new MovieTicket("Avengers: Endgame", "Not Assigned", 0.0);

       
        ticket1.displayTicket();

        ticket1.bookTicket("A12", 250.0);


        ticket1.displayTicket();
    }
}
