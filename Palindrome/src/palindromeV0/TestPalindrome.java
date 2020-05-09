package palindromeV0;

public class TestPalindrome {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.palindromChecker("bob", "Sue", "aaa", "Gossai");
        System.out.println("All strings entered were palindromes: " + result);
    }
}
