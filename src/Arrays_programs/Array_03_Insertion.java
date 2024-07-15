package Arrays_programs;

import java.util.Scanner;

public class Array_03_Insertion {

	public static void main(String[] args) {

		int n, m, p;

		System.out.println("Enter no. of elements in array");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int a[] = new int[n];
		int b[] = new int[n + 1];

		System.out.println("Enter elements");

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter index of new element to be inserted");
		m = sc.nextInt();

		System.out.println("Enter new element to be inserted");
		p = sc.nextInt();

		for (int i = 0; i < n+1; i++) {
			if(i<m) {
				b[i]=a[i];
			}
			else if(i==m) {
				b[i]=p;
			}
			else {
				b[i]=a[i-1];
			}
			
		}

		System.out.println("Elements are");

		for (int i = 0; i < n+1; i++) {
			System.out.println(b[i]);
		}

	}

}
