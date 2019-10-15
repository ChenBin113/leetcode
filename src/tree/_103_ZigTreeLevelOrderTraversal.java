package tree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _103_ZigTreeLevelOrderTraversal {

    /*
    此题有几个注意点：
    1.和 102 题不一样之处在于 level 的定义，在此处就有几个细节需要修改
    2.level 使用了 LinkedList 实现，有助于使用 addFirst()
    3.使用 isReverse 标志
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        //注意此处使用 ArrayList 实现，内部使用的泛型是 List<Integer>
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null) return levels;

        //注意此处使用 LinkedList 实现
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        //第一层正向读取
        boolean isReverse = false;

        while (!queue.isEmpty()) {
            //注意此处使用 LinkedList 实现
            LinkedList<Integer> level = new LinkedList<>();
            int level_length = queue.size();
            for (int i = 0; i < level_length; i++) {
                TreeNode temp = queue.remove();
                if (!isReverse) {
                    level.add(temp.val);
                } else {
                    level.addFirst(temp.val);
                }
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            isReverse = !isReverse;
            levels.add(level);
        }
        return levels;
    }
}
