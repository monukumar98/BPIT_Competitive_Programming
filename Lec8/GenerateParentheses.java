package Lec8;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<String> list = new ArrayList<>();
		Generate_Parentheses(n, 0, 0, "", list);
		System.out.println(list);

	}

	public static void Generate_Parentheses(int n, int open, int close, String ans, List<String> list) {
		if (open == n && close == n) {
			// System.out.print(ans + " ");
			list.add(ans);
		}
		if (open < n) {
			Generate_Parentheses(n, open + 1, close, ans + "(", list);
		}
		if (close < open) {
			Generate_Parentheses(n, open, close + 1, ans + ")", list);
		}
	}

}
