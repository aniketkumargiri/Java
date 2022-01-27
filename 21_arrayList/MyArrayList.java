import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {

//		ArrayList<String> fruits=new ArrayList();
		List<String> fruits = new LinkedList<>();
//		List<String> vegetables=new ArrayList();

//		System.out.println(fruits.isEmpty());

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Hi");

//		System.out.println(fruits.size());

//		System.out.println(fruits.contains("Guava"));

//		fruits.set(2, "Giri");

//		fruits.remove(2);

//		System.out.println(fruits.get(1));

//		fruits.clear();

//		List<String> toRemove=new ArrayList<>();
//		toRemove.add("Apple");
//		toRemove.add("Banana");
//		
//		fruits.removeAll(toRemove);

		String temp[] = new String[fruits.size()];

		fruits.toArray(temp);

		for (String e : fruits) {
			System.out.print(e+" ");
		}

//		System.out.println(fruits);

//		vegetables.add("Potato");
//		vegetables.add("Tomato");
//		vegetables.add("carrot");
//		
//		System.out.println(vegetables);
//		
//		fruits.addAll(vegetables);
//		System.out.println(fruits);

//		ArrayList<Integer> marks=new ArrayList();
//		
//		marks.add(97);
//		
//		System.out.println(marks);
//		

//		Pair<String,Integer> p1=new Pair("Aniket",489);
//		
//		Pair<Boolean,String> p2=new Pair(true,"Kumar");
//		
//		p1.getDescription();
//		p2.getDescription();
	}

}
