/*
 * @author Mark Broadhead
 * @date Nov 28 2013
 */

package project_euler;

public class Problem03 {
	static int testInt = 0;

	public static void main(String[] args) {
		NumberList numberList = factor(testInt);
		
	/*	while () {
			
		}*/
		//int[] testArray = {1,2,3,4,24,78,203,49,302,59,3};
		//System.out.println("the largest integer is " + largestInt(testArray));

		//primeFactors = primeFactors(testint);
		//.out.println("The largest prime factor of " + testInt + " is: " + largestInt(primeFactors(testInt)));

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
	public static NumberList factor(int a) {
		NumberList listOfFactors = new NumberList(1);
		
		if (isPrime(a) == true) {
			//TODO figure out what happens if the given parameter is prime.
			return null;
		}
		else {
		    for (int i = 2; i < a; i++) {
		    	if ( a%i == 0 ) {
		    		Node node = new Node(i);
		    		listOfFactors.addNode(node);
		    	}
		    }
			return listOfFactors;
		}
	}
	
	/*
	 * 
	 * @param a integer array
	 * @return the largest integer in the array
	 */
	


}
