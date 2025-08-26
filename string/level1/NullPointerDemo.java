package string.level1;
public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null; // initialized to null
        // This will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null; // initialized to null
        try {
            // This will throw NullPointerException
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Cannot call methods on a null object.");
        }
    }

    public static void main(String[] args) {
        // 1. Call the method that generates exception
        System.out.println("---- Generating Exception ----");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Program crashed with NullPointerException.");
        }

        // 2. Call the method that handles exception
        System.out.println("\n---- Handling Exception ----");
        handleException();
    }
}
