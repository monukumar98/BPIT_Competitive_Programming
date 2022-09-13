package Lec5;

import java.util.Stack;

public class Reverse_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		Reverse(st);
		System.out.println(st);
	}

	private static void Reverse(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if (st.isEmpty()) {
			return;
		}
		int item = st.pop();
		Reverse(st);
		InsertDown(st, item);

	}

	public static void InsertDown(Stack<Integer> st, int item) {

		if (st.isEmpty()) {
			st.push(item);
			return;
		}
		int i = st.pop();
		InsertDown(st, item);
		st.push(i);

	}

}
