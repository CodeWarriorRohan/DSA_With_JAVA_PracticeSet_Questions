package Arrays_programs;

import java.util.Scanner;

public class Array_25_Sort_Zeros_and_Ones {
	
	static void printArray(int arr[]) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void sortZeroesAndOnes(int arr[]) {
		int n = arr.length;
		int zeroes = 0;
		
		// count no. of zeroes
		for(int i = 0; i < n; i++) {
			if(arr[i] == 0) {
				zeroes++;
			}
		}
		
		// 0 to zeroes-1 : 0, zeroes to n-1 : 1
		
		for(int i = 0; i < n; i++) {
			if(i < zeroes) {
				arr[i] = 0;
			}
			else {
				arr[i] = 1;
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter size of an array");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter elements");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt(); 
		}
		
		System.out.println("Original array");
		printArray(arr);
		
		sortZeroesAndOnes(arr);
		System.out.println("Sorted Array");
		printArray(arr);
		
	}

}
