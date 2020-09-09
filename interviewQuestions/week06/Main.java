package interviewQuestions.week06;



public class Main {

	public static void main(String[] args) {
//		System.out.println(doub(4,5));
//		System.out.println(doub(4,5.4));
//		System.out.println(doub(4.5,5.4));
		
		String s = "Hello World!";
		s += "d";
		System.out.println(s);
	}
	
	private static double doub(int a, double b){
		return 1.0;
	}
	
	private static double doub(double a, double b){
		return 2.0;
	}
	
// The method doub(int, double) is ambiguous for the type Main
//	private static double doub(double a, int b){
//		return 3.0;
//	}

}
