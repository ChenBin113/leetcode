# LeetCode 题解

## 目录

- [LeetCode 题解](#leetcode-题解)
  - [链表](#链表)
  - [栈、队列](#栈队列)
  - [堆](#堆)
  - [贪心算法](#贪心算法)
  - [递归、回溯、分治](#递归回溯分治)
  - [二叉树与图](#二叉树与图)
  - [二分查找与二叉查找/排序树](#二分查找与二叉查找排序树)
  - [哈希表与字符串](#哈希表与字符串)
  - [搜索](#搜索)
- [说明](#说明)
  - [项目说明](#项目说明)

## 链表

- 相关代码 [src/linkedlist](src/linkedlist)

| #    |                      | Title                                                        |
| ---- | -------------------- | ------------------------------------------------------------ |
| 002  |                      | [AddTwoNumbers](src/linkedlist/_002_AddTwoNumbers.java)      |
| 021  | 排序链表的合并       | [MergeTwoSortedLists](src/linkedlist/_021_MergeTwoSortedLists.java) |
| 023  | 排序链表的合并       | [MergekSortedLists](src/linkedlist/_023_MergekSortedLists.java) |
| 086  | 链表划分             | [PartitionList](src/linkedlist/_086_PartitionList.java)      |
| 092  | 链表逆序             | [ReverseLinkedListII](src/linkedlist/_092_ReverseLinkedListII.java) |
| 138  | 复杂的链表的深度拷贝 | [CopyListWithRandomPointer](src/linkedlist/_138_CopyListWithRandomPointer.java) |
| 141  | 链表求环             | [LinkedListCycle](src/linkedlist/_141_LinkedListCycle.java)  |
| 142  | 链表求环             | [LinkedListCycleII](src/linkedlist/_142_LinkedListCycleII.java) |
| 160  | 求两个链表交点       | [GetIntersectionNode](src/linkedlist/_160_GetIntersectionNode.java) |
| 206  | 链表逆序             | [ReverseLinkedList](src/binarysearch/_206_ReverseLinkedList.java) |

## 栈、队列

- 相关代码 [src/stack](src/stack)

| #    |                   | Title                                                        |
| ---- | ----------------- | ------------------------------------------------------------ |
| 020  |                   | [ValidParentheses](stack/_020_ValidParentheses.java)         |
| 094  |                   | [BinaryTreeeInorderTraversal](src/stack/_094_BinaryTreeeInorderTraversal.java) |
| 155  | 包含 min 函数的栈 | [MinStack](src/stack/_155_MinStack.java)                     |
| 224  | 简单的计算器      | [BasicCalculator](src/stack/_224_BasicCalculator.java)       |
| 225  | 使用队列实现栈    | [ImplementStackusingQueues](src/stack/_225_ImplementStackusingQueues.java) |
| 232  | 使用栈实现队列    | [ImplementQueueusingStacks](src/stack/_232_ImplementQueueusingStacks.java) |
| 946  | 合法的出栈序列    | [ValidateStackSequences](src/stack/_946_ValidateStackSequences.java) |

## 堆

- 相关代码 [src/heap](src/heap)

| #    |                   | Title                                                        |
| ---- | ----------------- | ------------------------------------------------------------ |
| 215  | 数组中第 k 大的数 | [KthLargestElementinanArray](src/heap/_215_KthLargestElementinanArray.java) |
| 295  | 寻找中位数        | [FindMedianfromDataStream](src/heap/_295_FindMedianfromDataStream.java) |

## 贪心算法

- 相关代码 [src/greedy](src/greedy)

| #    |               | Title                                                        |
| ---- | ------------- | ------------------------------------------------------------ |
| 045  | 跳跃游戏      | [JumpGameII](src/greedy/_045JumpGameII.java) |
| 055  | 跳跃游戏      | [JumpGame](src/greedy/_055_JumpGame.java) |
| 376  | 摇摆序列      | [WiggleSubsequence](src/greedy/_376_WiggleSubsequence.java) |
| 402  | 移除 k 个数字 | [RemoveKDigits](src/greedy/_402_RemoveKDigits) |
| 452  | 射击气球      | [MinimumNumberofArrowstoBurstBalloons](src/greedy/_452_MinimumNumberofArrowstoBurstBalloons.java) |
| 455  | 分糖果        | [AssignCookies](src/greedy/_455_AssignCookies.java) |

## 递归、回溯、分治

- 相关代码 [src/backtracking](src/backtracking)

| #    |          | Title                                                        |
| ---- | -------- | ------------------------------------------------------------ |
| 022  | 生成括号 | [GenerateParentheses](src/backtracking/_022_GenerateParentheses.java) |
| 040  | 求组合   | [CombinationSumII](src/backtracking/_040_CombinationSumII.java) |
| 051  | N 皇后   | [NQueens](src/backtracking/_051_NQueens.java)                |
| 078  | 求子集   | [Subsets](src/backtracking/_078_Subsets.java)                |
| 090  | 求子集   | [SubsetsII](src/backtracking/_090_SubsetsII.java)            |
| 315  | 逆序数   | [CountofSmallerNumbersAfterSelf](src/backtracking/_315_CountofSmallerNumbersAfterSelf.java) |

## 二叉树与图

| #    |                | Title |
| ---- | -------------- | ----- |
| 113  | 路径之和       |       |
| 114  | 二叉树转链表   |       |
| 199  | 侧面观察二叉树 |       |
| 207  | 课程安排       |       |
| 236  | 最近公共祖先   |       |

## 二分查找与二叉查找/排序树

- 相关代码 [src/binarysearch](src/binarysearch)

| #    |                      | Title                                                        |
| ---- | -------------------- | ------------------------------------------------------------ |
| 033  | 旋转数组查找         | [SearchinRotatedSortedArray](src/binarysearch/_033_SearchinRotatedSortedArray.java) |
| 034  | 区间查找             | [FindFirstandLastPositionofElementinSortedArray](src/binarysearch/_034_FindFirstandLastPositionofElementinSortedArray.java) |
| 035  | 插入位置             | [SearchInsertPosition](src/binarysearch/_035_SearchInsertPosition.java) |
| 315  | 逆序数               | [CountofSmallerNumbersAfterSelf](src/backtracking/_315_CountofSmallerNumbersAfterSelf.java) |
| 449  | 二叉查找树编码与解码 | [SerializeandDeserializeBST](src/backtracking/_449_SerializeandDeserializeBST.java) |

## 哈希表与字符串

- 相关代码 [src/hashtable](src/hashtable)

| #    |                      | Title                                                        | TAG      |
| --- | -------------------- | ------------------------------------------------------------ | -------- |
| 003  | 无重复字符的最长子串 | [LongestSubstringWithoutRepeatingCharacters](src/hashtable/_003_LongestSubstringWithoutRepeatingCharacters.java) | 双指针   |
| 049  | 同字符词语分组       | [GroupAnagrams](src/hashtable/_049_GroupAnagrams.java)       |          |
| 076  | 最小覆盖子串         | [MinimumWindowSubstring](src/hashtable/_076_MinimumWindowSubstring.java) | 双指针   |
| 187  | 重复的 DNA 序列      | [RepeatedDNASequences](src/hashtable/_187_RepeatedDNASequences.java) | 滑动窗口 |
| 290  | 词语模式             | [WordPattern](src/hashtable/_290_WordPattern.java)           |          |
| 409  | 最长回文串           | [LongestPalindrome](src/hashtable/_409_LongestPalindrome.java) |          |

## 搜索

- 相关代码 [src/search](src/search)

| #    |                      | Title                                                        | TAG      |
| --- | -------------------- | ------------------------------------------------------------ | -------- |
| 126 | 词语阶梯2 | [WordLadderII](src/search/_126_WordLadderII.java) | BFS |
| 127 | 词语阶梯 | [WordLadder](src/search/_127_WordLadder.java) | BFS |
| 200 | 岛屿数量 | [NumberofIslands](src/search/_200_NumberofIslands.java) | BFS/DFS |

## 动态规划

- 相关代码 [src/dp](src/dp)

| #    |                      | Title                                                        | TAG      |
| --- | -------------------- | ------------------------------------------------------------ | -------- |
| 005 |      | [LongestSubstringWithoutRepeatingCharacters](src/dp/_005_LongestSubstringWithoutRepeatingCharacters.java) |  |
| 053 |  | [MaximumSubarray](src/dp/_053_MaximumSubarray.java) |  |
| 070 |  | [ClimbingStairs](src/dp/_070_ClimbingStairs.java) |  |

# 说明

- 项目记录了一些解答  LeetCode 的 Java 代码，部分题目使用了 main 方法进行调试
- 对于 leetcode 包中的类，命名前添加了序号，方便查找，故不完全遵循 Java 中类命名方法
- 题目解答的部分思路是按照 [LeetCode 刷题](https://www.bilibili.com/video/av29912609) 视频来的

## 项目说明

```
.
└─src
    ├─array
    ├─backtracking
    ├─binarysearch
    ├─bitmanipulation
    ├─dp
    ├─easy
    ├─game  -- 包含 LeetCode 竞赛题目
    ├─greedy
    ├─hashtable
    ├─heap
    ├─linkedlist
    ├─search  -- BFS & DFS
    ├─sort
    ├─stack
    ├─testdemo  -- 测试类的使用方法
    ├─tree
    └─util  -- 包含一些需要使用的数据结构类
```

