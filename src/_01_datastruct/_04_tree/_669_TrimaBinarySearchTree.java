package _01_datastruct._04_tree;

import util.TreeNode;

public class _669_TrimaBinarySearchTree {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        // 判断是否为空
        if (root == null) return root;

        // 递归调用左右子树
        // 条件成立，则新树结点可能出现位置在左子树
        if (root.val > R) return trimBST(root.left,L,R);
        // 条件成立，则新树结点可能出现位置在右子树
        if (root.val < L)return  trimBST(root.right,L,R);

        // 重新构建树
        root.left = trimBST(root.left,L,R);
        root.right = trimBST(root.right,L,R);

        return root;
    }
}
