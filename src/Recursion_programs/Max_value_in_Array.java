package Recursion_programs;

public class Max_value_in_Array {
	
	static int maxElement(int arr[], int idx) {
		
		// base case
		if(idx == arr.length-1) return arr[idx];
		
		// small problem -> idx+1, end of array -> max -> recursively
		
		int smallAns = maxElement(arr, idx+1);
		
		// self work and final ans
		
		return Math.max(arr[idx], smallAns);
	}
	
	public static void main(String[] args) {
		
		int a[] = {5, 8, 6, 7, 9};
		
		System.out.println(maxElement(a, 0));
	}

}
