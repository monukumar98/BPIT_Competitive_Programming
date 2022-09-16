package Lec6;

import java.util.Stack;

public class Maximal_Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] arr = { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' },
				{ '1', '0', '0', '1', '0' } };
		System.out.println(Rectangles(arr));

	}

	public static int Rectangles(char[][] arr) {
		int[][] ans = new int[arr.length][arr[0].length];
		int area = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i == arr.length - 1) {
					ans[i][j] = (arr[i][j]-'0');
				} else {
					ans[i][j] = arr[i][j] == '1' ? ans[i + 1][j] + 1 : 0;
				}

			}
			
			area = Math.max(area, MaxArea(ans[i]));

		}
		return area;

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
