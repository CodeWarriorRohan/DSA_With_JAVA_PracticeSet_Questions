package Recursion_programs;

public class Frog_Jump {
	
	static int bestCost(int hight[], int n, int idx) {
		
		if(idx == n-1) return 0;
		
		int op1 = Math.abs(hight[idx] - hight[idx+1]) + bestCost(hight, n, idx+1);
		
		if(idx == n-2) return op1;
		
		int op2 = Math.abs(hight[idx] - hight[idx+2]) + bestCost(hight, n, idx+2);

		return Math.min(op1, op2);
	}
	public static void main(String[] args) {
		
		int hight[] = {10, 30, 40, 20};
		
		System.out.println(bestCost(hight, hight.length, 0));
	}

}
