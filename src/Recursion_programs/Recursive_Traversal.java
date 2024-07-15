package Recursion_programs;

public class Recursive_Traversal {
	
	static void printArray(int arr[], int idx) {
		// base case
		
		if(idx == arr.length) {
			return ;
		}
		
		// self work
		
		System.out.println(arr[idx]);
		
		// recursion work
		
		printArray(arr, idx +1);
	}
	public static void main(String[] args) {
		
		int arr[] = {5, 6, 7, 3, 1};
		printArray(arr, 0);
	}

	
}
