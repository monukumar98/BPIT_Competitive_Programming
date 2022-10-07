package Lec10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(arr);
		Sum2(arr, target, 0, list, ans);
		System.out.println(ans);

	}

	public static void Sum2(int[] candidates, int target, int idx, List<Integer> list, List<List<Integer>> ans) {
		if (target == 0) {
			// System.out.println(ans);
			// System.out.println(list);
			ans.add(new ArrayList<>(list));
			return;
		}
		for (int i = idx; i < candidates.length; i++) {
			if (i != idx && candidates[i] == candidates[i - 1]) {
				continue;
			}

			if (target >= candidates[i]) {
				list.add(candidates[i]);

				Sum2(candidates, target - candidates[i], i + 1, list, ans);
				list.remove(list.size() - 1);
			}

		}

	}

}
