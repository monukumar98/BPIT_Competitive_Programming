package Lec13;

public class Optimize_Diameter_of_Binary_Tree {
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

	class Diapair {
		int h = -1;
		int d = 0;
	}

	class Solution {
		public int diameterOfBinaryTree(TreeNode root) {
			return diameter(root).d;
		}

		public Diapair diameter(TreeNode root) {
			if (root == null) {
				return new Diapair();

			}

			Diapair ldp = diameter(root.left);
			Diapair rdp = diameter(root.right);

			Diapair sdp = new Diapair();
			sdp.h = Math.max(ldp.h, rdp.h) + 1;
			int d = ldp.h + rdp.h + 2;
			sdp.d = Math.max(ldp.d, Math.max(rdp.d, d));
			return sdp;

		}
	}

}
