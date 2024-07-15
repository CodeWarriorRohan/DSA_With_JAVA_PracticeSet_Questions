package Recursion_programs;

import java.util.ArrayList;

public class Find_All_Indices_of_a_num {
	
	static ArrayList<Integer> findAllIndices(int arr[], int n, int target, int idx){
		
		// base case
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		if(idx >= n) return ans ;
				
		// self work
		
		if(arr[idx] == target) {
			ans.add(idx);
		}
		
		// recursive work
		
		ArrayList<Integer> smallAns = findAllIndices(arr, n, target, idx+1);
		
		ans.addAll(smallAns);
		
		return ans;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 4, 6, 4, 8, 4};
		int target = 4;
		int n = arr.length;
		
		ArrayList<Integer> ans = findAllIndices(arr, n, target, 0);
		
		for(Integer i : ans) {
			System.out.println(i);
		}
	}
}
