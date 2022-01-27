package interfaces;

public class Person implements Student,Youtuber{

	public static void main(String[] args) {

		Person obj=new Person();
		
		obj.study();
		obj.makeVideo();

	}

	@Override
	public void study() {
		
		System.out.println("Person is studying");
	}

	@Override
	public void makeVideo() {
		
		System.out.println("Person is making videos");
	}

}
