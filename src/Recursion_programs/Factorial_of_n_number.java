package Recursion_programs;

import java.util.Scanner;

public class Factorial_of_n_number {

	static int factorial(int n) {
		if (n == 0)
			return 1;

		int fact = factorial(n - 1);
		int ans = n * fact;

		return ans;
	}

	public static void main(String[] args) {

		System.out.println("Enter the value of n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("Factorial of :" + n + " is");

		System.out.print(factorial(n));

	}

}
