import encapsulation.EncapIntro;

public class MainClass {

	public static void main(String[] args) {

		// System.out.println("Hello World");

		// Person p1 = new Person();
		// p1.age = 17;
		// p1.name = "Aniket";
		//
		// Person p2 = new Person("Aniket Kumar Giri",21);
		//
		// System.out.println(p1.age + " "+ p1.name);
		// System.out.println(p2.age + " "+ p2.name);
		//
		// p1.walk();
		// p1.walk(9);
		// p2.eat();
		//
		// System.out.println(Person.count);

		// Person p3 = new Person("Swarit",65);
		// System.out.println(p3.age + " "+ p3.name);
		// p3.walk(34);
		Developer d1 = new Developer("harsh", 45);
		d1.walk();
		d1.walk(2);

		EncapIntro obj = new EncapIntro();
		obj.doWork();
	}

}

class Developer extends Person {
	public Developer(String name, int age) {
		super(name, age);

	}

	void walk() {
		System.out.println("Developer " + name + " is walking");
	}

}

class Person {
	String name;
	int age;

	static int count;

	// public Person() {
	// count++;
	// System.out.println("Creating an object");
	// }

	public Person(String NewName, int NewAge) {
		name = NewName;
		age = NewAge;
	}

	// public Person(String name, int age) {
	// this();
	// this.name = name;
	// this.age = age;
	// }

	void walk() {
		System.out.println(name + " is walking");
	}

	void eat() {
		System.out.println(name + " is eating");
	}

	void walk(int steps) {
		System.out.println(name + " walked " + steps + " steps");
	}
}