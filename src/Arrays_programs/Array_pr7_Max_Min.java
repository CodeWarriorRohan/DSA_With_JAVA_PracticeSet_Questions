package Arrays_programs;

import java.util.Scanner;

public class Array_pr7_Max_Min
{

    static void Max_Mini(int arr[], int n)
    {
        int max = arr[0], mini = arr[0];
        for (int i=1; i<n; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum element in array is: "+max);

        for (int i=1; i<n; i++)
        {
            if (arr[i] < mini)
            {
                mini = arr[i];
            }
        }
        System.out.println("Minimum element in array is: "+mini);
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of your array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Elements of the array are");
        for (int i=0; i<n; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        Max_Mini(a, n);
    }
}
