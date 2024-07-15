package Arrays_programs;

public class Array_pr6_Using_Function
{
    static void printArray(int arr[], int size)
    {
        System.out.println("printing the array ");
        for (int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("printing done..");
    }

    public static void main(String[] args) {
//      There will be an exception will occurs
        try {
            int a[] = {2, 9};
            printArray(a, 10);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            e.getStackTrace();
        }

        int b[] = {19, 23, 42, 11, 22};
        printArray(b, 5);
        System.out.println("At index 2 is: "+b[2]);

    }
}
