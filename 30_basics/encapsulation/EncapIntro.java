package encapsulation;

public class EncapIntro {

	public static void main(String[] args) {

		Laptop l1 = new Laptop();
//		 l1.price(23000);//--> private
		l1.setPrice(23000);
		l1.setRam(8);

		System.out.println(l1.getPrice());	
		System.out.println(l1.getRam());

	}

	public void doWork() {
		System.out.println("Working well!");
	}
//	 
//	 private void doWork() {
//		 System.out.println("Working well!");
//	 }
//	 
//	 void doWork() {
//		 System.out.println("Working well!");
//	 }

}

class Laptop {
	int ram;
	private int price;

	public void setPrice(int price) {
		boolean isAdmin = true;
		if (!isAdmin) {
			System.out.println("You cannot set the price");
		} else {
			this.price = price;
		}
	}

//	Right click --> Source --> Generate Getters and Setters

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

}
