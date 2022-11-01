package Lec16;

import java.util.*;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(Anagrams(arr));

	}

	public static List<List<String>> Anagrams(String[] strs) {

		HashMap<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			String key = Key(strs[i]);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(strs[i]);

		}

		List<List<String>> list = new ArrayList<>();
		for (String key : map.keySet()) {
			list.add(map.get(key));
		}
		return list;

	}

	public static String Key(String str) {

		int[] freq = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			freq[ch - 'a']++;
		}

		String s = "";
		for (int i = 0; i < freq.length; i++) {
			s += freq[i];
		}
		return s;
	}

}
