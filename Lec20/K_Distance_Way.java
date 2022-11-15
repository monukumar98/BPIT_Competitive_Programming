package Lec20;

import java.util.*;

public class K_Distance_Way {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public class BfsPair {
		int vtx;
		int lv;

		public BfsPair(int vtx, int lv) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.lv = lv;
		}

	}

	class Solution {
		public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
			HashMap<Integer, List<Integer>> map = new HashMap<>();
			CreateGraph(root, map);
			List<Integer> ans = new ArrayList<>();
			Queue<BfsPair> q = new LinkedList<>();
			q.add(new BfsPair(target.val, 0));
			HashSet<Integer> visited = new HashSet<>();
			while (!q.isEmpty()) {
				BfsPair rp = q.remove();

				if (rp.lv == k) {
					ans.add(rp.vtx);
				}
				visited.add(rp.vtx);
				for (int nbrs : map.get(rp.vtx)) {
					if (!visited.contains(nbrs) && rp.lv < k) {
						q.add(new BfsPair(nbrs, rp.lv + 1));
					}
				}
			}
			return ans;

		}

		public void CreateGraph(TreeNode root, HashMap<Integer, List<Integer>> map) {
			if (root == null) {
				return;
			}
			if (!map.containsKey(root.val)) {
				map.put(root.val, new ArrayList<>());
			}
			if (root.left != null) {
				map.get(root.val).add(root.left.val);
				map.put(root.left.val, new ArrayList<>());
				map.get(root.left.val).add(root.val);
			}
			if (root.right != null) {
				map.get(root.val).add(root.right.val);
				map.put(root.right.val, new ArrayList<>());
				map.get(root.right.val).add(root.val);
			}
			CreateGraph(root.left, map);
			CreateGraph(root.right, map);

		}
	}
}
