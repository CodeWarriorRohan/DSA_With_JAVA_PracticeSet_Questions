package Sorting_Algorithms;

public class Sort012 {

	static void printArray(int arr[]) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	static void swap(int arr[], int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	static void sort012(int arr[]) {

		int low = 0, mid = 0, high = arr.length - 1;

		// explore the unknown region

		while (mid <= high) {
			if (arr[mid] == 0) {
				swap(arr, mid, low);
				mid++;
				low++;
			} else if (arr[mid] == 1) {
				mid++;
			} else {
				swap(arr, mid, high);
				high--;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 2, 0, 1, 1, 2, 0, 2, 0, 1, 0 };
		sort012(arr);

		printArray(arr);
	}

}
