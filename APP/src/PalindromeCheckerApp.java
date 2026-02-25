import java.util.Scanner;

public static void main(String[] args) {

    // Hardcoded string (String Literal)
    String word = "madam";

    // Reverse the string using StringBuilder's reverse() method
    String reversed = new StringBuilder(word).reverse().toString();

    // Check if original and reversed strings are equal
    if (word.equals(reversed)) {
        System.out.println(word + " is a Palindrome.");
    } else {
        System.out.println(word + " is NOT a Palindrome.");
    }
}
}