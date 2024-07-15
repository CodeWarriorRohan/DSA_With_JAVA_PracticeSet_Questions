package Arrays_programs;

import java.util.Scanner;

public class C_2D_Array_pr4_Largest_row_sum
{
    static int largerowSum(int arr[][], int row, int col)
    {
        int max = 0;
        int rowIndex = -1;
        for (int i=0; i<3; i++)
        {
            int sum = 0;
            for (int j=0; j<4; j++)
            {
                sum += arr[i][j];
            }
            if (sum > max)
            {
                max = sum;
                rowIndex = row;
            }
        }
        System.out.println("The maximum sum is: "+max);
//        System.out.println("And the index of row is: "+rowIndex);
        return rowIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][4];
        System.out.println("Enter elements of 2D array:");
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<4; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("2D array elements are:");
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<4; j++)
            {
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
        int ans = largerowSum(a,3,4);
        System.out.println("Max row is at index: "+ans);
    }
}
