package Recursion_programs;

import java.util.Scanner;

public class Fibonacci_Series {
	
	static int fibonacci(int n)
	{
		if(n == 1 || n == 0) return n;
	
//		int prev = fibonacci(n-1);
//		int prevPrev = fibonacci(n-2);
		
//		return prev + prevPrev;
	
	// or
		
		return fibonacci(n-1)+fibonacci(n-2);
			
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the value of n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Fibonacci series :");
		for(int i = 0; i <= n; i++) {
			System.out.print(fibonacci(i)+" ");
		}
	}
}

