package Collection_Framework_programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Reverse_ArrayList {

	static void reverseList(ArrayList<Integer> list) {
		int i = 0, j = list.size() - 1;

		while (i < j) {
			Integer temp = Integer.valueOf(list.get(i));
			list.set(i, list.get(j));
			list.set(j, temp);

			i++;
			j--;
		}

	}

	public static void main(String[] args) {

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
		
		//reverseList(list);
		
		// in build method
		
		Collections.reverse(list);
		
		System.out.println("Reverse list " + list);

	}

}
