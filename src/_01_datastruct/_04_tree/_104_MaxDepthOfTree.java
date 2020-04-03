package _01_datastruct._04_tree;

import util.TreeNode;

public class _104_MaxDepthOfTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }
}
