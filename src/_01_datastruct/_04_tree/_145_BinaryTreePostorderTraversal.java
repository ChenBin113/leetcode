package _01_datastruct._04_tree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _145_BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if (root == null) return ret;

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> retStack = new Stack<>();

        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            retStack.push(node.val);
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }

        while (!retStack.isEmpty()) {
            ret.add(retStack.pop());
        }
        return ret;
    }
}
