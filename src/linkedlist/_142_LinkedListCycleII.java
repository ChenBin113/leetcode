package linkedlist;

import util.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @date 2019/10/6 23:01
 */
public class _142_LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return head;
            }
            set.add(head);
            head = head.next;
        }
        return null;
    }

    //思路2，快慢指针
    public ListNode detectCycle2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode meet = null; //slow & fast meeting
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast == null) {
                return null;
            }
            fast = fast.next; //fast 指针走多一步
            if (slow == fast) {
                meet = fast;
                break;
            }
        }
        if (meet == null) {
            return null;
        }
        while (head != null && meet != null) {
            if (head == meet) {
                return meet;
            }
            head = head.next;
            meet = meet.next;
        }
        return null;
    }
}
