/**Checks if a given number is a Harshad number or not.
 * 
 * A Harshad number (also known as a Niven number or a digital root) is a number that is divisible by the sum of its digits.
 * For example, 18 is a Harshad number because the sum of its digits is 1 + 8 = 9, and 18 is divisible by 9.
 * example: 1 2 3 4 5 6 7 8 9 10 12 18 20 21 24 27 30 36 40 42 45 48 50 54 60 63 70 72 80 81 84 90 100
 */

package Numbers;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter a number to print whether its Harshad no. or not : ");
		int number = sc.nextInt();
		sc.close();
		
		if(harshadNumber(number)) {
			System.out.print(number + " is a Harshad number");
		}
		else {
			System.out.print(number + " is not a Harshad number");
		}
		
//		Scanner sc = new Scanner(System.in);				// This code is when u want within range.
//		System.out.print("Enter lower bound : ");
//		int low = sc.nextInt();
//		System.out.print("Enter higher bound : ");
//		int high = sc.nextInt();
//		sc.close();
//		
//		while(low <= high) {
//			if(harshadNumber(low)) {
//				System.out.print(low + " ");
//			}
//			low++;
//		}
		
	}
	
	static boolean harshadNumber(int n) {
		
		int temp = n;
		int lastDigit = 0, sum = 0;
		while(temp != 0) {
			lastDigit = temp % 10;
			sum = sum + lastDigit;
			temp = temp / 10;
		}
		
		return n % sum == 0;
	}

}
