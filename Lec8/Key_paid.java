package Lec8;

import java.util.ArrayList;
import java.util.List;

public class Key_paid {
	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "238";
		List<String> list = new ArrayList<>();
		KeyPaid(str, "",list);
		System.out.println(list);

	}
	public static void KeyPaid(String ques,String ans,	List<String> list) {
		if(ques.length()==0) {
			//System.out.print(ans+" ");
			list.add(ans);
			return ;
		}
		
		char ch = ques.charAt(0);
		String Press = key[ch-'0'];
		for (int i = 0; i < Press.length(); i++) {
			KeyPaid(ques.substring(1), ans+Press.charAt(i),list);
		}
		
	}

}
