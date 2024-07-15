package Arrays_programs;

import java.util.Scanner;

public class Two_D_Array_30 {
	public static void main(String[] args) {
		int n, m;
		
		System.out.println("Enter no. of rows");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		System.out.println("Enter no. of columns");
		m = sc.nextInt();
		
		int a[][] = new int[n][m];
		
		System.out.println("Enter "+n*m+" values");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
