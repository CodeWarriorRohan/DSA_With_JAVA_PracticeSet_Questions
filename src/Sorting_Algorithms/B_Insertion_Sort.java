package Sorting_Algorithms;

public class B_Insertion_Sort
{
    static void insertionSort(int arr[])
    {
        for (int i=0; i< arr.length; i++)
        {
            int temp = arr[i];
            int j;
            for (j=i-1; j>=0; j--)
            {
                if (arr[j] >temp)
                {
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        int a[] = new int[]{10, 1, 7, 4, 8, 2, 11};
        System.out.println("Given array elements:");
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Insertion Sorted elements:");
        insertionSort(a);
        for (int i=0; i< a.length; i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
