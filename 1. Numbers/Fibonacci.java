// Program to print Fibonacci numbers.

package Numbers;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to print fibonacci series : ");
		int number = sc.nextInt();
		sc.close();
        for (int i = 0; i <= number; i++) {
            System.out.print(fibonacciIterative(i) + " ");	
        }
        System.out.println();
        fibonacciIterative2(number);	
        
//        System.out.println(fibonacciRecursive(number));
        
    }

    static long fibonacciIterative(int n) {	// This function generates and outputs a designated count of Fibonacci numbers. It can generate up to 46 numbers when using integers and up to 92 numbers when using the long data type for the Fibonacci series.
        
    	if (n <= 1) {
            return n;
        }
        long prev = 0, curr = 1, next;		// change this data type to int to view changes.
        for (int i = 2; i <= n; i++) {
            next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;

	}
    
    static void fibonacciIterative2(int n) {	// This function prints until specified number in fibonacci series.
    	
    	int first = 0;
		int second = 1;
		int third = 0;
		
		if(first <= n) {
			System.out.print(first + " ");
		}
		
		while(second <= n) {
			System.out.print(second + " ");
			third = first + second;
			first = second;
			second = third;
		}
		
    }
    
    static long fibonacciRecursive(int n) {		// This function prints nth fibonacci term. Don't give n value more than 45 in recursive it takes lot of time calculating. This approach is extremely inefficient.
    	
    	 if (n <= 0) {
             return 0;
         } else if (n == 1) {
             return 1;
         } else {
             return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
         }
    }

}
