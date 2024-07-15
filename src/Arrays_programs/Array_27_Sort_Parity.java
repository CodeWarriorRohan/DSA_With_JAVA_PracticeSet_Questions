// Parity means weather the no. is odd or even 
// Sort an array based on their parity

package Arrays_programs;
import java.util.Scanner;


public class Array_27_Sort_Parity {

	static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void sortArrayByParity(int arr[])
	{
		int n = arr.length;
		
		int left = 0 , right = n-1;
		
		while(left < right) {
			if(arr[left] % 2 == 1 && arr[right] % 2 == 0)
			{
				swap(arr, left, right);
				left++;
				right--;
			}
			
			if(arr[left] % 2 == 0)
			{
				left++;
			}
			
			if(arr[right] % 2 == 1) {
				right--;
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter Size of the array");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter Array Elements");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Original array");
		printArray(a);
		
		sortArrayByParity(a);
		System.out.println("Parity sorted Array");
		printArray(a);
	}

}
