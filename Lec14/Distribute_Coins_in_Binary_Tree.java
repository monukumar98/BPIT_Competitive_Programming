package Lec14;

public class Distribute_Coins_in_Binary_Tree {
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
		int move = 0;

		public int distributeCoins(TreeNode root) {
			CoinMove(root);
			return move;
		}

		public int CoinMove(TreeNode root) {
			if (root == null) {
				return 0;
			}
			int l = CoinMove(root.left);
			int r = CoinMove(root.right);
			move += Math.abs(l) + Math.abs(r);

			return (l + r + root.val - 1);
		}
	}
}
