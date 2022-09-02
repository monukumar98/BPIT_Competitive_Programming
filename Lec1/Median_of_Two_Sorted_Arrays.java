package Lec1;

public class Median_of_Two_Sorted_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] brr = { 2 };
		int[] arr = { 1, 3 };
		System.out.println(Median_of_Two_Sorted(brr, arr));

	}

	public static double Median_of_Two_Sorted(int[] a1, int[] b1) {
		int lo = 0;
		int hi = a1.length;
		int n = a1.length;
		int m = b1.length;
		while (lo <= hi) {
			int cut = (lo + hi) / 2;
			int cut2 = ((n + m + 1) / 2) - cut;
			int l1 = cut == 0 ? Integer.MIN_VALUE : a1[cut - 1];
			int r1 = cut == n ? Integer.MAX_VALUE : a1[cut];
			int l2 = cut2 == 0 ? Integer.MIN_VALUE : b1[cut2 - 1];
			int r2 = cut2 == m ? Integer.MAX_VALUE : b1[cut2];
			if (l1 <= r2 && l2 <= r1) {
				if ((m + n) % 2 == 0) {
					return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
				} else {
					return Math.max(l1, l2);
				}

			}
			if (l1 > r2) {
				hi = cut - 1;
			} else {
				lo = cut + 1;
			}

		}
		return 0.0;

	}

}
