package interviewQuestions.week05;

import java.util.Scanner;

public class Timer {

	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a time period : ");
		int time = input.nextInt();
		int totalSecond = time * 60;
		
		
		for (int i = totalSecond; i > 0; i--) {
//			if(i % 60 == 0){
//				time --;
//			}
			int minute = i / 60;
			int second = i % 60;
			String s = "";
			
			// int 9 -> String 09
			// int 48-> String 48 
			
//			if(second < 10){
//				s = "0" + second;
//			}else{
//				s = s + second;
//			}
			
			//s = condition? true : false ;
			s = (second < 10) ? ("0" + second ): (s + second);
			
			
			System.out.printf( "%2d:%s\n" ,minute, s );
			try {
				int a =5;
			} 
			finally{
				
			}
			
		}
		

	}

}
