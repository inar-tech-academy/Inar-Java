package interviewQuestions.week09;

public class Armstrong {
	/*
	 * Write a java program to check whether the given number is armstrong number or not.
	 * Armstrong Number in Java: A positive number is called armstrong number if it is equal 
	 * to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.
	 * 
	 * 153 = (1 * 1 * 1 ) + (5 * 5 * 5) + (3 * 3 * 3) => True
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//KISS -> Keep It Stupid Simple
		System.out.println(isArmstrong(153));
		System.out.println(isArmstrong(15));
		
		
	}
	
	public static boolean isArmstrong(int num){
		int temp = num;//153
		int sum = 0;
		while(temp >= 1){
			int digit = temp % 10 ; //3  //5
			sum += (int) Math.pow(digit, 3);
			temp /= 10; //15 //1 
		}
		
		return sum == num;
	}

}
