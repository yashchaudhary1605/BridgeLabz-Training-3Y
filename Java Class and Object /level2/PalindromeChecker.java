class PalindromeChecker {
   
    String text;


    PalindromeChecker(String text) {
        this.text = text;
    }

    
    boolean isPalindrome() {
        String cleanText = text.replaceAll("\\s+", "").toLowerCase(); // ignore spaces & case
        int left = 0;
        int right = cleanText.length() - 1;

        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

   
    void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + text + "\" is NOT a Palindrome.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
      
        PalindromeChecker p1 = new PalindromeChecker("madam");
        PalindromeChecker p2 = new PalindromeChecker("racecar");
        PalindromeChecker p3 = new PalindromeChecker("hello");
        PalindromeChecker p4 = new PalindromeChecker("A man a plan a canal Panama");

        p1.displayResult();
        p2.displayResult();
        p3.displayResult();
        p4.displayResult();
    }
}
