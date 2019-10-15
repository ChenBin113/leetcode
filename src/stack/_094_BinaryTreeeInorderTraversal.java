package stack;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _094_BinaryTreeeInorderTraversal {

    /**
     * Definition for a binary tree node.
     */


    /**
     * 递归调用方法
     * time: O(n)
     * space: O(n)
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal01(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        helper(res, root);
        return res;
    }

    public List<Integer> helper(List<Integer> res, TreeNode root) {
        if (root == null) return res;
        helper(res, root.left);
        res.add(root.val);
        helper(res, root.right);
        return res;
    }

    /**
     * Stack 里储存的元素需要好好看，是 TreeNode
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal02(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }
}


