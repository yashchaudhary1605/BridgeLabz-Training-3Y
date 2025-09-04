
class Book {
    public String ISBN;        
    protected String title;   
    private String author;     

    
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}


class EBook extends Book {
    private double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }


    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN (public): " + ISBN);       
        System.out.println("Title (protected): " + title);     
        System.out.println("Author (via getter): " + getAuthor()); 
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("--------------------------");
    }
}


public class BookLibrarySystem {
    public static void main(String[] args) {
     
        Book b1 = new Book("978-81-940145-0-5", "Java Programming", "Herbert Schildt");
        b1.displayBookDetails();

      
        b1.setAuthor("James Gosling");
        System.out.println("Updated Author: " + b1.getAuthor());
        System.out.println();

      
        EBook eb = new EBook("978-93-325-4351-5", "Data Structures", "Mark Weiss", 5.6);
        eb.displayEBookDetails();
    }
}
