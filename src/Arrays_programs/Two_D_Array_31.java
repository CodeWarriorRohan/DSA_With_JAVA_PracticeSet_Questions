package Arrays_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Two_D_Array_31 {
	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		System.out.println(arr.length);
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
//		for(int i = 0; i < arr.length; i++) {
//			
////			for(int j = 0; j < arr[i].length; j++) {
////				System.out.print(arr[i][j] + " ");
////			}
////			System.out.println();
//			
////			or we can write
//			
//			System.out.println(Arrays.toString(arr[i]));
//		}

//		or we can write
		
		for(int a[] : arr) {
			System.out.println(Arrays.toString(a));
		}
	}

}
