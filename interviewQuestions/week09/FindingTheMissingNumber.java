package interviewQuestions.week09;

public class FindingTheMissingNumber {
	/*
	 * You are given 9 numbers between 1 and 10, 
	 * write a function to find the missing number to have all the numbers by 100. 
	 * (My interview question for 110k$ job)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int findTheMissingNum(int [] arr){//300-400
		//arr = [9] bir tane sayi eksik -> arrayin icindeki sayilar rastgele dagilmis yani 5,2,3,7,4,8,1,9,10 gibi output: 6

		// 1 + 2 + 3 = (3) x (3 +1) /2 = 6
		// 1 + 2 + ... + 100 = 100 x (101)/2  = 5050
		
		//Time Complexity -> O(n)
		//Space Complexity -> O(1)
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		
		int missing = (100) * (101) / 2 - total;
		return missing;
		
//		//1.Metod
		//Time Complexity -> O(2n) == O(n)
		//Space Complexity -> O(n) (istenmeyen durum)
//		int [] yeniArr = new int [10];//[0,1,0,0,1,0,1,0,0,0]
//		
//		for (int i = 0; i < arr.length; i++) {
//			yeniArr[arr[i]-1] = 1;
//		}
// 
//		for (int j = 0; j < yeniArr.length; j++) {
//			if(yeniArr[j] == 0){
//				return (j + 1);
//			} 
//		}
//		return -1;
	}

}
