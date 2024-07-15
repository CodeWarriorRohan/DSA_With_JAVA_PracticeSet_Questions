package Arrays_programs;

import java.util.Scanner;

public class Array_29_Prefix_Sum {
	
	static void printArray(int arr[])
	{
		for(int i =0; i< arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	
	static int[] prifixSumArray(int arr[])
	{
		int n = arr.length;
		
		for(int i = 1; i < n; i++)
		{
			arr[i] = arr[i-1]+arr[i];
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter array elements");
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
			
		}
		
		System.out.println("Original array");
		printArray(a); 
		
		int pref[] = prifixSumArray(a);
		printArray(pref);
	}

}
