public class Nested {
	
	public static void main(String[] args) {
		
		int a = 12;
		int b = 8;
		int c = 10;
		int result = 0;
		if(a > b) {
			if(a > c) {
				result = a;
			}else {
				result = c;
			}
		}else {
			if(b > c) {
				result = b;
			}else {
				result = c;
			}
		}
		System.out.println("Largest of three numbers is: " + result);
		
		
	}

}
