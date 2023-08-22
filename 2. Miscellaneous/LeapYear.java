/**Checks if a given year is a leap year or not.
 * 
 * A leap year is a year that is divisible by 4, except for years that are divisible by 100 but not divisible by 400.
 * For example, 2000 is a leap year because it's divisible by 400. However, 1900 is not a leap year because it's divisible by 100 but not divisible by 400.
 * 
 * @param n The year to be checked for being a leap year.
 * @return Returns true if the given year is a leap year, otherwise false.
 */

package Miscellaneous;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year to identify if it's a Leap year or not : ");
		int number = sc.nextInt();
		sc.close();
		
		if(leapYear(number)) {
			System.out.println(number + " is a Leap Year");
		}
		else {
			System.out.println(number + " is not a Leap Year");
		}

	}
	
	static boolean leapYear(int n) {
		if( (n % 400 == 0 ) || ((n % 100 != 0) && (n % 4 == 0)) ) {
			return true;
		}
		return false;
	}

}
