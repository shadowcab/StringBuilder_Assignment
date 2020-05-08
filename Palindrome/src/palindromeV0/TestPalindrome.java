package palindromeV0;

public class TestPalindrome {
	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		boolean result = palindrome.palindromChecker("", "a", "aa", "bb", "aba", "bab", "bob", "1- b -1", "Madam, I'm Adam", "Poor Dan is in a droop", "dud");
		System.out.println("All strings entered were palindromes: " + result);
	}
}
