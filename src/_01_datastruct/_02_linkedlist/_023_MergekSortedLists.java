package _01_datastruct._02_linkedlist;

import util.ListNode;

import java.util.PriorityQueue;

public class _023_MergekSortedLists {
    /**
     * 思路：
     * 先对传入的节点数组排序，
     * 然后再两两合并
     *
     * time: O(nlogk)
     *
     * @param lists
     * @return
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        return sort(lists, 0, lists.length - 1);
    }

    public ListNode sort(ListNode[] lists, int low, int hight) {
        //越界
        if (low >= hight) return lists[low];
        //防止越界
        int mid = (hight - low) / 2 + low;
        ListNode l1 = sort(lists, low, mid);
        ListNode l2 = sort(lists, mid + 1, hight);
        return merge(l1, l2);
    }

    public ListNode merge(ListNode l1, ListNode l2) {
        if (l2 == null) return l1;
        if (l1 == null) return l2;
        //if (l1.val < l2.val) {
        //    l1.next = merge(l1.next, l2);
        //    return l1;
        //}
        //l2.next = merge(l1, l2.next);
        //return l2;

        //还是用循环的方式比较好理解，递归的方式比较占用内存
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if (l1 == null) cur.next = l2;
        if (l2 == null) cur.next = l1;
        return head.next;
    }

    /**
     * time: O(nlogk)
     *
     * 推荐使用 PriorityQueue 解法
     *
     * @param lists
     * @return
     */
    public ListNode mergeKLists2(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        //lambda 表达式写法，里面是一个比较器
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, (a, b) -> a.val - b.val);
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        for (ListNode list : lists) {
            if (list != null) {
                queue.add(list);
            }
        }

        while (!queue.isEmpty()) {
            cur.next = queue.poll();
            cur = cur.next;
            if (cur.next != null) {
                queue.add(cur.next);
            }
        }

        return dummy.next;
    }
}