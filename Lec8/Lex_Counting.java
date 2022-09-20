package Lec8;

public class Lex_Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		PrintCounting(0, n);

	}

	public static void PrintCounting(int curr, int end) {
		if (curr > end) {
			return;
		}
		System.out.println(curr);
		int i = 0;
		if (curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			PrintCounting(curr * 10 + i, end);
		}

	}

}
