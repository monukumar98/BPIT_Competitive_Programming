package Lec10;

public class Wrapper_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer a = 127;
//		Integer a1 = 127;
//		Integer b = 190;
//		Integer b1 = 190;
//		System.out.println(a == a1);
//		System.out.println(b == b1);
//		String s1 = "Hello" + "bye";
//		String s2 = "Hello" + "bye";
//		System.out.println(s1 == s2);
//		String s3 = new String("Hello");
//		String s4 = new String("Hello");
//		System.out.println(s3 == s4);

		byte b1 = 9;
		b1 += 5;//  b1 = (byte)(b1+5);
		b1 = (byte) (b1 +5);
		b1++;// b1 = (byte)(b1+1);
		for (byte i = 0; i < 128; i++) {
			System.out.println(i);
		}

	}

}
