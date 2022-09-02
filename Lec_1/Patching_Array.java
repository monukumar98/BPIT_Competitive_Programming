package Lec_1;

public class Patching_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 5, 10 };
		int n = 32;
		System.out.println(PatchingArray(arr, n));

	}

	public static int PatchingArray(int[] arr, int n) {

		int miss = 1;
		int i = 0;
		int c = 0;
		while (miss <= n) {

			if (i < arr.length && miss >= arr[i]) {

				miss += arr[i];// miss = miss + arr[i]
				i++;
			} else {
				miss += miss;
				c++;
			}
		}
		return c;

	}

}
