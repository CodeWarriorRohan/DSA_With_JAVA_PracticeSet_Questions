package Recursion_programs;

public class Sum_of_Array_Elements {
	
	static int sumOfElements(int arr[], int idx) {
		
		if(idx == arr.length) return 0;
		
		int smallAns = sumOfElements(arr, idx+1);
		
		return smallAns + arr[idx];
	}
	
	public static void main(String[] args) {
		

		int a[] = {5, 1, 6, 3, 6};
		
		System.out.println(sumOfElements(a, 0));
	}

}
