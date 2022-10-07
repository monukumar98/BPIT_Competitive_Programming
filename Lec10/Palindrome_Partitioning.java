package Lec10;

import java.util.*;

public class Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		List<String> list = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		PalindromePartitioning(str, list, ans);
		System.out.println(ans);

	}

	public static void PalindromePartitioning(String ques, List<String> list, List<List<String>> ans) {
		if (ques.length() == 0) {
			//System.out.println(list);
			ans.add(new ArrayList<>(list));
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String s = ques.substring(0, i);
			if (isPalindrome(s) == true) {

				list.add(s);
				PalindromePartitioning(ques.substring(i), list, ans);
				list.remove(list.size() - 1);
			}
		}

	}

	private static boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
