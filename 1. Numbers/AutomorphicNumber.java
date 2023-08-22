/**Checks if a given number is an Automorphic number or not.
 * 
 * An Automorphic number (also known as a circular number) is a number whose square ends with the same digits as the original number.
 * For example, 25 is an Automorphic number because its square is 625, and the last digits of the square match the original number.
 * example: 0 1 5 6 25 76 376 625 9376 
 */ 

package Numbers;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number to check if it's a Automorphic no. or not : ");
		int number =sc.nextInt();
		sc.close();
		
		if(automorphicNumber(number)) {
			System.out.println(number + " is a Automorphic number");
		}
		else {
			System.out.println(number + " is not a Automorphic number");
		}
		
//		Scanner sc = new Scanner(System.in);				// This code is when u want within range.
//		System.out.print("Enter lower bound : ");
//		int low = sc.nextInt();
//		System.out.print("Enter higher bound : ");
//		int high = sc.nextInt();
//		sc.close();
//		
//		while(low <= high) {
//			if(automorphicNumber(low)) {
//				System.out.print(low + " ");
//			}
//			low++;
//		}

	}
	
	static boolean automorphicNumber(int n) {
		
		int temp = n;
		int temp2 = n*n;
		while(temp!=0) {
			if((temp2)%10 == (temp)%10) {
				temp2 = temp2 / 10;
				temp = temp / 10;
			}
			else {
				return false;
			}
		}
		return true;
		
	}

}
