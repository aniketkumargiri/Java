public class PassByValue {

	public static void main(String[] args) {

//		Java is always pass by value

//		int a = 23;
//		int b = 12;
//		System.out.println(a + " " + b);
//
//		swap(a, b);
//		System.out.println(a + " " + b);

//		Dog c = new Dog();
//		c.legs = 4;
//		Dog d = new Dog();
//		d.legs = 3;
//		System.out.println(c.legs + " " + d.legs);
//
//		swap(c, d);
//		System.out.println(c.legs + " " + d.legs);

		Dog e = new Dog();
		e.legs = 4;
		System.out.println(e.legs);

		changeDog(e);
		System.out.println(e.legs);
	}

	static void swap(int x, int y) {

		int temp = x;
		x = y;
		y = temp;

	}

	static void swap(Dog a, Dog b) {

		Dog temp = a;
		a = b;
		b = temp;

	}

	static void changeDog(Dog dog) {

		dog.legs = 6;
	}

}

class Dog {

	int legs;
}
