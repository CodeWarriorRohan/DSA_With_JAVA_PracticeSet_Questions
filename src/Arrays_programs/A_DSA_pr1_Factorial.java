package Arrays_programs;

import java.util.Scanner;

public class A_DSA_pr1_Factorial
{
    static int Factorial(int n)
    {
        int result = 1;
        for (int i=1; i<=n; i++)
        {
            result = result*i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number whose factorial you want");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Factorial of "+n+" is "+Factorial(n));
    }
}
