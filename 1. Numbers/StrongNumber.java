/**Checks if a given number is a Strong number or not.
 * 
 * A Strong number (also known as a Strong Harshad number) is a number that is equal to the sum of the factorials of its digits.
 * For example, 145 is a Strong number because 1! + 4! + 5! = 1 + 24 + 120 = 145.
 * example : 0 1 2 145 40585 
*/

package Numbers;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check if it's a Strong no. : ");
		int number = sc.nextInt();
		sc.close();
		
		if(strongNumber(number)){
			System.out.println(number + " is a Strong Number");
		}
		else {
			System.out.println(number + " is not a Strong Number");
		}

//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter lower bound : ");
//		int low = sc.nextInt();
//		System.out.print("Enter higher bound : ");
//		int high = sc.nextInt();
//		sc.close();
//		
//		while(low<=high) {
//			if(strongNumber(low)) {
//				System.out.print(low + " ");
//			}
//			low++;
//		}
		
	}
	
	static boolean strongNumber(int n) {
		
		int temp = n;
		int lastDigit = 0;
		double factSum = 0;
		
		while(temp != 0) {
			lastDigit = temp % 10;
			factSum = factSum + Factorial.fact(lastDigit);	// Utilized Factorial class that we previously wrote.
			temp = temp / 10;
		}
		
		return factSum == n;
		
	}

}
