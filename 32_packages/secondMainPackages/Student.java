public class Student {

	private String name;

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		getPassWord();
		return name;
	}

//	default methods/constructors can be visible inside the same package
	String getPassWord() {
		return "zxcv@31234A";
	}
	
//	public static void main(String[] args) {
//		
//		System.out.println("Detailed in packages");
//
//	}

}
