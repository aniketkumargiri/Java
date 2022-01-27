import java.util.Iterator;

public class Example {

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
			if (i >= 40 && i <= 50) {
				continue;
			}	
			System.out.println(i);

		}
	}

}
