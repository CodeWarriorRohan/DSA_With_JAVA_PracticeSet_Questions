package Arrays_programs;

import java.util.Scanner;

public class Array_11_CountOccurrrences {
	
	static int countOccurrence(int a[], int x) {
		int count = 0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i] == x) {
				count++;
			}
		}
		return count;
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
		
		System.out.println("Enter x -> element whose occurrence want to be count");
		int x = sc.nextInt();
		
		System.out.println("Count occurrence of x is: "+countOccurrence(arr, x));
	}

}
