package _01_datastruct._04_tree;

import util.TreeNode;

public class _110_IsBalanced {
    private boolean res = true;

    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return res;

    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if (Math.abs(left - right) > 1) {
            res = false;
        }
        return Math.max(left, right) + 1;
    }
}
