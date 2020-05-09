package palindromeV0;

public class Palindrome {

	public boolean palindromChecker(String... words) {
		boolean isPalindrome = true;
		String strWord;
		StringBuilder sbWord;
		StringBuilder sbWordReversed;

		for (String word : words) {

			// Remove all punctuation and whitespace in "word" and convert to lower case before 
			// testing for palindrome.  This constraint is based on Dictionary.com's definition 
			// and examples of palindromes (https://www.dictionary.com/browse/palindrome).
			strWord = word.replaceAll("\\p{Punct}|\\s+", "").toLowerCase();
			
			// Convert (String) word to StringBuilder type
			sbWord = new StringBuilder(strWord);
			
			// Reverse character order in (StringBuilder) word
			sbWordReversed = sbWord.reverse();

			// Compare word to reversed word.  Note: all words are considered palindromes until proven
			// otherwise. If not a palindrome, set flag to false.
			if (!strWord.equals(sbWordReversed.toString())) {
				isPalindrome = false;
				// Display the failed palindrome candidates in normal and reversed order
				System.out.println("Failed on: " + strWord + " " + sbWordReversed.toString());
			}
		}
		System.out.println();
		return isPalindrome;
	}

}
