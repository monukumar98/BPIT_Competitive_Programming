package Lec13;

import java.util.ArrayList;
import java.util.List;

public class Right_View {

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

	class Solution {
	int pl = -1;

		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> list = new ArrayList<>();
			rightview(root, 0, list);
			return list;

		}

		public void rightview(TreeNode root, int cl, List<Integer> list) {
			if (root == null) {
				return;
			}
			if (pl < cl) {
				list.add(root.val);
				pl = cl;
			}
			rightview(root.right, cl + 1, list);
			rightview(root.left, cl + 1, list);

		}
	}

}
