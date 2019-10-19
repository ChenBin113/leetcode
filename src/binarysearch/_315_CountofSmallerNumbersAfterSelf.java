package binarysearch;

import util.BSTNode;

import java.util.ArrayList;
import java.util.List;

public class _315_CountofSmallerNumbersAfterSelf {
    //使用二叉查找树
    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        BSTNode node = new BSTNode(nums[nums.length - 1]);
        res.add(0);
        for (int i = nums.length - 2; i >= 0; i--) {
            BSTNode insertNode = new BSTNode(nums[i]);
            int countSmall = 0;
            BSTInsert(node, insertNode, countSmall, res);
        }
        //System.out.println(res);
        return res;
    }

    public static void BSTInsert(BSTNode node, BSTNode insertNode, int countSmall, List<Integer> res) {
        if (insertNode.val <= node.val) {
            node.count++;
            if (node.left != null) {
                BSTInsert(node.left, insertNode, countSmall, res);
            } else {
                node.left = insertNode;
                res.add(0, countSmall);
            }
        } else {
            countSmall += node.count + 1;
            if (node.right != null) {
                BSTInsert(node.right, insertNode, countSmall, res);
            } else {
                node.right = insertNode;
                res.add(0, countSmall);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 6, 1};
        countSmaller(nums);
    }
}