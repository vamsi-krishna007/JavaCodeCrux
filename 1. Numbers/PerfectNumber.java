/**Checks if a given number is a Perfect number or not.
 * 
 * A Perfect number is a positive integer that is equal to the sum of its proper divisors (excluding itself).
 * For example, 28 is a Perfect number because its proper divisors are 1, 2, 4, 7, and 14, and 1 + 2 + 4 + 7 + 14 = 28.
 * example: 6 28 496 8128
 */

package Numbers;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check if it's a Perfect no. or not : ");
		int number = sc.nextInt();
		sc.close();
		
		if(perfectNumber(number)) {
			System.out.println(number + " is a Perfect Number.");
		}
		else {
			System.out.println(number + " is not a Perfect Number.");
		}

		
//		Scanner sc = new Scanner(System.in);				// This code is when u want within range.
//		System.out.print("Enter lower bound : ");
//		int low = sc.nextInt();
//		System.out.print("Enter higher bound : ");
//		int high = sc.nextInt();
//		sc.close();
//		
//		while(low <= high) {
//			if(perfectNumber(low)) {
//				System.out.print(low + " ");
//			}
//			low++;
//		}
		
	}
	
	static boolean perfectNumber(int n) {
		
		int sum = 0;
		for(int i = 1; i <= n/2; i++) {
			if( n % i == 0) {
				sum = sum + i;
			}
		}
		
		return n == sum;
	}
}
