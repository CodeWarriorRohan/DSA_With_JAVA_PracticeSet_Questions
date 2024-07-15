package Collection_Framework_programs;

import java.util.ArrayList;

public class Array_Lists {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		// add new elements
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		
		// print all array elements directly
		
		System.out.println(arr);
		
		// get an element at index i
		
		System.out.println(arr.get(2));
		
		// print with for loop
		
		for(int i = 0; i < arr.size(); i++)
		{
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();

		// add an element at a index
		
		arr.add(2,23);
		
		System.out.println(arr);
		
		// update array element at index i
		
		arr.set(2, 25);
		
		System.out.println(arr);
		
		// removing an element at index i
		
		arr.remove(2);
		
		System.out.println(arr);
		
		// removing an element e
		
		arr.remove(Integer.valueOf(30));
		
		System.out.println(arr);
		
		// checking weather the element is exist or not
		
		boolean ans = arr.contains(Integer.valueOf(50));
		
		System.out.println(ans);
		
		// if you don't specify class, you can put anything inside it (array)
		
//		ArrayList a = new ArrayList();
//		
//		a.add("Any character");
//		a.add(234);
//		a.add(true);
//		
//		System.out.println(a);
	}


}

