package Arrays_programs;

public class Array_pr10_Reverse
{
    static void reverse(int arr[])
    {
        int start = 0;
        int end = arr.length-1;
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int a[] = {2, 9, 4, 7, 21, 11};
        for (int i=0; i< a.length; i++)
        {
            System.out.print(" "+a[i]);
        }

        reverse(a);
        System.out.println();
        for (int i=0; i< a.length; i++)
        {
            System.out.print(" "+a[i]);
        }
    }
}