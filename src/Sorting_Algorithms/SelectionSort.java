package Sorting_Algorithms;

public class SelectionSort {
	
	static void selectionSort(int arr[]) {
	
		int n = arr.length;
		
		for(int i = 0; i < n-1; i++) { // i represents the current index
			
			// Find the minimum element in unsorted part of array
			
			int min_index = i;
			for(int j = i+1; j < n; j++) {
				if(arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			
			// swap current element and minimum element -> current index i will have correct element
			// arr[min_index], arr[i]
			
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
		
		
	}
	
	public static void main(String[] args) {
	
int arr[] = {61, 15, 41, 17, 12, 10};
		
        selectionSort(arr);		
		// optimizedBubbleSort(arr);
        
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
