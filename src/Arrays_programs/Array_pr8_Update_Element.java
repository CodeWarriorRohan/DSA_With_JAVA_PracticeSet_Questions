package Arrays_programs;

public class Array_pr8_Update_Element
{
    static void update(int arr[], int n)
    {
        System.out.println("Elements of the array after updation are: ");
        arr[0] = 3;
        for (int i=0; i<5; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int arr[] = {2, 8, 12, 4, 10};
        System.out.println("Elements of the array before updation are: ");
        for (int i=0; i<5; i++)
        {
            System.out.println(arr[i]);
        }
        update(arr, 5);

//        for (int i=0; i<5; i++)
//        {
//            System.out.println(arr[i]);
//        }
    }
}
