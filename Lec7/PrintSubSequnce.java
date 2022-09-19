package Lec7;

public class PrintSubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		printanswer(str, "");

	}

	public static void printanswer(String ques, String ans) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		char ch = ques.charAt(0);
		printanswer(ques.substring(1), ans);
		printanswer(ques.substring(1), ans + ch);

	}

}
