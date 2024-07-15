package Arrays_programs;

import java.util.Scanner;

public class Array_09_Max_Element {
	
	public static void main(String[] args) {
		
		int n;
		int ans = 0;
		
		System.out.println("Enter no. of elements");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter values");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Elements are");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		
		for(int i=0; i<n; i++) {
			if(arr[i]>ans) {
				ans = arr[i];
			}
		}
		
		System.out.println("Maximum element is :" + ans);
		
	}

}
