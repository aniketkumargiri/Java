import java.util.*;

public class Triplets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			Triplet g = new Triplet();
			if (g.findTriplets(a, n)) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	}

}

class Triplet {

	public boolean findTriplets(int arr[], int n) {

		Arrays.sort(arr);

		for (int i = 0; i < n - 2; i++) {

			if (twoSum(arr, -arr[i], i + 1)) {
				return true;
			}
		}
		return false;
	}

	public boolean twoSum(int a[], int x, int i) {

		int j = a.length - 1;

		while (i < j) {

			if ((a[i] + a[j]) > x) {
				j--;
			} else if ((a[i] + a[j]) < x) {
				i++;
			} else {
				return true;
			}
		}

		return false;

	}
}