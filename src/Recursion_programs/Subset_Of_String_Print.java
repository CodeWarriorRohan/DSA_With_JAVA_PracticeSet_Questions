package Recursion_programs;

public class Subset_Of_String_Print {
	
	static void printSSQ(String s, String cuurAns) {
		
		if(s.length() == 0) {
			System.out.println(cuurAns);
			return;
		}
		
		char curr = s.charAt(0);
		
		String remString = s.substring(1);
		
		printSSQ(remString, cuurAns + curr);
		
		printSSQ(remString, cuurAns);
	}
	public static void main(String[] args) {
		
		printSSQ("abc", "");
	}

}
