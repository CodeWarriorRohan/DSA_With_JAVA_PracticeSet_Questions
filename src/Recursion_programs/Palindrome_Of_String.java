package Recursion_programs;

import java.util.Scanner;

public class Palindrome_Of_String {
	
	static boolean isPalindromeString(String s, int l, int r) {
		
		if(l >= r) return true;
		
		return (s.charAt(l) == s.charAt(r) && isPalindromeString(s, l+1, r-1));
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println(isPalindromeString(s, 0, s.length()-1));
	}

}
