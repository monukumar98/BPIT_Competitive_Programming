package Lec13;

public class CameraTree {
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

	class CameraCount {
		int count = 0;
	}

	class Solution {

		public int minCameraCover(TreeNode root) {
			CameraCount cc = new CameraCount();
			int need = CameraStatus(root, cc);
			if (need == -1) {
				cc.count++;
			}
			return cc.count;

		}

		public int CameraStatus(TreeNode root, CameraCount cc) {
			if (root == null) {
				return 1;
			}

			int left = CameraStatus(root.left, cc);
			int right = CameraStatus(root.right, cc);

			if (left == -1 || right == -1) {
				cc.count++;
				return 2;
			} else if (left == 1 && right == 1) {
				return -1;
			} else {
				return 1;
			}

		}
	}

}
