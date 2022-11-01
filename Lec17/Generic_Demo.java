package Lec17;

public class Generic_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// char ch[] = { 'a', 'b' };
		Integer[] arr = { 100, 200, 300, 400 };
		Display(arr);
		String[] arr1 = { "Anish", "Raj", "Rahul", "kunal" };
		Display(arr1);

	}

	public static <T> void Display(T[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
