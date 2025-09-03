class Book {
   
    String title;
    String author;
    double price;

    
    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

   
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

   
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

   
    public static void main(String[] args) {
     
        Book b1 = new Book();
        System.out.println("Book 1 (Default Constructor):");
        b1.displayDetails();

        System.out.println();

    
        Book b2 = new Book("The Alchemist", "Paulo Coelho", 399.99);
        System.out.println("Book 2 (Parameterized Constructor):");
        b2.displayDetails();
    }
}
