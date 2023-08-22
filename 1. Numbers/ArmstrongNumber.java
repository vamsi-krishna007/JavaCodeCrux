/**This program determines whether a given number is an Armstrong number or not.
 * 
 * An Armstrong number (also known as a narcissistic number or pluperfect digital invariant)
 * of a given n-digit number is a number that is the sum of its own digits, each raised to the power of n.
 * For example, 153 is an Armstrong number because: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.
 * example: 1 2 3 4 5 6 7 8 9 153 370 371 407 1634 8208 9474
 */

package Numbers;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter a number to print whether its Armstrong no. or not : ");
		int number = sc.nextInt();
		sc.close();
		
		if(armstrongNumber(number)) {
			System.out.print(number + " is a Armstrong number");
		}
		else {
			System.out.print(number + " is not a Armstrong number");
		}
		
//		Scanner sc = new Scanner(System.in);				// This code is when u want within range.
//		System.out.print("Enter lower bound : ");
//		int low = sc.nextInt();
//		System.out.print("Enter higher bound : ");
//		int high = sc.nextInt();
//		sc.close();
//		
//		while(low <= high) {
//			if(armstrongNumber(low)) {
//				System.out.print(low + " ");
//			}
//			low++;
//		}

	}
	
	static boolean armstrongNumber(int n) {
		
		int temp = n;
		int totalDigits = digits(n);
		double sum = 0;
		while(temp != 0) {
			int lastDigit = temp % 10;
			sum = sum + Math.pow(lastDigit, totalDigits);
			temp = temp / 10;
		}
		
		if(sum == n) return true;
		return false;
		
	}
	
	static int digits(int n) {
		
		int temp = n;
		int count = 0;
		while( temp != 0) {
			temp = temp / 10;
			count++;
		}
		
		return count;
	}

}
