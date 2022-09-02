package Lec1;

import java.util.*;

public class Two_Arrays_and_Sum_of_Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		Integer[] b = new Integer[n];
		for (int i = 0; i < b.length; i++) {
			a[i] = sc.nextLong();
			a[i] = a[i] * (i + 1) * (n - i);
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b, Collections.reverseOrder());
		int sum = 0;
		int mod = 998244353;
		for (int i = 0; i < b.length; i++) {
			sum = (int) (sum + (a[i] % mod * b[i]) % mod);
			sum = sum % mod;
		}
		System.out.println(sum);

	}

}
