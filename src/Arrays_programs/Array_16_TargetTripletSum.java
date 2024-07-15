package Arrays_programs;

import java.util.Scanner;

public class Array_16_TargetTripletSum {
	
	static int tripletSum(int arr[], int target) {
		int n = arr.length;
		int ans = 0;
		
		for(int i=0; i<n; i++) {
			for(int j = i+1; j<n; j++) {
				for(int z = j+1; z<n; z++) {
					if(arr[i]+arr[j]+arr[z] == target) {
						ans++;
					}
				}
			}
		}
		return ans;
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
		
		System.out.println("Enter target sum");
		int target = sc.nextInt();
		
		System.out.println("There are "+tripletSum(arr, target)+" combinations of elements whose sum is "+target);
		
		
		
	}

}
