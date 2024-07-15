package Arrays_programs;

import java.util.Scanner;

public class C_2D_Array_pr2_Linear_Search
{
    static boolean isPresent(int arr[][], int key, int raw, int col)
    {
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<4; j++)
            {
                if (arr[i][j] == key)
                {
                    return true;
                }
            }
        }
        return false;
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

        System.out.println("Enter the element you want to search");
        int key = sc.nextInt();

        if (isPresent(a,key,3,4))
        {
            System.out.println("Element found!");
        }else {
            System.out.println("Element not found!");
        }
    }
}
