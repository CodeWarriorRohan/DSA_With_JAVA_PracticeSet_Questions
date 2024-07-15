package Arrays_programs;

import java.util.Scanner;

public class Array_02_Creation {
	public static void main(String[] args) {

		int n;

		System.out.println("Enter no. of elements in array");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int a[] = new int[n];
		System.out.println("Enter elements");

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Elements are");

		for (int i = 0; i < n; i++) {
        System.out.println(a[i]);
		}

	}

}
