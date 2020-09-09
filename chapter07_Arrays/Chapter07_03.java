package chapter07_Arrays;

import java.util.Scanner;

public class Chapter07_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter digits : ");
		int[] arr = new int[5];
		int a = 0;
		int count = 1;

		do {
			a = input.nextInt();
			
			if (a != 0) {
				System.out.println(count++ + ". sayi = " + a);
				if (a < 0 || a > 5) {
					System.out.println("HATALI GIRDI!!");
					break;
				} else {
					arr[a - 1]++;
				}
			}

		} while (a != 0);
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1) + " sayisi " + arr[i] + " kadar girildi");
		}
	}

}
