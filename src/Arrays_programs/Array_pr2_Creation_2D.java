package Arrays_programs;

import java.util.Scanner;

public class Array_pr2_Creation_2D
{
    public static void main(String[] args) {
        System.out.println("Enter no. of rows in array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter no. of cols in array");
        int m = sc.nextInt();

        int a[][] = new int[n][m];
        System.out.println("Enter elements");
        for (int i=0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Entered elements are: ");
        for (int i=0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
    }
}
