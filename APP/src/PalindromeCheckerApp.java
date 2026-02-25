import java.util.Scanner;
public static void main(String[] args) {

    // Hardcoded string
    String word ;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter Text");
    // Convert String to Character Array
    char[] charArray = word.toCharArray();

    // Variable to track palindrome status
    boolean isPalindrome = true;

    // Compare characters from both ends
    for (int i = 0; i < charArray.length / 2; i++) {
        if (charArray[i] != charArray[charArray.length - 1 - i]) {
            isPalindrome = false;
            break;
        }
    }
}
