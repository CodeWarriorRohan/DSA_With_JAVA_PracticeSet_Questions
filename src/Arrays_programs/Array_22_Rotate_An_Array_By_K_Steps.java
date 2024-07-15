package Arrays_programs;

import java.util.Scanner;

public class Array_22_Rotate_An_Array_By_K_Steps {
	
	static int[] rotateArray(int arr[], int k) {
		int n = arr.length;
		k = k % n;
		
		int ans[] = new int[n];
		int j = 0;
		
		for(int i=n-k; i<n; i++) {
			ans[j++] = arr[i];
		}
		
		for(int i=0; i<n-k; i++) {
			ans[j++] = arr[i];
		}
		return ans;
	}
	
	static void printArray(int arr[]) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
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
		
		System.out.println("Enter k");
		int k = sc.nextInt();
		
		System.out.println("Original array");
		printArray(arr);
		
		int ans[] = rotateArray(arr, k);
		System.out.println("Array after rotation");
		printArray(ans);
	    
	}

}
