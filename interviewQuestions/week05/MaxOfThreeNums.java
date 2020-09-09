package interviewQuestions.week05;

import java.util.Scanner;

public class MaxOfThreeNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num1 = input.nextInt();
		System.out.println("Enter another number : ");
		int num2 = input.nextInt();
		
		int cevap = enBuyugu(num1, num2);
		System.out.println("En buyuk sayi :" + cevap);
	}
	
	// enBuyugu(5, 12) -> 12
	public static int enBuyugu(int num1, int num2){
		int cevap = num1;
		if(num1 < num2){
			int temp = num1;
			num1 = num2;
			num2 = temp;
			cevap = num2;
		}
		return cevap;
	}

}
