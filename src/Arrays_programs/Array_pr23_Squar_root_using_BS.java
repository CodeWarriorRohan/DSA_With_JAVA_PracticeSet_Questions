package Arrays_programs;

public class Array_pr23_Squar_root_using_BS
{
//  For integer values
    static int squarRoot(int n)
    {
        int s = 0, e = n;
        int mid = (s+e)/2;
        int ans = -1;
        while (s<=e)
        {
            int square = mid*mid;

            if (square == n)
            {
                return mid;
            }
            if (square < n)
            {
                ans = mid;
                s = mid+1;
            }else {
                e = mid-1;
            }
            mid = (s+e)/2;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int square = squarRoot(64);
        System.out.println("Square root of 64 is "+square);
    }
}
