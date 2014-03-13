/**
 * @author Mark Broadhead
 * @version 3/13/2014
 */
import java.util.ArrayList;
/*
 * This program finds the single pythagorean triplet for which a + b + c = 1000
 * a^2 + b^2 = c^2 and a < b < c
 */

public class Problem09 {
  private ArrayList<int> intList = new ArrayList<int>(); // Generic ArrayList
  public static void main(String[] args) {
    findPowers();
    // I am going to use an arraylist to store the powers of 2, 2^2, 3^2, 4^2, ... 999^2. That way I only have to calculate powers once and can focus on addition.
    // 

  }
  public static void findPowers(){
    for ( int i = 0; i < 1000; i++ ) {
     intList.add(Math.pow(i+1,2)); 
     System.out.println(Math.pow(i+1,2));
    }
  }
}
