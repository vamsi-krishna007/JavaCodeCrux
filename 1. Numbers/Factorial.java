// Program to print factorial of a number.

package Numbers;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.print("Factorial : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		System.out.println(fact(number));

	}
	
	static int fact(int number) {		// Iterative Function.
		
		int factorial = 1;
		for(int i = 1; i <= number; i++) {
			factorial *= i;
		}
		return factorial;
	}
	
//	static int fact(int number) {		// Recursive Function.
//	
//		if(number == 0 || number == 1) {
//			return 1;
//		}
//		return number * fact(number-1);
//  }

}
