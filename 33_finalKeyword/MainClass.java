public class MainClass {

//	String ROLL_NO;
//	final String ROLL_NO = "89";// -->final variable must be initialised for global variables

	public static void main(String[] args) {

//		final String name;
//		name = "Aniket";
////		name = "kumar";// --> final variable can't be reinitialised
//		
//		System.out.println(name);

		final Student obj = new Student();

		Student obj2 = new Student();

		obj.name = "Giri";

//		obj = obj2;// -->can't reassign because obj is final

	}

}
