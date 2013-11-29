/*
 * @author Mark Broadhead
 * @date Nov 28 2013
 */

package project_euler;

public class Problem03 {
	int testInt = 0;

	public static void main(String[] args) {

		//int[] testArray = {1,2,3,4,24,78,203,49,302,59,3};
		//System.out.println("the largest int is " + largestInt(testArray));

		//primeFactors = primeFactors(testint);
		//.out.println("The largest prime factor of " + testint + " is: " + largestInt(primeFactors(testInt)));

	}
	/**
	 * 
	 * @param a is an integer tested to see if it is prime.
	 * @return true if the int given is true, else false
	 */
	protected static boolean isPrime(int a){
		for (int i = 2; i < (a/2)+1; i++) {
			if ( a%i == 0 ) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @summary takes an integer and returns a NumberList of all factors.
	 * @param a 
	 * @return NumberList
	 */
	public static NumberList factors(int a) {
		NumberList listOfFactors = new NumberList(0);
		if (isPrime(a) == true) {
			return null;
		}
		else {
		    for (int i = 1; i < a; i++) {
		    	if ( a%i == 0 ) {
		    		Node node = new Node(i);
		    		listOfFactors.addNode();
		    	}
		    }
		    listOfFactors.
			return listOfFactors;
		}
	}

	/*
	 * 
	 * @param a integer array
	 * @return the largest integer in the array
	 */
	public static int largestInt(int[] a) {
		int largest = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
			}
		}
		return largest;
	}

	/*public static int largestInt() {
	}*/
}
