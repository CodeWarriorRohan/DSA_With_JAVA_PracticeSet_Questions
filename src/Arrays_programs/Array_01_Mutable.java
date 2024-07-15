package Arrays_programs;

import java.util.Arrays;

public class Array_01_Mutable {
	public static void main(String[] args) {
		
		// Arrays are mutable in java means values of are changeable
		
		int arr[] = {3,4,7,11,9};
		System.out.println(Arrays.toString(arr));
		
		change(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void change(int arr[]) {
		arr[1] = 21;
	}
	
}
