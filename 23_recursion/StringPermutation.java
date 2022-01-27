import java.util.HashSet;
import java.util.Set;

public class StringPermutation {

	static Set<String> set = new HashSet<>();

	static void permutation(String s, int l, int r) {

		if (l == r) {

			if (set.contains(s)) {
				return;
			}

			set.add(s);

			System.out.println(s);
			return;
		}

		for (int i = l; i <= r; i++) {

			s = interChange(s, l, i);

			permutation(s, l + 1, r);

			s = interChange(s, l, i);
		}

	}

	static String interChange(String s, int a, int b) {

		char array[] = s.toCharArray();
		char temp = array[a];
		array[a] = array[b];
		array[b] = temp;

		return String.valueOf(array);
	}

	public static void main(String[] args) {

		permutation("abca", 0, 2);

	}

}
