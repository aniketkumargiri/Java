import staticKey.A.B;
import staticKey.A.C;

public class StaticKeyword {
	
//	static blocks are executed before the program executation starts from main
	
	static {
		
		System.out.println("In block 1");
	}
	
	static {
		
		System.out.println("In block 2");	
	}

	

//	static is related to class

	public static void main(String[] args) {

		
		System.out.println("Inside main");
		
		A objA = new A();
		B objB = objA.new B();

//		static classes are used in another class as it behaves as the part of the same class
		
		C objC=new A.C();
		
	}
	
	static {
		
		System.out.println("In block 3");
	}


}
