package Lec7;

public class Fact_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		// System.out.println(n++);
		System.out.println(fact(n, 1));

	}

	public static int fact(int n, int ans) {
		if (n == 0) {
			return ans;
		}

		return fact(n-1, ans * n);

	}
}
