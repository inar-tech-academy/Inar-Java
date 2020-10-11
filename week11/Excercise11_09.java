package week11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Excercise11_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array size n: ");
		int n = input.nextInt();
		System.out.println("\nThe random array is ");
		int[][] arr = new int[n][n];
		printRandomArray(arr);
		List<Integer> row = new ArrayList<Integer>();
		List<Integer> col = new ArrayList<Integer>();
		getMaxRowNums(arr, row);
		getMaxColNums(arr, col);
		System.out.println("The largest row index: " + row.toString());
		System.out.println("The largest col index: " + col.toString());

	}

	private static void getMaxRowNums(int[][] arr, List<Integer> row) {
		int highestScore = 0;
		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			for (int j = 0; j < arr.length; j++) {
				temp += arr[i][j];
			}
			if (highestScore < temp) {
				highestScore = temp;
				row.clear();
				row.add(i);
			} else if (highestScore == temp) {
				row.add(i);
			}
		}

	}

	private static void getMaxColNums(int[][] arr, List<Integer> col) {
		int highestScore = 0;
		for (int j = 0; j < arr.length; j++) {
			int temp = 0;
			for (int i = 0; i < arr.length; i++) {
				temp += arr[i][j];
			}
			if (highestScore < temp) {
				highestScore = temp;
				col.clear();
				col.add(j);
			}else if (highestScore == temp) {
				col.add(j);
			}
		}
	}

	private static void printRandomArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = (int) (Math.random() * 2);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
