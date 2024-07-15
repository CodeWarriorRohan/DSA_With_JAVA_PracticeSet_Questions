package Arrays_programs;

import java.util.Scanner;

public class Array_04_Deletion {
	public static void main(String[] args) {

		int n, m;
		System.out.println("Enter no. of elements");

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int a[] = new int[n];
		int b[] = new int[n - 1];

		System.out.println("Enter elements");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter index no. of element to be deleted");
		m = sc.nextInt();

		for (int i = 0; i < a.length; i++) {
			if (i < m)
			{
				b[i] = a[i];
			} 
			else if (i == m) {
				continue;
			}
			else {
				b[i-1] = a[i];
			}
		}

		System.out.println("Elements are");
		for (int i = 0; i < n+1; i++) {
			System.out.println(b[i]);
		}
	}

}
