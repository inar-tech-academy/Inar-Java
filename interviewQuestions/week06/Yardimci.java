package interviewQuestions.week06;

public class Yardimci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Static metotlar, sinif ismiyle ulasilabilir
	public static void yazdir(){
		System.out.println("Yardimci sinif - static - yazdir");
	}
	
	//default metotlara baska siniflardan ulasirken, obje olusturmak gerekir
	public void yaz(){
		System.out.println("Yardimci sinif - default - yazdir");
		deneme();
	}
	
	
	//access modifiers : public,private, default, protected
	private void deneme(){
		System.out.println("private");
		Math.max(4,3);
	}
	
	
	

}
