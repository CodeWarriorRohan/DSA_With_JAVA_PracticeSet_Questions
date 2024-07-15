package Arrays_programs;

import java.util.Scanner;

public class Array_pr3_Insertion {
    public static void main(String[] args) {
        System.out.println("Enter the no. of elements you want in array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter values");
        for (int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Elements of the array are: ");
        for (int i=0; i<n; i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Enter the index no. of elements you want to insert in array");
        int index = sc.nextInt();
        System.out.println("Enter the element that you want to be insert");
        int m = sc.nextInt();
        int b[] = new int[m];

        for (int i=0; i < n+1; i++)
        {
            if (i < index)
            {
                b[i] = a[i];
            } else if (i == index) {
                b[i] = m;
            }
            else
            {
                b[i] = a[i-1];
            }
        }
        System.out.println("Array after insertion");
        for (int i = 0; i < n+1; i++)
        {
            System.out.println(b[i]);
        }
    }
}