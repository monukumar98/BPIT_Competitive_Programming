package Lec9;

public class Letter_Tile_Possibilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AAB";
		int frq[] = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			frq[ch - 'A']++;

		}
		System.out.println(TilePossibilities(frq, ""));

	}

	public static int TilePossibilities(int[] freq, String ans) {

		int res = 0;

		for (int i = 0; i < freq.length; i++) {

			if (freq[i] > 0) {
				char ch = (char) (i + 'A');
				freq[i]--;
				res += TilePossibilities(freq, ans + ch)+1;
				freq[i]++;
			}

		}
		return res;
	}

}
