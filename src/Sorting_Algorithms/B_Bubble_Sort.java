package Sorting_Algorithms;

public class B_Bubble_Sort
{
    static void bubbleSort(int arr[])
    {
        for (int i=1; i<arr.length; i++)
//        for round 1 to n-1
        {
            for (int j=0; j<arr.length-i; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

    }
    public static void main(String[] args) {
        int a[] = new int[]{10, 6, 7, 1, 14, 9};
        System.out.println("Given array elements:");
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Bubble Sorted elements:");
        bubbleSort(a);
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
