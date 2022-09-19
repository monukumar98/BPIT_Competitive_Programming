package Lec7;

public class Coin_Toss_Notwo_Cons_Head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		printanswer(n, "");

	}

	private static void printanswer(int n, String ans) {
		// TODO Auto-generated method stub
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		if (ans.length() ==0  || ans.charAt(ans.length() - 1) != 'H') {
			printanswer(n - 1, ans + "H");
		}
		printanswer(n - 1, ans + "T");

	}

}
