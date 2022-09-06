package Lec3;

public class Disjoint_Intervals {
// https://leetcode.com/problems/partition-array-into-disjoint-intervals/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 0, 3, 8, 6 };
		System.out.println(DisjointIntervals(arr));

	}

	public static int DisjointIntervals(int[] arr) {

		int curr = arr[0];
		int left = arr[0];
		int pos = 0;
		for (int i = 1; i < arr.length; i++) {
			curr = Math.max(curr, arr[i]);
			if (left > arr[i]) {
				pos = i;
				left = curr;
			}
		}
		return pos + 1;

	}

}
