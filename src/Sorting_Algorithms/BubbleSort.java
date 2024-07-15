package Sorting_Algorithms;

public class BubbleSort {
	
	static void bubbleSort(int arr[]) {
		 int n = arr.length;
		 
		 for(int i = 0; i < n-1; i++) {
			 for(int j = 0; j < n-i-1; j++) {
				 
				 if(arr[j] > arr[j+1]) {
					 int temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;
				 }
			 }
		 }
	}
	
	
	static void optimizedBubbleSort(int arr[]) {
		
		int n = arr.length;
		 
		 for(int i = 0; i < n-1; i++) {
			 boolean flag = false;
			 for(int j = 0; j < n-i-1; j++) {
				 
				 if(arr[j] > arr[j+1]) {
					 int temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;
					 flag = true;
				 }
			 }
			 if(!flag) {
				 return;
			 }
		 }
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {6, 5, 4, 7, 2, 1};
		
        bubbleSort(arr);		
		// optimizedBubbleSort(arr);
        
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
