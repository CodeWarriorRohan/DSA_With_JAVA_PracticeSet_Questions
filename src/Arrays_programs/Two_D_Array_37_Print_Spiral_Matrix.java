package Arrays_programs;

import java.util.Scanner;

public class Two_D_Array_37_Print_Spiral_Matrix {

	static void printMatrix(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void printSpiral(int[][] matrix, int r, int c) {
		
		int leftCol = 0, rightCol = c-1, topRow = 0 , bottomRow = r-1 , totalElement = 0;
		
		while(totalElement < r*c)
		{
			// topRow -> leftCol to rightCol
			for(int j = leftCol; j<= rightCol && totalElement < r*c ; j++)
			{
				System.out.print(matrix[topRow][j]+" ");
				totalElement++;
			}
			topRow++;
			
			// rightCol -> topRow to bottomRow
			for(int i = topRow; i <= bottomRow && totalElement < r*c; i++)
			{
				System.out.print(matrix[i][rightCol]+" ");
				totalElement++;

			}
			rightCol--;
			
			// bottomRow -> rightCol to leftCol
			for(int j = rightCol; j>= leftCol && totalElement < r*c; j--)
			{
				System.out.print(matrix[bottomRow][j]+" ");
				totalElement++;

			}
			bottomRow--;
			
			// leftCol -> bottomRow to topRow
			for(int i = bottomRow; i >= topRow && totalElement < r*c; i--)
			{
				System.out.print(matrix[i][leftCol]+" ");
				totalElement++;

			}
			leftCol++;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of rows, columns of  matrix");
		int r = sc.nextInt();
		int c = sc.nextInt();

		int a[][] = new int[r][c];

		System.out.println("Enter " + r * c + " Elments for matrix");

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Input Matrix");
		printMatrix(a);


		System.out.println("Spiral of Matrix");
		printSpiral(a, r, c);

	}

}
