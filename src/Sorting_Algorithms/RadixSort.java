package Sorting_Algorithms;

public class RadixSort {
	
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

	static void CountSort(int arr[], int place) {		
		int n = arr.length;
		int[] output = new int[n];
		int count[] = new int[10];
		
		for(int i=0; i<arr.length; i++) { // Make frequency array
			count[(arr[i]/place)%10]++;
		}
		
		// Make prefix sum of count array
		for(int i=1; i<count.length; i++) {
			count[i] += count[i-1];
		}
		
		// Find the index of each element in the original array and put it into the output array
		
		for(int i=n-1; i>= 0; i--) {
			int idx = count[(arr[i]/place)%10]-1;
			output[idx] = arr[i];
			count[(arr[i]/place)%10]--;
		}
		
		// copy all elements of output to arr
		
		for(int i=0; i<n; i++) {
			arr[i] = output[i];
		}
		
	}
	
	static void radixSort(int arr[]) {
		int max = findMax(arr);
		
		// apply counting sort to sort elements based on place value
		for(int place = 1; max/place > 0; place *= 10) {
			CountSort(arr, place);
		}
	}
	
	public static void main(String[] args) {
		 int arr[] = {43, 504, 61, 58, 14, 5, 30, 221};
		 radixSort(arr);
		 printArray(arr);
	}

}
