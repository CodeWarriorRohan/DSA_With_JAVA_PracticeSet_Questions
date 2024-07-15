package Collection_Framework_programs;

import java.util.Collections;
import java.util.ArrayList;

public class Ascending_Descending_Order_ArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> str = new ArrayList<>();
		
		str.add("Welcome");
		str.add("to");
		str.add("Collections");
		str.add("in Java Language");
		
		System.out.println("Original list "+str);
		Collections.sort(str);
		System.out.println("Alphabetically sort list "+str);
		
		System.out.println();
		
		
		ArrayList<Integer> list = new ArrayList<>();

		list.add(22);
		list.add(31);
		list.add(17);
		list.add(20);
		list.add(11);
		list.add(89);
		list.add(67);
		list.add(45);
		list.add(10);

		System.out.println("Original list " + list);
		
		// in build method
		
		Collections.sort(list);
		
		System.out.println("Ascending order list " + list);
		
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println("Descending order list "+ list);
		
	}

}
