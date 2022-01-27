public class RepairShop {

	public static void repairCar(Car car) {

		System.out.println("car is repaired");
	}

//	public static void repairCar(WagonR car) {
//
//		System.out.println("car is repaired");
//	}
//
//	public static void repairCar(Audi car) {
//
//		System.out.println("car is repaired");
//	}

	public static void main(String[] args) {

		WagonR wagonR = new WagonR();
		Audi audi = new Audi();

//		Car car = new Car();

		repairCar(wagonR);
		repairCar(audi);

	}

}
