/**
 * 
 */
package Problem04;

import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author orcslayermack
 *
 */
public class Problem04 {

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		// iterate through both numbers starting at the top, stopping 1/2 of the way through. 
		LinkedList<Integer> myList = new LinkedList<Integer>();
		for ( int i = 999 ; i > 500 ; i-- ) {
			for ( int j = 999 ; j > 500 ; j-- ) {
				int num = i * j;
				if ( palindrome.isPalindrome(num) == true ) {
					myList.add(num);
				}
			}
		}
		// Print the largest on the list.
		int largest = 0;
		Iterator<Integer> iteratorOfDoom = myList.iterator();
		while ( iteratorOfDoom.hasNext() ) {
			if ( largest < iteratorOfDoom.next() ) {
				largest = iteratorOfDoom.next();
			}
		}
		System.out.println("The largest Palindrome is: " + largest);
	}
}
