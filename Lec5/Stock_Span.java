package Lec5;

import java.util.Stack;

public class Stock_Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 73, 74, 75, 71, 69, 72, 76, 73 };
		CalSpan(arr);
	}

	public static void CalSpan(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < ans.length; i++) {

			while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
				st.pop();
			}
			if (st.isEmpty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - st.peek();

			}
			st.push(i);
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

}
