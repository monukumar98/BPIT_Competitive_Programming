package Lec3;

public class Gsa_Station {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gas = { 1, 2, 3, 4, 5 };
		int[] cost = { 3, 4, 5, 1, 2 };
		System.out.println(StartStation(gas, cost));

	}

	public static int StartStation(int[] gas, int[] cost) {
		int total = 0;
		int curr = 0;
		int pos = 0;
		for (int i = 0; i < cost.length; i++) {
			total = total + gas[i] - cost[i];
			curr = curr + gas[i] - cost[i];
			if (curr < 0) {
				pos = i + 1;
				curr = 0;
			}
		}

		if (total < 0) {
			return -1;
		}
		return pos;
		
		

	}

}
