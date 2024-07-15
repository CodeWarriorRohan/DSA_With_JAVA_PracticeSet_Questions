package Arrays_programs;
import java.util.Scanner;


public class Array_23_Rotate_An_Array_By_K_Steps_Inplace {
	
static void swap(int arr[], int i, int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void reverse(int arr[], int i, int j) {
		while(i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}
	static void rotateArrayInPlace(int arr[], int k) {
		int n = arr.length;
		k = k % n;
		
		reverse(arr, 0, n-k-1);
		reverse(arr, n-k, n-1);
		reverse(arr, 0, n-1);
	}
	
	static void printArray(int arr[]) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("Enter size of an array");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter elements");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt(); 
		}
		
		System.out.println("Enter k");
		int k = sc.nextInt();
		
		printArray(arr);
		
		rotateArrayInPlace(arr, k);
		System.out.println("Array after rotation");
		printArray(arr);
	    
	}

}

