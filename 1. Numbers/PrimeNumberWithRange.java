// Program to print prime numbers within a given range.

package Numbers;

import java.util.Scanner;

public class PrimeNumberWithRange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lower bound of the range : ");
		int start = sc.nextInt();
		System.out.println("Higher bound of the range : ");
		int end = sc.nextInt();
		sc.close();
		
		if(start>end) {
			System.out.println("Enter correct range.");
		}
		
		for(int i = start; i <= end; i++) {
			if(PrimeNumber.isPrime(i)) {		//Utilized PrimeNumber class that we previously wrote.
				System.out.print(i + " ");
			}
		}
		
	}

}
