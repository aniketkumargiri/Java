package encapsulation;

public class Interfaces implements Car, Person {

	public static void main(String[] args) {


	}

	@Override
	public void start() {

		System.out.println("My car is starting");
	}
	
	@Override
	public void walk() {

		System.out.println("Mine walking");
	}

}

//by default all abstract, so body not defined 
interface Car{
	
	 void start();	 
}

interface Person{
	void walk();
}