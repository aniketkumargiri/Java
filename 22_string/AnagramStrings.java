public class AnagramStrings {

	public static void main(String[] args) {

		String a = "zxcv@!!#1234A";
		String b = "1234@A#!!zxcv";

		boolean isAnagram = true;

		int al[] = new int[256];
//		int bl[] = new int[256];

		for (char c : a.toCharArray()) {
			int index = (int) c;
			al[index]++;
		}
		for (char c : b.toCharArray()) {
			int index = (int) c;
//			bl[index]++;
			al[index]--;
		}

		for (int i = 0; i < 256; i++) {
//			if (al[i] != bl[i]) 
			if (al[i] != 0) {
				isAnagram = false;
			}
		}

		if (isAnagram) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}
	}

}
