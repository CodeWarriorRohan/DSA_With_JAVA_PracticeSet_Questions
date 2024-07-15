package Arrays_programs;

public class Array_pr21_BS_Pivot_element
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
    public static void main(String[] args) {
        int a[] = new int[]{3, 8, 10, 17, 1};
        System.out.println("Elements of given array");
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int PivotElement = pivotElement(a);
        System.out.println("Index of Pivot element is "+PivotElement);
    }
}
