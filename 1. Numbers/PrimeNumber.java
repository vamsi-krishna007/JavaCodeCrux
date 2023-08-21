// Program to check whether given number is prime number or not.

package Numbers;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it's a Prime number or not: ");
		int number = sc.nextInt();
		sc.close();
			
		if(isPrime(number)) {
			System.out.println(number + " is a Prime number");
		}
		else {
			System.out.println(number + " is not a Prime number");
		}

	}
	
	static boolean isPrime(int number) {
		
		if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
		return true;
	}

}
