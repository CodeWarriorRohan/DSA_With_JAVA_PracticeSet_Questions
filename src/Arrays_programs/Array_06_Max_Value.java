package Arrays_programs;

import java.util.Arrays;

public class Array_06_Max_Value {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 4, 10, 2 };

		System.out.println("Array elements are :" + Arrays.toString(arr));

		System.out.println("Max value is :" + maxValue(arr, 0, 4));
	}

	static int maxValue(int arr[], int start, int end) {

//		if (end > start) {
//			return -1;
//		}
//		if (arr == null) {
//			return -1;
//		}

		int maxVal = arr[start];

		for (int i = start; i <= end; i++) {
			if (arr[i] > maxVal) { 
				maxVal = arr[i];
			}
		}

		return maxVal;
	}

//	static int max(int arr[]) {
//
//		if (arr.length == 0) {
//			return -1;
//		}
//		
//		int maxVal = arr[0];
//
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] > maxVal) {
//				maxVal = arr[i];
//			}
//		}
//
//		return maxVal;
//	}

}
