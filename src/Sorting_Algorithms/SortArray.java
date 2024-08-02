package Sorting_Algorithms;

public class SortArray {

	static void printArray(int arr[]) {
	    for(int val : arr) {
	    	System.out.print(val+" ");
	    }
	    System.out.println();
	}
	
	static void sortArray(int arr[]) {
		
		int n = arr.length;
		int x = -1, y = -1;
		
		// handling corner case otherwise it produce exception for arr[1] of one size
		
		if(n <= 1) {
			return;
		}
		
		// Process all adjicent elements
		
		for(int i = 1; i < n; i++) {
			if(arr[i-1] > arr[i]) {
				if(x == -1) { // first conflict
					x = i-1;
					y = i;
				}else {       // 2nd conflict
					y = i;
				}
			}
		}
		
		// swap x and y in arr
		
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
		
	}
	
	public static void main(String[] args) {
	
		int arr[] = {10, 5, 6, 7, 8, 9, 3};
		sortArray(arr);
		printArray(arr);
		
	}

}
