package Sorting_Algorithms;

public class B_Selection_Sort
{
    static void selectionSort(int arr[])
    {
        for (int i=0; i<arr.length-1; i++)
        {
            int miniIndex = i;
            for (int j=i+1; j< arr.length; j++)
            {
                if (arr[j] < arr[miniIndex])
                {
                    miniIndex = j;
                }
            }
            int temp = arr[miniIndex];
            arr[miniIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int a[] = new int[]{64, 25, 12, 22, 11};
        System.out.println("Given array elements:");
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Selection Sorted elements:");
        selectionSort(a);
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
