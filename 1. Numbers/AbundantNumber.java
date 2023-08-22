/**Checks if a given number is an Abundant number or not.
 * 
 * An Abundant number (also known as an excessive number or a redundant number) is a number for which the sum of its proper divisors is greater than the number itself.
 * For example, 12 is an Abundant number because its proper divisors are 1, 2, 3, 4, and 6, and 1 + 2 + 3 + 4 + 6 = 16, which is greater than 12.
 * example: 12 18 20 24 30 36 40 42 48 
 */

package Numbers;

import java.util.Scanner;

public class AbundantNumber {

	public static void main(String[] args) {
		
//		Scanner sc =  new Scanner(System.in);
//		System.out.print("Enter a number to print whether its Abundant no. or not : ");
//		int number = sc.nextInt();
//		sc.close();
//		
//		if(abundantNumber(number)) {
//			System.out.print(number + " is a Abundant number");
//		}
//		else {
//			System.out.print(number + " is not a Abundant number");
//		}
		
		Scanner sc = new Scanner(System.in);				// This code is when u want within range.
		System.out.print("Enter lower bound : ");
		int low = sc.nextInt();
		System.out.print("Enter higher bound : ");
		int high = sc.nextInt();
		sc.close();
		
		while(low <= high) {
			if(abundantNumber(low)) {
				System.out.print(low + " ");
			}
			low++;
		}

	}
	
	static boolean abundantNumber(int n) {
		
		int sum = 0;
		for(int i = 1; i <= n/2; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		return sum > n;
	}

}
