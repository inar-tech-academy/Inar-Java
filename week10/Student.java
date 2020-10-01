package week10;

public class Student {

	//class = data_field (variable) + methods (behavior)
	/*
	 * isim
	 * yasi
	 * addresi (ulke)
	 * cinsiyet
	 * 
	 * 
	 * 
	 * codeyazmak
	 * konusmak
	 * 
	 */
	private String isim;
	private int yas;
	private String adres;
	boolean bayanMi;
	
	//Eger olusturdugunuz sinifin constructor i yoksa, java default olarak non-argument constructor atar
	/*
	 * - Class ismi ile ayni
	 * - return type yok
	 * 
	 */
	public Student(){
		isim = "Kamil";
		yas = 23;
		adres = "America";
		bayanMi = false;
	}

	public Student(String isim, int yas, String adres, boolean bayanMi) {
		this.isim = isim;
		this.yas = yas;
		this.adres = adres;
		this.bayanMi = bayanMi;
	}
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public void yazdir(){
		deneme();
		cevapla();
	}
	
	void deneme(){
		System.out.println("deneme yazdir");
	}
	
	private void cevapla(){
		System.out.println("cevapla");
	}

	public void konusmak(){}

	
	

}
