# LeetCode 题解 - 链表 - 

<!-- MarkdownTOC levels="1,2,3" autolink="true"  autoanchor="true" -->

- [_002_AddTwoNumbers](#002addtwonumbers)
	- [要点](#%E8%A6%81%E7%82%B9)

<!-- /MarkdownTOC -->


- 相关代码 [src/linkedlist](./src/linkedlist)

<a id="002addtwonumbers"></a>
## _002_AddTwoNumbers

<a id="%E8%A6%81%E7%82%B9"></a>
### 要点

先判断传入节点是否有一个为空，有的话直接返回另一个节点。

在传入节点都非空情况下，定义一个哑节点，可以有效防止下一个节点为 null，可以先创建好节点，再将指针移动，如此处：

```java
cur.next = new ListNode(sum % 10);
cur = cur.next;
```

需要注意使用自定义指针来代替移动传入的指针，这样就不破坏原来传入的结构了。最终还要注意判断是否 `sum == 1` 。

```java
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    if (l1 == null) return l2;
    if (l2 == null) return l1;
    
    int sum = 0;
    ListNode dummy = new ListNode(0); //定义一个节点，值为0

    ListNode p1 = l1;
    ListNode p2 = l2;
    ListNode cur = dummy;

    while (p1 != null || p2 != null) {
        if (p1 != null) {
            sum += p1.val;
            p1 = p1.next;
        }
        if (p2 != null) {
            sum += p2.val;
            p2 = p2.next;
        }
        cur.next = new ListNode(sum % 10);
        sum /= 10;
        cur = cur.next;
    }
    if (sum == 1) {
        cur.next = new ListNode(1);
    }
    return dummy.next;
}
```

