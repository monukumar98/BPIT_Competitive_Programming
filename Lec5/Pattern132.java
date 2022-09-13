package Lec5;

import java.util.Stack;

public class Pattern132 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 3, -4, 0, 1, 2, 6 };
		System.out.println(isPattern132(arr));

	}

	public static boolean isPattern132(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] min = new int[arr.length];
		min[0] = arr[0];
		for (int i = 1; i < min.length; i++) {
			min[i] = Math.min(min[i - 1], arr[i]);
		}
		for (int i = min.length - 1; i >= 0; i--) {
			int ith = min[i];
			while (!st.isEmpty() && arr[st.peek()] <= ith) {// stack ke inside wala element k hai
				st.pop();
			}
			if (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				return true;
			}
			st.push(i);

		}
		return false;

	}

}
