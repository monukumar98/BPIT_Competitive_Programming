package Lec17;

public class KeysKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 378;
		int div = 2;
		int ans = 0;
		while (n > 1) {
			while (n % div == 0) {
				n = n / div;
				ans += div;
			}
			div++;
		}
		System.out.println(ans);

	}

}
