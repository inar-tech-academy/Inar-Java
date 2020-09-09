package interviewQuestions.week06;

public class Exercise06_33 {

	public static void main(String[] args) {
		
		//CurrentTime -> 1 Ocak 1970 den beri gecen Toplam ms - or: 10,476,978,823 ms
		//Toplam ms -> Toplam Gun, Saat, dakika, saniye -> 14650 gun 18 saat 43 dakika 12 saniye
		
		
		// Leap period -> 365 (1970) + 365 (1971) + 366 (1972) + 365 (1973) = 1461 gun
		// 2. yontem toplam yili/4 ve elde ettigin sayiyi topam gunden cikar... Sonra 365 e gore mod al
		
		// (10 leap period) 40 yil- 440 gun 18 saat 43 dakika 12 saniye
		
		// oncelikle kalan gun sayisin if else ler le 1.yil mi, 2 mi, 3 mu yoksa 4 mu diye hesapla
		// arda kalan gunleri (3.yil leap year) aylara bol
		// 1 Ocak 1970 e ekle
		
		
		/*
		 * Ornegin bizim toplam gun sayimiz 2001 gun 12 saat
		 * 2001/365 (int) 5 yil 176 gun
		 * 2001 - 1 = 2000 gun
		 * 2000 gun = 5 yil 175 gun
		 * 1970 ocak 1
		 * 5    
		 */
		
	
		
	}

}
