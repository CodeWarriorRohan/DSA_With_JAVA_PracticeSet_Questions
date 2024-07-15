package Recursion_programs;

import java.util.Scanner;

public class Sum_of_n_numbers_with_alternate_signs {
	
	//Example : if n = 5 -> 1-2+3-4+5 = 3
	
	static int alternateSignSum(int n) {
		
		if(n == 0) return 0;
		
		if(n % 2 == 0) { // even 
			return alternateSignSum(n-1) -n;
		}else { // odd
			return alternateSignSum(n-1) +n;
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Enter value of n");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(alternateSignSum(n));
	}

}
