package _01_datastruct._04_tree;

import util.TreeNode;

public class _543_DiameterofBinaryTree {
    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        depth(root);
        return max;
    }

    public int depth(TreeNode root) {
        if (root == null) return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        max = Math.max(left + right, max);
        return Math.max(left, right) + 1;
    }
}
