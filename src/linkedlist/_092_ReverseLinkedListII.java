package linkedlist;

import util.ListNode;

public class _092_ReverseLinkedListII {
	//链表由 pre_head, head, modify_list_tail 划分成三个部分：
	//不变的部分 head 的前驱，modify_list_tail 的后继以及中间涉及翻转的链表
	//pre_head 表示翻转链表第一个结点前一个不变的结点
	//head 表示翻转链表的第一个结点
	//modify_list_tail 表示修改后的链表的尾部结点
	//time: O(n)
	//space: O(1)
    public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode result = head; //这一步比较关键，防止一些边界情况，后面只要做好链表反转即可
		int change_len = n - m + 1; //改变的节点个数
		ListNode pre_head = null; //改变前头结点的前驱

		//移动头结点 m - 1 个位置，先减 1，再判断：将 head 移动到翻转的第一个结点处
		while (head != null && --m != 0){
			pre_head = head;
			head = head.next;
		}

		ListNode modify_list_tail = head;
		ListNode new_head = null;

		//翻转结点
		while (head != null && change_len != 0){
			ListNode next = head.next;
			head = new_head;
			new_head = head;
			head = next;
			change_len--;
		}

		//连上后继
		modify_list_tail.next = head;

		//前驱需要判断是否为空，有可能从第一个结点就开始翻转
		if (pre_head != null){
			pre_head.next = new_head;
		} else {
			result = new_head;
		}
		return result;
	}
}
