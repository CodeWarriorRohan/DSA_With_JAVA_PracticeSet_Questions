package Arrays_programs;

import java.util.Scanner;

public class Array_pr1_Creation_1D {
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

    }
}