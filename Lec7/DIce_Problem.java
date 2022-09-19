package Lec7;

public class DIce_Problem {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		Printanswer(n, 0, "");
		System.out.println("\n" + count);

	}

	public static void Printanswer(int n, int curr, String ans) {
		if (curr == n) {
			System.out.print(ans + " ");
			count++;
			return;
		}
		if (curr > n) {
			return;
		}
//		
		for (int dice = 1; dice <= 3 && curr + dice <= n; dice++) {
			Printanswer(n, curr + dice, ans + dice);
		}

	}

	public static int Printanswer2(int n, int curr, String ans) {
		if (curr == n) {
			System.out.print(ans + " ");

			return 1;
		}
		if (curr > n) {
			return 0;
		}
		int c1 = Printanswer2(n, curr + 1, ans + 1);
		int c2 = Printanswer2(n, curr + 2, ans + 2);
		int c3 = Printanswer2(n, curr + 3, ans + 3);
		return c1 + c2 + c3;

	}

}
