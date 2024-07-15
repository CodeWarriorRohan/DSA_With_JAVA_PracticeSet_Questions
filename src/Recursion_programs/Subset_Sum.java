package Recursion_programs;

public class Subset_Sum {
	
	static void subsetSum(int arr[], int n, int idx, int currSubsetSum) {
		
		if(idx >= n) {
			System.out.println(currSubsetSum);
			return;
		}
		
		subsetSum(arr, n, idx+1, currSubsetSum+arr[idx]); // include
		
		subsetSum(arr, n, idx+1, currSubsetSum); //exclude
		
	}
	
	public static void main(String[] args) {
		
		int a[] = {2, 4, 5};
		subsetSum(a, a.length, 0, 0);
	}

}
