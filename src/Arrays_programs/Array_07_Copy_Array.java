package Arrays_programs;

import java.util.Scanner;

public class Array_07_Copy_Array {
	
	static void printArray(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		int n;
		
		System.out.println("Enter no. of elements in array");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter elements");
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Elements are");
		
		printArray(a);
		
		int[] a2 = a;
		
        System.out.println();
        
		System.out.println("Copied array");
		printArray(a2);
	}

}
