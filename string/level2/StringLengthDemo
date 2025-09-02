import java.util.*;

public class StringLengthDemo {
    // Method to find string length without length()
    public static int myLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // will throw exception at end
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        System.out.println("User-defined length: " + myLength(text));
        System.out.println("Built-in length(): " + text.length());
    }
}
