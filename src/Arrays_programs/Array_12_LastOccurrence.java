package Arrays_programs;

import java.util.Scanner;

public class Array_12_LastOccurrence {
	
	static int lastOccurrence(int arr[], int x) {
	
		int lastIndex = -1;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == x) {
				lastIndex = i;
			}
		}
		return lastIndex;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter "+n+" elements");
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter x -> element whose last occurrence want to be count");
		int x = sc.nextInt();
		
		System.out.println("Last occurrence of x is: "+lastOccurrence(arr, x));
		
	}

}
