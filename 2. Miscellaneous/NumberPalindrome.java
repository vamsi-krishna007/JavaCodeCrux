/**Checks if a given number is a palindrome number or not.
 * 
 * A palindrome number is a number that remains the same when its digits are reversed.
 * For example, 121 is a palindrome number because its digits reversed are also 121.
 * 
 * @param n The number to be checked for being a palindrome number.
 * @return Returns true if the given number is a palindrome number, otherwise false.
 */

package Miscellaneous;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check if it's a Palindrome no. or not : ");
		int number = sc.nextInt();
		sc.close();
		
		if(palindromeNumber(number)) {
			System.out.println(number + " is a Palindrome Number");
		}
		else {
			System.out.println(number + " is not a Palindrome Number");
		}

	}
	
	static boolean palindromeNumber(int n) {
		
		int temp = n;
		int lastDigit = 0, reverse = 0;
		while(temp != 0) {
			lastDigit = temp % 10;
			reverse = reverse * 10 + lastDigit;
			temp /= 10;
		}
		
		return n == reverse;
	}

}
