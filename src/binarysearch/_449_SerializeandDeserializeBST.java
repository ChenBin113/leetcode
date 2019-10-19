package binarysearch;

import util.TreeNode;

public class _449_SerializeandDeserializeBST {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "";
        StringBuilder sb = new StringBuilder();
        helper(root, sb);
        return sb.substring(0, sb.length() - 1);
        //return sb.toString();
    }

    public void helper(TreeNode root, StringBuilder sb) {
        if (root == null) return;
        sb.append(root.val).append("#");
        helper(root.left, sb);
        helper(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0) return null;
        String[] strings = data.split("#");
        TreeNode node = new TreeNode(Integer.parseInt(strings[0]));
        for (int i = 1; i < strings.length; i++) {
            int x = Integer.parseInt(strings[i]);
            TreeNode temp = new TreeNode(x);
            BSTInsert(node,temp);
        }
        return node;
    }

    public void BSTInsert(TreeNode node, TreeNode insertNode) {
        if (insertNode.val < node.val) {
            if (node.left != null) {
                BSTInsert(node.left, insertNode);
            } else {
                node.left = insertNode;
            }
        } else {
            if (node.right != null) {
                BSTInsert(node.right, insertNode);
            } else {
                node.right = insertNode;
            }
        }
    }
}
// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
