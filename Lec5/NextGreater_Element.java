package Lec5;

import java.util.Stack;

public class NextGreater_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, -7, -9, 3, 7, 6, 8, 11, 9 };
		NGE(arr);

	}

	public static void NGE(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[arr.length];
		for (int i = 0; i < ans.length; i++) {
              
			while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
				ans[st.pop()] = arr[i];
				
			}
			st.push(i);
			

		}

		while (!st.isEmpty()) {
			ans[st.pop()] = -1;
		}

		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i] + " -> " + ans[i]);
		}

	}

}
