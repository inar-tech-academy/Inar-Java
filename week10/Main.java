package week10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hamza = new Student();// new keywordu 'constructor' cagirir
		
		
		Student akif = new Student("Akif", 24, "Hollanda", false);
		Student mehmet = new Student("Akif", 24, "Hollanda", false);
		
		akif = mehmet;

		akif.getIsim();
		akif.setIsim("Tasci");
		
		
		
		Ev benimEvim = new Ev(50_000, "Seattle,WA", false, 2001, 2, 1, false);
		Ev bosEv = new Ev();
		
		System.out.println("Room number" + benimEvim.getRoomNumber());
		System.out.println(bosEv.getPrice());//(int) null
		System.out.println(bosEv.isHouse());// (boolean) false
		System.out.println(bosEv.getAddress());// (String)
		
		Ev ako = new Ev();
		Ev mel = new Ev();
		Ev ibo = new Ev();
		Ev ero = new Ev();
		
		
		benimEvim.
		
		
		System.out.println("Ev sayisi :" + benimEvim.olusturulanEvsayisi);
		
		
		

	}

}
