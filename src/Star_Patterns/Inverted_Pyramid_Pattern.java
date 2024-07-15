package Star_Patterns;

public class Inverted_Pyramid_Pattern {

	public static void main(String[] args) {
		System.out.println("Inverted Pyramid Pattern");
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5 - i; j++) {
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
