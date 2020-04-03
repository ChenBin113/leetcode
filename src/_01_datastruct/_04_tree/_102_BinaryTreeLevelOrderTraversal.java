package _01_datastruct._04_tree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//二叉树的层次遍历，非常基础，需要掌握和精通
public class _102_BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        //边界
        if (root == null) return levels;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        //levels中的第一个level: [[],]
        int level = 0;

        while (!queue.isEmpty()) {
            //创建里层的容器
            levels.add(new ArrayList<Integer>());
            //容器的大小
            int level_length = queue.size();
            for (int i = 0; i < level_length; i++) {
                TreeNode temp = queue.remove();
                levels.get(level).add(temp.val);

                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            level++;
        }
        return levels;
    }
}
