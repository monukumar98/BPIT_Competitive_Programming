package Lec16;

public class BrokenCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int brokenCalc(int startValue, int target) {
		int count = 0;

		while (target > startValue) {

			if (target % 2 == 0) {
				target /= 2;
			} else {
				target++;
			}
			count++;

		}
		return count + (startValue - target);

	}
}
