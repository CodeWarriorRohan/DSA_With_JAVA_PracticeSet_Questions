package Arrays_programs;

public class Array_pr22_BS_in_Rotated_array
{
    static int pivotElement(int arr[])
    {
        int start = 0, end = arr.length-1;
        int mid = (start+end)/2;

        while(start < end)
        {
            if (arr[mid] >= arr[0])
            {
                start = mid+1;
            }else
            {
                end = mid;
            }
            mid = (start+end)/2;
        }
        return start;
    }

    static int binarySearch(int arr[], int s, int e, int key)
    {
        int start = s, end = e;
        int mid = (start+end)/2;

        while (start <= end)
        {
            if (arr[mid] == key)
            {
                return mid;
            }

            if (key > arr[mid])
            {
                start = mid+1;
            }else
            {
                end = mid-1;
            }
            mid = (start+end)/2;
        }
        return -1;
    }

    static int Rotated_Array(int arr[], int n, int k)
    {
        int pivot = pivotElement(arr);
        if (k >= arr[pivot] && k <= arr[n-1])
        {
            return binarySearch(arr, pivot, n-1, k);
        }
        else
        {
            return binarySearch(arr, 0, pivot -1, k);
        }
    }
    public static void main(String[] args) {

        int a[] = new int[]{7, 8, 1, 3, 5};
        System.out.println("Given array elements:");
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int index = Rotated_Array(a, 5, 5);
        System.out.println("Index of k is: "+index);
    }
}
