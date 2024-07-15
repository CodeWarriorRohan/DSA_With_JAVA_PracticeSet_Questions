package Star_Patterns;

public class Pyramid_Pattern {

	public static void main(String[] args) {

		System.out.println("Pyramid Pattern");
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= 5 - i; j++) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
