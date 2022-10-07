package Lec13;

public class PathSum_III {

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
		public int pathSum(TreeNode root, int targetSum) {
			if (root == null) {
				return 0;
			}
			int count = selfpath(root, targetSum);
			int leftpath = pathSum(root.left, targetSum);
			int rightpath = pathSum(root.right, targetSum);
			return count + leftpath + rightpath;

		}

		public int selfpath(TreeNode root, int targetsum) {

			if (root == null) {
				return 0;
			}
			int ans = 0;
			if (root.val - targetsum == 0) {
				ans++;
			}

			ans = ans + selfpath(root.left, targetsum - root.val);
			ans = ans + selfpath(root.right, targetsum - root.val);
			return ans;

		}
	}

}
