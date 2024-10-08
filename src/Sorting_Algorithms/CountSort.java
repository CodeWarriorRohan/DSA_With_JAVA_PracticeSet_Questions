package Sorting_Algorithms;

public class CountSort {
	
	static void printArray(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	static int findMax(int arr[]) {
		int mx = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > mx) {
				mx = arr[i];
			}
		}
		
		return mx;
	}
	
	static void basicCountSort(int arr[]) {
		int max = findMax(arr);
		
		int count[] = new int[max+1];
		
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		
		int k = 0;
		
		for(int i=0; i<count.length; i++) {
			for(int j=0; j<count[i]; j++) {
				arr[k++] = i;
			}
		}
	}

	
	static void CountSort(int arr[]) {
		
		int n = arr.length;
		int[] output = new int[n];
		
		int max = findMax(arr);
		
		int count[] = new int[max+1];
		
		for(int i=0; i<arr.length; i++) { // Make frequency array
			count[arr[i]]++;
		}
		
		// Make prefix sum of count array
		for(int i=1; i<count.length; i++) {
			count[i] += count[i-1];
		}
		
		// Find the index of each element in the original array and put it into the output array
		
		for(int i=n-1; i>= 0; i--) {
			int idx = count[arr[i]]-1;
			output[idx] = arr[i];
			count[arr[i]]--;
		}
		
		// copy all elements of output to arr
		
		for(int i=0; i<n; i++) {
			arr[i] = output[i];
		}
		
	}
	public static void main(String[] args) {
		 int arr[] = {1, 3, 1, 5, 4, 5, 3, 2};
		 //basicCountSort(arr);
		 CountSort(arr);
		 printArray(arr);
	}

}
