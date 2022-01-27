import encapsulation.EncapIntro;

public class Abstraction {

	public static void main(String[] args) {

		Audi a1 = new Audi();
		a1.start();
	}

}

class Audi extends Car {

	@Override
	void start() {

		System.out.println("Car Audi is starting");

	}

}

class BMW extends Car {

	@Override
	void start() {

		System.out.println("Car BMW is starting");

	}

}

abstract class Car {

	int price;

	abstract void start();

//	void breaks() {
//		System.out.println("Car will stop after the break");
//	}
}