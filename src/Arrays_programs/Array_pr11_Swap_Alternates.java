package Arrays_programs;

public class Array_pr11_Swap_Alternates
{
    static void swapping(int arr[])
    {
        for (int i=0; i<arr.length; i+=2)
        {
            if(i+1 < arr.length)
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {2, 1, 8, 0, 6, 3};
        System.out.println("Array elements before alternative elements swapping");
        for (int i = 0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Array elements after alternative elements swapping");
        swapping(a);
        for (int i = 0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}