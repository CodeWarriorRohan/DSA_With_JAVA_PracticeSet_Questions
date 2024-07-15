package Recursion_programs;

import java.util.Scanner;

public class Multiples_of_n {
	
	static void printMultiples(int n, int k) {
	  if(k==1) {
		  System.out.println(n);
		  return;
	  }
	  
	  printMultiples(n, k-1);
	  
	  System.out.println(n * k);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter value of n");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println("Enter value of k");
		
		int k = sc.nextInt();
		
		printMultiples(n, k);
		
	}

}
