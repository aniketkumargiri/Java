public class Teacher {

	public static void main(String[] args) {

		Student obj = new Student("Aniket");

//		obj.name = "Harry";// -->can't get private class methods/constructors outside the class

		obj.getPassWord();// -->can get default class methods/constructors outside the package
	}
}
