package Arrays_programs;

import java.util.Scanner;

public class Array_20_Reverse_Array {
	
	static int[] reverseArray(int arr[]) {
		int n = arr.length;
		int ans[] = new int[n];
		int j = 0;
		
		for(int i=n-1; i>=0; i--) {
			ans[j++] = arr[i];
		}
		
		return ans;
	}
	
	static void printReverseArray(int arr[]) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("Enter no. of elements in array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a[] = new int[n];
		System.out.println("Enter elements");

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Array elements are");

		for (int i = 0; i < n; i++) {
        System.out.print(a[i]+" ");
		}
		System.out.println();
		
		int ans[] = reverseArray(a);
		System.out.println("Reverse Array elements are");
		printReverseArray(ans);
	}

}
