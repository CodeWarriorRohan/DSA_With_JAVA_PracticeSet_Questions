package Arrays_programs;

// Peak element of the mounted array
// like a[] = {2,3,4,6,5,3,1};

public class Array_pr20_Binary_Search
{
    static int peakElement(int arr[])
    {
        int start = 0, end = arr.length-1;
        int mid = (start+end)/2;

        while (start < end)
        {
            if (arr[mid] < arr[mid+1])
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
    public static void main(String[] args) {
        int a[] = new int[]{0, 1, 5, 9, 5, 1, 0};
        System.out.println("Element of the mounted array");
        for (int i=0; i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int Peak = peakElement(a);
        System.out.println("Index of Peak element is "+Peak);

    }
}
