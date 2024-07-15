package Arrays_programs;

import java.util.Scanner;

public class Array_pr9_Linear_Search
{
    static boolean search(int arr[], int size, int key)
    {
        for (int i = 0; i< size; i++)
        {
            if (arr[i]== key) {
//                System.out.println("true");
                return true;
            }
        }
//        System.out.println("false");
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {5, -2, 14, 21, 0, -9, 12, 8, 3, -1};
        System.out.println("Enter the element to be search");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        boolean found = search(arr, 10, key);

        if(found)
        {
            System.out.println(key+" is present in array");
        }else
        {
            System.out.println(key+" is not present in array");
        }
    }
}
