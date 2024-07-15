package Arrays_programs;

import java.util.Scanner;

public class Array_08_Sum_of_Elements {
	
	public static void main(String[] args) {
		
		int n;
		int sum = 0;
		System.out.println("Enter no of elements in array");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter values");
		
		for(int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Elements are");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println("Sum of array elements is");
		
		for(int i=0;i<n;i++) {
			sum = sum + arr[i]; 
		}
		
		System.out.println(sum);
		
		
	}

}
