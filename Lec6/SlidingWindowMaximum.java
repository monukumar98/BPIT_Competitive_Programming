package Lec6;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k=3;

	}

	public static int[] maxSlidingWindows(int[] arr, int k) {
		int[] ans = new int[arr.length - k + 1];
		Deque<Integer> dq = new LinkedList<>();
		// 1st window ke pehle Work krna hai
		for (int i = 0; i < k; i++) {
			while (!dq.isEmpty() && arr[dq.getLast()] <= arr[i]) {
				dq.removeLast();
			}
			dq.add(i);// add last krega

		}

		int idx = 0;
		ans[idx++] = arr[dq.getFirst()];
		for (int i = k; i < arr.length; i++) {

			while (!dq.isEmpty() && arr[dq.getLast()] <= arr[i]) {// window ke saare samllest remove kiya
				dq.removeLast();
			}

			while (!dq.isEmpty() && dq.getFirst() <= i - k) {// jo element window ka part nhi 
				dq.removeFirst();

			}
			dq.add(i);
			ans[idx++] = arr[dq.getFirst()];

		}
		return ans;

	}

}
