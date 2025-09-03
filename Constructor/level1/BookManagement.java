class Book {
    
    String title;
    String author;
    double price;
    boolean available;

  
    Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }


    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You have successfully borrowed \"" + title + "\" by " + author + ".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }


    public static void main(String[] args) {
       
        Book b1 = new Book("The Alchemist", "Paulo Coelho", 399.99, true);
        Book b2 = new Book("Atomic Habits", "James Clear", 499.50, false);

        System.out.println("Book 1:");
        b1.displayDetails();
        System.out.println();
        
        System.out.println("Book 2:");
        b2.displayDetails();
        System.out.println();

       
        System.out.println("Trying to borrow Book 1:");
        b1.borrowBook();
        System.out.println();

        System.out.println("Trying to borrow Book 2:");
        b2.borrowBook();
    }
}
