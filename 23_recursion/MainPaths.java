public class MainPaths {

	public static int paths(int n, int m) {

		if (n == 1 || m == 1) {
			return 1;
		}

		return paths(n - 1, m) + paths(n, m - 1);
	}

	public static void main(String[] args) {
		
		System.out.println(paths(10, 1));
		
		System.out.println(paths(1, 20));
		
		System.out.println(paths(4, 4));		

	}

}
