package Lec7;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fib(n));

	}

	public static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int fn = fib(n - 1) + fib(n - 2);
		return fn;
	}

}
