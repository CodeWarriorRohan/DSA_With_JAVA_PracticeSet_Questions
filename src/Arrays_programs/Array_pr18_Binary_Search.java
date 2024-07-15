package Arrays_programs;

public class Array_pr18_Binary_Search
{
//      If the length of array is very large
//      then acc. to this formula [mid = (start+end)/2]
//      there will generate an error
//      So, we should write formula [mid = start + (end-start)/2]
//      in that case !
    static int binarySearch(int arr[], int key)
    {
        int start = 0, end = arr.length-1;
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
    public static void main(String[] args) {

        int a[] = new int[]{2, 4, 6, 0, 12, 18};
        System.out.println("Given array elements ");
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int index = binarySearch(a,18);
        System.out.println("Index of 18 is "+index);
    }
}