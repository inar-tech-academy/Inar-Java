package chapter07_Arrays;

public class StackVSHeap {

	// Main -> int tanimla, multiply() metodunu cagir, sout(Finish)
	// multiply(int) -> int num = 2, metodu girilen sayiyi num ile carpsin,
	// printNum() cagirsin
	// print(String) -> char c = '!', girilen Stringi yazdirsin sonuna c charini
	// eklesin

	public static void main(String[] args) {
		int sayi = 10;
		
		multiply(sayi);
	}
	
	static void multiply(int num1){
		int carpim = 2;
		int sayi = num1 * carpim;
		printMethod(sayi);
	}
	
	static void printMethod(int sayi){
		char c = '!';
		System.out.println(sayi + "" + c);
	}

}
