package Sorting_Algorithms;

public class MoveAllZerosInTheEnd {

	static void moveZero(int arr[]) {

		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] == 0 && arr[j+ 1] != 0) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = { 8, 0, 3, 0, 4, 2 };

		moveZero(arr);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
