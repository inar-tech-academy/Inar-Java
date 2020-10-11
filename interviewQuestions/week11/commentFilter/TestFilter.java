package interviewQuestions.week11.commentFilter;

import java.util.Scanner;

public class TestFilter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please comment below and do not for get to subscribe ;)");
		String text = input.nextLine();
		Comment com = new Comment(text, 1);
		com.
		//Let the magic happen
		System.out.println("User with " + com.getUserId() + " id's comment is " + (com.isValid() ? "valid" : "invalid"));

	}

}
