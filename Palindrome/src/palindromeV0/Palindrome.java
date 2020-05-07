package palindromeV0;

public class Palindrome {

	public boolean palindromChecker(String... words) {
		String strIn;
		StringBuilder sbForward;
		StringBuilder sbReverse;
		boolean isPalindrome = true;
				
		for (String item : words) {
			// Remove whitespaces characters, if any, from input since we are testing for palindrome words
			strIn = item.replaceAll("\\s+", "").toLowerCase();
			// Convert word from String to StringBuilder
			sbForward = new StringBuilder(strIn);
			// Create a reverse version of StringBuilder version
			sbReverse = sbForward.reverse();
			
			// Test the compare the word to it's reverse version
			if (!strIn.equals(sbReverse.toString())) {
				isPalindrome = false;
				System.out.println("Failed on: " + sbReverse.toString() + " " + strIn);
			}
		}
		System.out.println();
		return isPalindrome;
	}

}
