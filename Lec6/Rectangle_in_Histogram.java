package Lec6;

import java.util.Stack;

public class Rectangle_in_Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 4, 6, 1, 7 };
		System.out.println(MaxArea(arr));

	}

	public static int MaxArea(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {

			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				int h = arr[st.pop()];
				int r = i;
				if (!st.isEmpty()) {
					int l = st.peek();
					int area = h * (r - l - 1);
					ans = Math.max(ans, area);
				} else {
					int area = h * r;
					ans = Math.max(ans, area);
				}
			}
			st.push(i);
		}

		int r = arr.length;
		while (!st.isEmpty()) {
			int h = arr[st.pop()];

			if (!st.isEmpty()) {
				int l = st.peek();
				int area = h * (r - l - 1);
				ans = Math.max(ans, area);
			} else {
				int area = h * r;
				ans = Math.max(ans, area);
			}
		}
		return ans;

	}

}
