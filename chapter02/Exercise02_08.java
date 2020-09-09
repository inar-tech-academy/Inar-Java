package chapter02;

import java.util.Scanner;

public class Exercise02_08 {
	/*
	 * ShowCurrentTime.java, gives a program that displays the current time in
	 * GMT. Revise the program so that it prompts the user to enter the time
	 * zone offset to GMT and displays the time in the specified time zone. Here
	 * is a sample run:
	 *
	 * Enter the time zone offset to GMT: −5 The current time is 4:50:34
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a digit");
		int timeZone = input.nextInt();
		long totalMiliSeconds = System.currentTimeMillis();
		System.out.println(totalMiliSeconds);

		long totalSeconds = totalMiliSeconds / 1000;
		
		long remainingSeconds = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		
		long remainingMinutes = totalMinutes % 60;
		long totalHours = totalMinutes / 60 ;
		
		long remainingHours = totalHours % 24;
		long displayTime = remainingHours + timeZone;
		
		System.out.println( (displayTime  > 24 ? displayTime -24 : displayTime) + ":" + remainingMinutes + ": " + remainingSeconds);

	}

}
