package week12;

public class Excercise12_10 {

	public static void main(String[] args) {
		// Recursion metodu, metodun kendi kendine cagirmasidir
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}

		System.out.println("===================================");
		print(5);
	}

	private static void print(int i) {
		if (i == 1) {// Base Case !!!! Yani ne zaman metot kendini cagirmayi birakicak
			System.out.println(1);
			return;
		}

		System.out.println(i);
		print(i - 1);
		
		System.out.println("Please");

	}

}
