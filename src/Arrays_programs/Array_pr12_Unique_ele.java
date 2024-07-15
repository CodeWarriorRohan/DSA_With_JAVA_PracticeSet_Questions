package Arrays_programs;

import java.util.Scanner;

public class Array_pr12_Unique_ele
{
    static void unique_ele(int arr[])
    {
        int ans = 0;
        for (int i=0; i< arr.length; i++)
        {
            ans = ans^arr[i];
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of your array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Elements of array are: ");
        for(int i=0; i< a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Unique no. in the above array is: ");
        unique_ele(a);
    }
}
