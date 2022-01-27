import java.util.ArrayList;

import java.util.List;

public class Lists2 {

	public static void main(String[] args) {

//		List<Integer> list=new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		System.out.println(list);
//		
//		list.add(4);
//		System.out.println(list);
//		
//		list.add(1, 23);
//		System.out.println(list);
//		
//		List<Integer>newList=new ArrayList<>();
//		newList.add(150);
//		newList.add(170);
//		
//		list.addAll(newList);
//		System.out.println(list);
//		
//		System.out.println(list.get(1));

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);

		System.out.println(list);
		
//		list.remove(3);
//		System.out.println(list);
//		
//		list.remove(Integer.valueOf(70));
//		System.out.println(list);
//		
//		list.clear();
//		System.out.println(list);
		
		list.set(2, 100);
		System.out.println(list);
		
		System.out.println(list.contains(45));

	}

}
