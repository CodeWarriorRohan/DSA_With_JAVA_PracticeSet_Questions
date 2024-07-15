package Arrays_programs;
//public class Array_pr24_Book_Allocation_BT
//{
//    static boolean isPossible(int arr[], int n, int m, int mid)
//    {
//        int studentCount = 1;
//        int pageSum = 0;
//
//        for (int i=0; i<n; i++)
//        {
//            if (pageSum + arr[i] <= mid)
//            {
//                pageSum += arr[i];
//            }else
//            {
//                studentCount++;
//                if (studentCount > m || arr[i] > mid)
//                {
//                    return false;
//                }
//                pageSum = arr[i];
//            }
//        }
//        return true;
//    }
//
//    static int allocateBooks(int n, int m, int arr[])
//    {
//        int s = 0, sum = 0;
//        for (int i=0; i<n; i++)
//        {
//            sum = arr[i];
//        }
//        int e = sum;
//        int ans = -1;
//        int mid = (s+e)/2;
//
//        while (s <= e)
//        {
//            if (isPossible(arr,n,m,mid))
//            {
//                ans = mid;
//                e = mid - 1;
//            }else {
//                s = mid + 1;
//            }
//            mid = (s+e)/2;
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        int a[] = new int[]{10, 20, 30, 40};
//        System.out.println("");
//        for (int i=0; i<a.length; i++)
//        {
//            System.out.print(a[i]);
//        }
//        System.out.println();
//        allocateBooks(4,2,a);
//
//    }
//}
