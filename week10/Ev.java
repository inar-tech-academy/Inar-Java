package week10;

public class Ev {
	/*
	 * Primitive Data Typelarin Default degerleri
	 *  Sayilar = 0 (short, byte, long int, float, double = 0.0)
	 *  boolean = false
	 *  Object = null
	 */
	private int price;
	private String address;
	private boolean isHouse;
	private int buildYear;
	private int roomNumber;
	private int bathNumber;
	private boolean hasGarage;
	private Student student;
	
	public static int olusturulanEvsayisi = 0;

	public Ev() {
		this(20000, "Ankara", false, 2000, 2, 1, false);
		Student akif = new Student();
		
	}

	public Ev(int price, String address, boolean isHouse, int buildYear, int roomNumber, int bathNumber,
			boolean hasGarage) {
		this.price = price;
		this.address = address;
		this.isHouse = isHouse;
		this.buildYear = buildYear;
		this.roomNumber = roomNumber;
		this.bathNumber = bathNumber;
		this.hasGarage = hasGarage;
		this.student = new Student();
		olusturulanEvsayisi++;
	}
	
	public static void yazdir(){
		System.out.println("BURALARDAN");
	}
	
	public int getPrice(){
		return price;
	}
	



	public void setPrice(int price){
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isHouse() {
		return isHouse;
	}

	public void setHouse(boolean isHouse) {
		this.isHouse = isHouse;
	}

	public int getBuildYear() {
		return buildYear;
	}

	public void setBuildYear(int buildYear) {
		this.buildYear = buildYear;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getBathNumber() {
		return bathNumber;
	}

	public void setBathNumber(int bathNumber) {
		this.bathNumber = bathNumber;
	}

	public boolean hasGarage() {
		return hasGarage;
	}

	public void setHasGarage(boolean hasGarage) {
		this.hasGarage = hasGarage;
	}
	
	public void print(){
		System.out.println("Price " + this.price);
		System.out.println("Address " + this.address);
		System.out.println("Is house " + isHouse());
		System.out.println("Build year " + this.buildYear);
		System.out.println("Has Garage " + this.hasGarage);
		System.out.println("Room number " + this.getRoomNumber());
		System.out.println("Bath Number " + this.getBathNumber());
	}
	
	public void showPazarlikPayi(){
		System.out.println("Min : " + (this.getPrice()- 20_000));
		System.out.println("Max : " + (this.getPrice()+ 20_000));
	}
	
	

}
