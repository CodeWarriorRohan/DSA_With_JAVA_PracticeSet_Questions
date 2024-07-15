package Arrays_programs;

public class Array_pr17_Sort_0_1
{
    static void Sort(int arr[])
    {
        int left = 0, right = arr.length-1;
        while (left < right)
        {
            while (arr[left] == 0 && left < right)
            {
                left++;
            }
             while (arr[right] == 1 && left < right)
             {
                 right--;
             }
             if (left < right)
             {
                 int temp = arr[left];
                 arr[left] = arr[right];
                 arr[right] = temp;

                 left++;
                 right--;
             }
        }
    }
    public static void main(String[] args) {
         int[] a = new int[]{1, 1, 0, 1, 0, 0, 1, 0};
         System.out.println("Given array:");
         for (int i=0; i<a.length; i++)
         {
             System.out.print(a[i]+" ");
         }
        System.out.println();
         System.out.println("Sorted array:");
         Sort(a);
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
