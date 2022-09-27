package Lec9;

public class CoinChangesCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 5, 4 };
		int amount = 10;
		Printanswer(coin, amount, "", 0);

	}

	public static void Printanswer(int[] coin, int amount, String ans, int idx) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = idx; i < coin.length; i++) {
			if (amount >= coin[i]) {
				// amount -= coin[i];
				Printanswer(coin, amount - coin[i], ans + coin[i], i);
				// amount += coin[i];
			}
		}
	}

}
