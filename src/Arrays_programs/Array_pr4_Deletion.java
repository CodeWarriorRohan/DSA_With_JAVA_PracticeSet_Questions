package Arrays_programs;

import java.util.Scanner;

public class Array_pr4_Deletion
{
    public static void main(String[] args) {
        System.out.println("Enter no. elements of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter values");
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Elements are:");
        for (int i = 0; i < n; i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("Enter index no. of element to be deleted");
        int index = sc.nextInt();
        int b[] = new int[n-1];

        for (int i = 0; i < a.length; i++)
        {
            if (i < index)
            {
                b[i] = a[i];
            } else if (i == index) {
                continue;
            }else {
                b[i-1] = a[i];
            }
        }
        System.out.println("Array after deletion");
        for (int i = 0; i < n-1; i++)
        {
            System.out.println(b[i]);
        }
    }
}