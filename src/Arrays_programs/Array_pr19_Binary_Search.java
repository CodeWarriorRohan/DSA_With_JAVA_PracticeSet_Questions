package Arrays_programs;

// First and last most occurrence of an element in sorted array
public class Array_pr19_Binary_Search
{
    static int firstOcc(int arr[], int key)
    {
        int start = 0, end = arr.length-1;
        int mid = (start+end)/2;
        int ans = -1;

        while (start <= end)
        {
            if (arr[mid] == key)
            {
                ans = mid;
                end = mid-1;
            }
            else if (key > arr[mid])
            {
                start = mid+1;
            }else
            {
                end = mid-1;
            }
            mid = (start+end)/2;
        }
        return ans;
    }

    static int lastOcc(int arr[], int key)
    {
        int start = 0, end = arr.length-1;
        int mid = (start+end)/2;
        int ans = -1;

        while (start <= end)
        {
            if (arr[mid] == key)
            {
                ans = mid;
                start = mid+1;
            }
            else if (key > arr[mid])
            {
                start = mid+1;
            }else
            {
                end = mid-1;
            }
            mid = (start+end)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 3, 3, 3, 5};
        System.out.println("Given array elements are: ");
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int index1 = firstOcc(a, 3);
        int index2 = lastOcc(a, 3);
        System.out.println("First occurrence of 3 is at index "+firstOcc(a, 3));
        System.out.println("Last occurrence of 3 is at index "+lastOcc(a, 3));

        System.out.println("Total no. of occurrence of 3 is "+((index2-index1)+1));
    }
}
