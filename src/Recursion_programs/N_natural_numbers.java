package Recursion_programs;

import java.util.Scanner;

public class N_natural_numbers {

	static void printIncreasing(int n) {
		if (n == 1) {
			System.out.println(n);
			return;
		}

		printIncreasing(n - 1);
		System.out.println(n);
	}
	
	static void printDecrasing(int n) {
		// base case
		if(n == 1) {
			System.out.println(1);
			return;
		}
		
	    // self work
		System.out.println(n);
		
		// recursive work

		printDecrasing(n-1);
	}

	public static void main(String[] args) {
		System.out.println("Enter the value of n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//printIncreasing(n);
		
		printDecrasing(n);
	}
}
