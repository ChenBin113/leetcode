package linkedlist;

import util.Node;

import java.util.HashMap;

/**
 * @date 2019/10/7 14:22
 */
public class _138_CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        HashMap<Node, Node> map = new HashMap<>();
        Node cur = head;
        while (cur != null) {
            map.put(cur, new Node(cur.val, null, null));
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            //此处需要理解一下逻辑，cur 原本可知 next & random 指针域
            //由于此前已经将链表的所有元素存入 HashMap 中，因此查找到 next 元素赋值给 map 的 value
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        Node new_head = map.get(head);
        return new_head;
    }
}