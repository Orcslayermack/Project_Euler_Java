/*
 * @author Mark Broadhead
 * @date Nov 28 2013
 */

package project_euler;

public class Problem03 {
	static long testLong = 600851475143L;
	static NumberList numberList;

	public static void main(String[] args) {
		// get list of factors
		numberList = factor(testLong);
		System.out.println("finished factoring");
		// filter out non-primes
		numberList = sieve(numberList);
		System.out.println("finished the seive");
		// print largest of the integers


				{ // final prime check
			numberList.first();
			boolean loop = true;
			while ( loop == true ) {
				numberList.current.printNumber();
				if ( isPrime(numberList.current.getNumber()) != true ) {
					numberList.removeNode();
				}
				if ( numberList.isLast() ) {
					loop = false;
				}
				numberList.next();
			}
		}
		System.out.println("The largest prime factor for " + testLong + " is: " + numberList.largestInt(numberList));

		//long[] testArray = {1,2,3,4,24,78,203,49,302,59,3};
		//System.out.println("the largest integer is " + largestInt(testArray));

		//primeFactors = primeFactors(testint);
		//.out.println("The largest prime factor of " + testInt + " is: " + largestInt(primeFactors(testInt)));
		
	}

	/**
	 * @summary takes an integer and returns a NumberList of all factors.
	 * @param a 
	 * @return NumberList
	 */
	public static NumberList factor(long a) {
		NumberList listOfFactors = new NumberList(1);

		for (long i = 2 ; i < a / 2 + 1 ; i++) {
			if ( a % i == 0) {
				Node node = new Node(i);
				listOfFactors.addNode(node);
			}
		}
		return listOfFactors;
	}

	public static NumberList sieve(NumberList numberList) {
		NumberList list = numberList;
		// go through the list and do a sieve;
		for ( int i = 2 ; i < testLong / 2 + 1 ; i++ ) {
			list.first();
			if ( list.current.getNumber() % i == 0 ) {
				list.removeNode();	
			}
		}
		return list;
	}

	/**
	 * 
	 * @param a is an integer tested to see if it is prime.
	 * @return true if the long given is true, else false
	 */
	protected static boolean isPrime(long a){
		for ( long i = 2; i < ( a / 2 ) + 1; i++ ) {
			if ( a % i == 0 ) {
				return false;
			}
		}
		return true;
	}
}