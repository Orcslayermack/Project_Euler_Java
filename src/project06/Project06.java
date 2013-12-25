package project06;

public class Project06 {

	public static void main(String[] args) {
		//find sum of squares 1^2 + 2^2 ... 99^2
		double a = 0;
		double bcounter = 0;
		for ( int i = 1 ; i <= 100 ; i++ ) {
			a = a + Math.pow(i, 2);
			bcounter = bcounter + i;
		}
		// find square of the sum. (1+2+3...+99+100)^2
		double b = Math.pow(bcounter, 2);
		//= Math.pow(1,2);
		System.out.println("The sum of squares is " + a);
		System.out.println("The square of the sum is " + b);
		
		double c = b - a;
		System.out.println("The answer is " + c);
		// I got a number in scientific notation but converted it for the site.
	}
}
