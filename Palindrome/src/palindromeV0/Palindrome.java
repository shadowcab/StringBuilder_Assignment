package palindromeV0;

public class Palindrome {

	public boolean palindromChecker(String... words) {
		boolean isPalindrome = true;
		String strWord;
		StringBuilder sbWord;
		StringBuilder sbWordReversed;

		for (String word : words) {

			// Remove all punctuation and whitespace in word item before processing
			// This is based on Dictionary.com's definition for palindrome
			strWord = word.replaceAll("\\p{Punct}|\\s+", "").toLowerCase();
			
			// Convert String item to StringBuilder type
			sbWord = new StringBuilder(strWord);
			
			// Reverse character order in sbItem
			sbWordReversed = sbWord.reverse();

			// Compare word to reversed word.  Note: all words are considered palindromes until proven
			// otherwise. If not a palindrome, set flag to false.
			if (!strWord.equals(sbWordReversed.toString())) {
				isPalindrome = false;
				System.out.println("Failed on: " + sbWordReversed.toString() + " " + strWord);
			}
		}
		System.out.println();
		return isPalindrome;
	}

}
