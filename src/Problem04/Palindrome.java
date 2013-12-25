package Problem04;

public class Palindrome {
	public boolean isPalindrome(int a) {
		boolean test = true;
		String length = "" + a;
		char[] chars = new char[length.length()];
		chars = ("" + a).toCharArray();
		while ( test == true ) { 
			for ( int i = 0 ; i <= chars.length / 2 ; i++) {
				if ( chars[i] != chars[chars.length-i-1] ) {
					test = false;
				}
			}
			return test;
		}
		return false;
	}
}
