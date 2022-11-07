package Lec19;

import java.util.*;

public class Alien_Dictionary {

	public String alienOrder(String[] words) {
		HashMap<Character, List<Character>> map = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			String word1 = words[i];
			for (int j = 0; j < word1.length(); j++) {
				if (!map.containsKey(word1.charAt(j))) {
					map.put(word1.charAt(j), new ArrayList<>());
				}
			}
		}

		for (int i = 0; i < words.length - 1; i++) {
			String word1 = words[i];
			String word2 = words[i + 1];
			if(word1.startsWith(word2) && word1.length()>word2.length()) {
				return "";
			}
			for (int j = 0; j < Math.min(word1.length(), word2.length()); j++) {
				if (word1.charAt(j) != word2.charAt(j)) {
					map.get(word1.charAt(j)).add(word2.charAt(j));
					break;
				}

			}
		}
		int[] in = indegree(map);
		Queue<Character> q = new LinkedList<>();
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				char ch = (char) (i + 'a');
				if (map.containsKey(ch)) {
					q.add(ch);
				}

			}
		}
		StringBuilder sb = new StringBuilder();
		int count = 0;
		while (!q.isEmpty()) {
			char ch = q.poll();
			sb.append(ch);
			count++;
			for (char nbrs : map.get(ch)) {
				in[nbrs - 'a']--;
				if (in[nbrs - 'a'] == 0) {
					q.add(nbrs);
				}
			}
		}

		return count == map.size() ? sb.toString() : "";

	}

	public int[] indegree(HashMap<Character, List<Character>> map) {
		int[] in = new int[26];
		for (char key : map.keySet()) {
			for (char nbrs : map.get(key)) {
				in[nbrs - 'a']++;
			}
		}
		return in;

	}

	public static void main(String[] args) {
		Alien_Dictionary ad = new Alien_Dictionary();
		String[] words = { "wrta", "wrfc", "erl", "ettn", "rfttb" };

		System.out.println(ad.alienOrder(words));
	}

}
