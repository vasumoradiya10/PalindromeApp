import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Hardcoded string (String Literal)
        String word ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Text");
        String word = sc.nextLine();
        int length = word.length();
        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}
