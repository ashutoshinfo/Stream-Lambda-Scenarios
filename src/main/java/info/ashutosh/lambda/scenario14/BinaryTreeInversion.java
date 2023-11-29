package info.ashutosh.lambda.scenario14;

public class BinaryTreeInversion {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		System.out.println("Original Binary Tree:");
		printTree(root);

		TreeNode invertedRoot = invertTree(root);

		System.out.println("\nInverted Binary Tree:");
		printTree(invertedRoot);
	}

	public static void printTree(TreeNode root) {
		if (root == null) {
			return;
		}

		System.out.print(root.val + " ");
		printTree(root.left);
		printTree(root.right);
	}

	public static TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}

		// Swap the left and right subtrees
		TreeNode temp = root.left;
		root.left = invertTree(root.right);
		root.right = invertTree(temp);

		return root;
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int val) {
		this.val = val;
	}
}
