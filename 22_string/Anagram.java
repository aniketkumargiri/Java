//Same number of characters repeats for same number of times--> same length
//eg: listen & silent
//eg: cat & act

public class Anagram {

	public static void main(String[] args) {

		String a = "act";
		String b = "cat";

		boolean isAnagram = false;
		boolean visited[] = new boolean[b.length()];

		if (a.length() != b.length()) {

			for (int i = 0; i < a.length(); i++) {
				isAnagram = false;
				char c = a.charAt(i);
				for (int j = 0; j < b.length(); j++) {
					if (b.charAt(j) == c && !visited[j]) {
						isAnagram = true;
						break;
					}
				}
				if (!isAnagram) {
					break;
				}
			}
		}
		
		if (isAnagram) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}
	}
}
