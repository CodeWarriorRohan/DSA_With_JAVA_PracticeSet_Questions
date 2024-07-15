package Arrays_programs;

import java.util.Scanner;

public class Array_26_Sort_Zeros_Once_2_Pointer_Approach {
	
	static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void sortZeroAndOnes(int arr[])
	{
		int n = arr.length;
		
		int left = 0 , right = n-1;
		
		while(left < right) {
			if(arr[left] == 1 && arr[right] == 0)
			{
				swap(arr, left, right);
				left++;
				right--;
			}
			
			if(arr[left] == 0)
			{
				left++;
			}
			
			if(arr[right] == 1) {
				right--;
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter Size of the array");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter Array Elements");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Original array");
		printArray(a);
		
		sortZeroAndOnes(a);
		System.out.println("Sorted Array");
		printArray(a);
	}

}
