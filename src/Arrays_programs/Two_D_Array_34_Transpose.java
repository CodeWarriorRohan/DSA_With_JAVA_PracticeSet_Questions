package Arrays_programs;
import java.util.Scanner;


public class Two_D_Array_34_Transpose {


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
	
	static int[][] matrixTranspose(int[][] arr, int r, int c)
	{
		int ans[][] = new int[c][r];
		
		for(int i=0; i<c; i++)
		{
			for(int j=0; j<r; j++)
			{
				ans[i][j] = arr[j][i];
			}
		}
		return ans;
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

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of rows, columns of  matrix");
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
		
//		System.out.println("Transpose of Matrix");
//		int [][] ans = matrixTranspose(a, r, c);
//		printMatrix(ans);
		
		System.out.println("Inpalce Transpose of Matrix");
		transposeInPlace(a, r, c);
		printMatrix(a);
	
	}

}


