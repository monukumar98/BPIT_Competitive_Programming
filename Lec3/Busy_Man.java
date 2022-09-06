package Lec3;


import java.util.*;

public class Busy_Man {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			Pair[] arr = new Pair[n];
			for (int i = 0; i < arr.length; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				arr[i] = new Pair(x, y);
			}
			Arrays.sort(arr, new Comparator<Pair>() {

				@Override
				public int compare(Pair o1, Pair o2) {
					// TODO Auto-generated method stub
					return o1.et - o2.et;
				}
			});
			int activities = 1;
			int endtime = arr[0].et;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i].st >= endtime) {
					activities++;
					endtime = arr[i].et;
				}
			}
			System.out.println(activities);
			t--;
		}

	}

	public static class Pair {
		int st;
		int et;

		public Pair(int x, int y) {
			// TODO Auto-generated constructor stub
			this.st = x;
			this.et = y;
		}
	}

}
