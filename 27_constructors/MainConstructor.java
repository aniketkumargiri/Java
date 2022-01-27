class Vehicle {
	int wheels;
	int headLights;
	String color;

//	no return type for constructor

//	Vehicle() {
////		default constructor
////		when a constructor is made by the user then we can't call default constructor there 
//	}

//	Vehicle() {
//		wheels = 4;
//	}
	
//	Vehicle(int wheels) {
//		this.wheels = wheels;
//		headLights = 2;
//	}

	Vehicle(int noOfWheels) {
		wheels = noOfWheels;
		headLights = 4;
	}

	Vehicle(int noOfWheels, int headOfLights, String colour) {
		wheels = noOfWheels;
		headLights = headOfLights;
		color = colour;
	}

}

public class MainConstructor {

	MainConstructor() {

		System.out.println("Object is now created");
	}

	public static void main(String[] args) {

//		MainConstructor obj = new MainConstructor();

//		Vehicle v0 = new Vehicle();
		
//		Vehicle v1 = new Vehicle();
////		v1.wheels = 4;
//		System.out.println(v1.wheels);

		Vehicle v2 = new Vehicle(3);
		System.out.println(v2.wheels);
		System.out.println(v2.headLights);

		Vehicle v3 = new Vehicle(2, 1, "red");
		System.out.println(v3.headLights);
		System.out.println(v3.headLights);
		System.out.println(v3.color);

	}

}
