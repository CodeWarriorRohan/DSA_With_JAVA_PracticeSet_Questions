package Recursion_programs;

public class Linear_Search_Recursively {
	
	// true or false based on existence
	
	static boolean search(int arr[], int n, int target, int idx) {
		// base case
		
		if(idx >= n) return false;
		
		// self work
		
		if(arr[idx] == target) return true;
		
		// recursive work
		
//		if(search(arr, n, target, idx+1)) {
//			return true;
//		}else {
//			return false;
//		}
//		
//		or 
		
		return (search(arr, n, target, idx+1));
		
	}
	
	// return the index of element at which element is found
	
	static int findIndex(int arr[], int n, int target, int idx) {
		// base case
		
		if(idx >= n) return -1;
		
		// self work
		
		if(arr[idx] == target) return idx;
		
		// recursive work
		
//		if(search(arr, n, target, idx+1)) {
//			return true;
//		}else {
//			return false;
//		}
//		
//		or 
		
		return (findIndex(arr, n, target, idx+1));
		
	}
	
	// find all the indexs at which element is present
	
	static void findAllIndices(int arr[], int n, int target, int idx) {
		// base case
		
		if(idx >= n) return;
		
		// self work
		
		if(arr[idx] == target) System.out.println(idx);;
		
		// recursive work
		
		
		findAllIndices(arr, n, target, idx+1);
		
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {2, 4, 6, 4, 5, 4};
		int target = 4;
		
		if(search(arr, arr.length, target, 0)) {
			System.out.println("Yes Found");
		}else {
			System.out.println("Not Found");
		}
		
		//System.out.println("at index "+findIndex(arr, arr.length, target, 0));
		
		findAllIndices(arr, arr.length, target, 0);
	}

}
