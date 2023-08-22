 /**This program calculates the sum of natural numbers up to a given limit and within a specified range[n1, n2].
  *
  * @param n1 The lower bound of the range.
  * @param n2 The higher bound of the range.
  */

package Miscellaneous;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to add all natural numbers until that no. : ");
		int number = sc.nextInt();
		sc.close();

		System.out.println(number * (number + 1) / 2);

//		Scanner sc = new Scanner(System.in);				// This code is when u want within range.
//		System.out.print("Enter lower bound : ");
//		int low = sc.nextInt();
//		System.out.print("Enter higher bound : ");
//		int high = sc.nextInt();
//		sc.close();
//		
//		sumOfNaturalNumbersWithRange(low, high);
		
	}
	
	static void sumOfNaturalNumbersWithRange(int n1, int n2){
		
		System.out.println((n2 * (n2 + 1) / 2) - (n1 * (n1 + 1) / 2) + n1);
	}

}
