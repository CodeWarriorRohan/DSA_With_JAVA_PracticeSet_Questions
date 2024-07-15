package Arrays_programs;

import java.util.Arrays;

public class Array_05_Swap_Indexs {

	public static void main(String[] args) {
		int arr[] = {3, 6, 1, 0, 9};
		System.out.println(Arrays.toString(arr));
		
		swap(arr, 0, 4);
		System.out.println(Arrays.toString(arr));

	}
	
	static void swap(int arr[], int index1, int index4) {
		
		int temp = arr[index1];
		arr[index1] = arr[index4];
		arr[index4] = temp;
	}
}
