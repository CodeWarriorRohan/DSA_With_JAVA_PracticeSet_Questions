package Recursion_programs;

import java.util.Scanner;

public class Calculate_GCD {
	
	
	// Long Division 
	// Iterative Method
	
	static int GCD(int x, int y) {
		
		while(x % y != 0) {
			
			int rem = x % y;
			x = y;
			y = rem;
		}
		
		return y;
	}
	
	// Euclid's Algorithm
	// Recursion
	
	static int GCDR(int x, int y) {
		
		if(y == 0) return x;
		return GCDR(y, x % y);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter value of x");
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		System.out.println("Enter value of y");
		
		int y = sc.nextInt();
		
//		System.out.println(GCD(x, y));
		System.out.println(GCDR(x, y));

	}

}
