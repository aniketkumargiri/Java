public class Introduction {

	public static void main(String[] args) {

		String another = new String("Giri");
		System.out.println(another);

		String name = "Aniket"; // immutable
		String title = "Aniket";
		
		System.out.println(name);
		System.out.println(title);
		
		System.out.println(name == title);
		
		System.out.println(name == another);
		
		name="Kumar";
		System.out.println(name);
		


	}

}
