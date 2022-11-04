package Lec18;

import java.util.*;

public class VerticalOrderTraversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class VerticalPair {

		TreeNode node;
		int ht = 0;
		int vt = 0;

		public VerticalPair(TreeNode node, int ht, int vt) {
			// TODO Auto-generated constructor stub
			this.ht = ht;
			this.vt = vt;
			this.node = node;
		}
	}

	class Solution {
		public List<List<Integer>> verticalTraversal(TreeNode root) {
			TreeMap<Integer, List<VerticalPair>> map = new TreeMap<>();
			Queue<VerticalPair> qq = new LinkedList<>();

			qq.add(new VerticalPair(root, 0, 0));
			while (!qq.isEmpty()) {
				VerticalPair rp = qq.remove();
				if (!map.containsKey(rp.vt)) {
					map.put(rp.vt, new ArrayList<>());
				}
				map.get(rp.vt).add(rp);
				if (rp.node.left != null) {
					qq.add(new VerticalPair(rp.node.left, rp.ht + 1, rp.vt - 1));
				}
				if (rp.node.right != null) {
					qq.add(new VerticalPair(rp.node.right, rp.ht + 1, rp.vt + 1));
				}

			}

			List<List<Integer>> ans = new ArrayList<>();
			for (int key : map.keySet()) {
				List<VerticalPair> ll = map.get(key);
				Collections.sort(ll, new Comparator<VerticalPair>() {

					@Override
					public int compare(VerticalPair o1, VerticalPair o2) {
						// TODO Auto-generated method stub
						if (o1.ht == o2.ht) {
							return o1.node.val - o2.node.val;
						}

						return 0;
					}
				});
				List<Integer> list = new ArrayList<>();
				for (int i = 0; i < ll.size(); i++) {
					list.add(ll.get(i).node.val);
				}
				ans.add(list);

			}
			return ans;

		}

	}

}
