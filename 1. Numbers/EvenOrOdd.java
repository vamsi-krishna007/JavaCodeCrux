// A simple program to print whether the given number is an even number or an odd number. 

package Numbers;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it's an even or odd number : ");
		int number = sc.nextInt();
		sc.close();
		
		if(number % 2 == 0) {
			System.out.println(number + " is an even number");
		}
		else {
			System.out.println(number + " is an odd number");
		}
		
	}

}
