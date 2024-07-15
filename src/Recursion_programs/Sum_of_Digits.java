package Recursion_programs;

public class Sum_of_Digits {

	static int sumOfDigits(int n)
	{
		if(n >= 0 && n <= 9) return n;
		
//		int smallans = sumOfDigits(n/10);
//		
//		int ans = smallans + n%10;
//		return ans;
		
		// or
		
		return sumOfDigits(n/10) + n%10;

	}
	public static void main(String[] args) {
		System.out.println(sumOfDigits(1234));
		
	}

}
