package interviewQuestions.week05;

import java.util.Scanner;

public class Exercise05_09 {
	/*
	 * Write a program that prompts the user to enter the number of students and
	 * each student’s name and score, and finally displays the student with the
	 * highest score and the student with the second-highest score.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		double point = 0;
		double first = Double.MIN_VALUE;
		double second = Double.MIN_VALUE;
		String name = "";
		String firstName = "";
		String secondName = "";
		
		System.out.println("Enter the amount of students, amount point and the name of the student");
		int noOfStudent = input.nextInt();
		while (noOfStudent > 0) {
			System.out.println("Enter point:");
			point = input.nextDouble();
			input.nextLine();
			System.out.println("Enter name:");
			name = input.nextLine();

			if (point > second) {
				if(point > first){
					// enbuyugugun -> ikinciye ata
					second = first;
					secondName = firstName;
					// yeni deger -> en buyugune ata
					first = point;
					firstName = name;
							
				}else{
					// enbuyuk - sbt
					// ikinci en buyuk -> yeni deger
					second = point;
					secondName = name;
				}
			}
			
			noOfStudent--;

		}
		System.out.println(first + " " + firstName);
		System.out.println(second + " " + secondName);
	}
	

}
