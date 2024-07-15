package Arrays_programs;

import java.util.Scanner;

public class Array_21_Reverse_Array_Inplace {
	
	static void swapArray(int arr[], int i, int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void inplaceReverseArray(int arr[]) {
		
		int i=0, j=arr.length-1;
		
		while(i < j) {
			swapArray(arr, i, j);
			i++;
			j--;
		}
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
		
		inplaceReverseArray(a);
		System.out.println("Reverse Array elements are");
		
		for(int i = 0; i < n; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
