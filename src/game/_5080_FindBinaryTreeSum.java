package game;

import util.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class _5080_FindBinaryTreeSum {
    /**
     * 给出两棵二叉搜索树，请你从两棵树中各找出一个节点，使得这两个节点的值之和等于目标值 Target。
     * 如果可以找到返回 True，否则返回 False。
     *
     * @param root1
     * @param root2
     * @param target
     * @return
     */
    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        if (root1 == null || root2 == null) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root1);
        int i = 0;
        while (!queue.isEmpty()) {
            TreeNode temp = queue.remove();
            map.put(temp.val, i++);
            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }
        queue.add(root2);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.remove();
            if (map.containsKey(target - temp.val)) {
                return  true;
            }
            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }
        return false;
    }
}
