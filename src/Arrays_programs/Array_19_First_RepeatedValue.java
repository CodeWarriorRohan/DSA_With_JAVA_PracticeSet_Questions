package Arrays_programs;

import java.util.Scanner;

public class Array_19_First_RepeatedValue {
	
	static int firstRepeatedElement(int arr[]) {
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
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
		
		System.out.println("First repeated element is "+firstRepeatedElement(arr));
		
	}

}
