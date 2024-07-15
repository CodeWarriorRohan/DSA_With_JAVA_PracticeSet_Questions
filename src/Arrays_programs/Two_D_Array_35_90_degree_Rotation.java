package Arrays_programs;
import java.util.Scanner;

public class Two_D_Array_35_90_degree_Rotation {


	static void printMatrix(int matrix[][])
	{
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j< matrix[i].length; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void transposeInPlace(int matrix[][], int r, int c)
	{
		for(int i=0; i<c; i++)
		{
			for(int j=i; j<r; j++)
			{
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}
	
	static void reverseArray(int arr[])
	{
		int i=0,  j=arr.length-1;
		
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	
	static void matrixRotation(int[][] arr, int n)
	{
		transposeInPlace(arr, n, n);
		
		for(int i=0; i<n; i++)
		{
			reverseArray(arr[i]);
		}
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of rows, columns of 1st matrix");
		int r = sc.nextInt();
		int c = sc.nextInt();

		int a[][] = new int[r][c];

		System.out.println("Enter "+r*c+" Elments for matrix");
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j] = sc.nextInt();
			}
		}

				
		System.out.println("Input Matrix");
		printMatrix(a);
		
		matrixRotation(a, r);
		
		System.out.println("Rotation of Matrix");
		printMatrix(a);
	
	}

}



