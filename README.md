# 目录

<!-- MarkdownTOC levels="1,2" autolink="true" -->

- [LeetCode 题解](#leetcode-%E9%A2%98%E8%A7%A3)
	- [链表](#%E9%93%BE%E8%A1%A8)
	- [数组](#%E6%95%B0%E7%BB%84)
	- [栈-队列](#%E6%A0%88-%E9%98%9F%E5%88%97)
	- [堆](#%E5%A0%86)
	- [贪心算法](#%E8%B4%AA%E5%BF%83%E7%AE%97%E6%B3%95)
	- [递归-回溯-分治](#%E9%80%92%E5%BD%92-%E5%9B%9E%E6%BA%AF-%E5%88%86%E6%B2%BB)
	- [二叉树与图](#%E4%BA%8C%E5%8F%89%E6%A0%91%E4%B8%8E%E5%9B%BE)
	- [二分查找与二叉查找/排序树](#%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE%E4%B8%8E%E4%BA%8C%E5%8F%89%E6%9F%A5%E6%89%BE%E6%8E%92%E5%BA%8F%E6%A0%91)
	- [哈希表与字符串](#%E5%93%88%E5%B8%8C%E8%A1%A8%E4%B8%8E%E5%AD%97%E7%AC%A6%E4%B8%B2)
	- [搜索](#%E6%90%9C%E7%B4%A2)
	- [动态规划](#%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92)
- [说明](#%E8%AF%B4%E6%98%8E)
	- [项目说明](#%E9%A1%B9%E7%9B%AE%E8%AF%B4%E6%98%8E)

<!-- /MarkdownTOC -->

# LeetCode 题解

## 链表

- 相关代码 [src/_01_datastruct.linkedlist](src/_01_datastruct/linkedlist)

| #    |      |                      | Title                                                        |                            |
| ---- | ---- | -------------------- | ------------------------------------------------------------ | -------------------------- |
| 002  | ★★☆  |                      | [AddTwoNumbers](src/_01_datastruct/linkedlist/_002_AddTwoNumbers.java)      |                            |
| 019  | ★★☆  |                      | [RemoveNthNodeFromEndofList](src/_01_datastruct/linkedlist/_019_RemoveNthNodeFromEndofList.java) | 双指针                     |
| 021  |      | 排序链表的合并       | [MergeTwoSortedLists](src/_01_datastruct/linkedlist/_021_MergeTwoSortedLists.java) |                            |
| 023  |      | 排序链表的合并       | [MergekSortedLists](src/_01_datastruct/linkedlist/_023_MergekSortedLists.java) |                            |
| 024  | ★★☆  | 两两交换链表中的节点 | [SwapNodesinPairs](src/_01_datastruct/_02_linkedlist/_024_SwapNodesinPairs.java) | 递归                       |
| 086  |      | 链表划分             | [PartitionList](src/_01_datastruct/linkedlist/_086_PartitionList.java)      |                            |
| 092  | ★★☆  | 链表逆序             | [ReverseLinkedListII](src/_01_datastruct/linkedlist/_092_ReverseLinkedListII.java) |                            |
| 138  |      | 复杂的链表的深度拷贝 | [CopyListWithRandomPointer](src/_01_datastruct/linkedlist/_138_CopyListWithRandomPointer.java) |                            |
| 141  |      | 链表求环             | [LinkedListCycle](src/_01_datastruct/linkedlist/_141_LinkedListCycle.java)  |                            |
| 142  |      | 链表求环             | [LinkedListCycleII](src/_01_datastruct/linkedlist/_142_LinkedListCycleII.java) |                            |
| 160  | ★☆☆  | 求两个链表交点       | [GetIntersectionNode](src/_01_datastruct/_02_linkedlist/_160_GetIntersectionNode.java) |                            |
| 206  | ★☆☆  | 链表逆序             | [ReverseLinkedList](src/_01_datastruct/linkedlist/_206_ReverseLinkedList.java) | 就地逆置法；头插法；递归法 |
| 876  |      |                      | [MiddleoftheLinkedList](src/_01_datastruct/linkedlist/_876_MiddleoftheLinkedList.java) |                            |

## 数组

- 相关代码 [src/_01_datastruct.array](src/_01_datastruct/array)

| #    |      |          | Title                                                        |      |
| ---- | ---- | -------- | ------------------------------------------------------------ | ---- |
| 001  |      |          | [TwoSum](src/_01_datastruct/_01_array/_001_TwoSum.java)                         |      |
| 026  |      |          | [RemoveDuplicatesfromSortedArray](src/_01_datastruct/_01_array/_026_RemoveDuplicatesfromSortedArray.java) |      |
| 027  |      |          | [RemoveElement](src/_01_datastruct/array/_027_RemoveElement.java)           |      |
| 031  |      |          | [NextPermutation](src/_01_datastruct/array/_031_NextPermutation.java)       |      |
| 035  |      |          | [SearchInsertPosition](src/_01_datastruct/_01_array/_035_SearchInsertPosition.java) |      |
| 054  | ★★☆  | 螺旋数组 | [SpiralMatrix](src/_01_datastruct/_01_array/_054_SpiralMatrix.java)             |      |
| 088  |      |          | [MergeSortedArray](src/_01_datastruct/_01_array/_088_MergeSortedArray.java)     |      |
| 283  |      |          | [MoveZeroes](src/_01_datastruct/_01_array/_283_MoveZeroes.java)                 |      |
| 867  | ★☆☆  |          | [TransposeMatrix](src/_01_datastruct/array/_867_TransposeMatrix.java)       |      |




## 栈-队列

- 相关代码 [src/_01_datastruct.stack](src/_01_datastruct/stack)

| #    |                   | Title                                                        |
| ---- | ----------------- | ------------------------------------------------------------ |
| 020  |                   | [ValidParentheses](stack/_020_ValidParentheses.java)         |
| 071  |                   | [SimplifyPath](src/_01_datastruct/stack/_071_SimplifyPath.java)             |
| 094  |                   | [BinaryTreeeInorderTraversal](src/_01_datastruct/_03_stack/_094_BinaryTreeeInorderTraversal.java) |
| 155  | 包含 min 函数的栈 | [MinStack](src/_01_datastruct/_03_stack/_155_MinStack.java)                     |
| 224  | 简单的计算器      | [BasicCalculator](src/_01_datastruct/stack/_224_BasicCalculator.java)       |
| 225  | 使用队列实现栈    | [ImplementStackusingQueues](src/_01_datastruct/stack/_225_ImplementStackusingQueues.java) |
| 232  | 使用栈实现队列    | [ImplementQueueusingStacks](src/_01_datastruct/_03_stack/_232_ImplementQueueusingStacks.java) |
| 946  | 合法的出栈序列    | [ValidateStackSequences](src/_01_datastruct/_03_stack/_946_ValidateStackSequences.java) |

## 堆

- 相关代码 [src/_01_datastruct.heap](src/_01_datastruct/heap)

| #    |      |                   | Title                                                        |      |
| ---- | ---- | ----------------- | ------------------------------------------------------------ | ---- |
| 215  |      | 数组中第 k 大的数 | [KthLargestElementinanArray](src/_01_datastruct/heap/_215_KthLargestElementinanArray.java) |      |
| 264  |      |                   | [UglyNumberII](src/_01_datastruct/heap/_264_UglyNumberII.java)              |      |
| 295  | ★★★  | 寻找中位数        | [FindMedianfromDataStream](src/_01_datastruct/heap/_295_FindMedianfromDataStream.java) |      |

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

## 递归-回溯-分治

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

- 相关代码 [src/_01_datastruct.hashtable](src/_01_datastruct/hashtable)

| #    |                      | Title                                                        | TAG      |
| --- | -------------------- | ------------------------------------------------------------ | -------- |
| 003  | 无重复字符的最长子串 | [LongestSubstringWithoutRepeatingCharacters](src/_01_datastruct/hashtable/_003_LongestSubstringWithoutRepeatingCharacters.java) | 双指针   |
| 049  | 同字符词语分组       | [GroupAnagrams](src/_01_datastruct/hashtable/_049_GroupAnagrams.java)       |          |
| 076  | 最小覆盖子串         | [MinimumWindowSubstring](src/_01_datastruct/hashtable/_076_MinimumWindowSubstring.java) | 双指针   |
| 187  | 重复的 DNA 序列      | [RepeatedDNASequences](src/_01_datastruct/hashtable/_187_RepeatedDNASequences.java) | 滑动窗口 |
| 290  | 词语模式             | [WordPattern](src/_01_datastruct/hashtable/_290_WordPattern.java)           |          |
| 409  | 最长回文串           | [LongestPalindrome](src/_01_datastruct/hashtable/_409_LongestPalindrome.java) |          |

## 搜索

- 相关代码 [src/search](src/search)

| #    |                      | Title                                                        | TAG      |
| --- | -------------------- | ------------------------------------------------------------ | -------- |
| 126 | 词语阶梯2 | [WordLadderII](src/search/_126_WordLadderII.java) | BFS |
| 127 | 词语阶梯 | [WordLadder](src/search/_127_WordLadder.java) | BFS |
| 200 | 岛屿数量 | [NumberofIslands](src/search/_200_NumberofIslands.java) | BFS/DFS |

## 动态规划

- 相关代码 [src/_02_algorithm.dp](src/_02_algorithm/dp)

| #    |                      | Title                                                        | TAG      |
| --- | -------------------- | ------------------------------------------------------------ | -------- |
| 005 |      | [LongestSubstringWithoutRepeatingCharacters](src/_02_algorithm/dp/_005_LongestSubstringWithoutRepeatingCharacters.java) |  |
| 053 |  | [MaximumSubarray](src/_02_algorithm/dp/_053_MaximumSubarray.java) |  |
| 070 |  | [ClimbingStairs](src/_02_algorithm/dp/_070_ClimbingStairs.java) |  |

# 说明

- 项目记录了一些解答  LeetCode 的 Java 代码，部分题目使用了 main 方法进行调试
- 对于 leetcode 包中的类，命名前添加了序号，方便查找，故不完全遵循 Java 中类命名方法
- 题目解答的部分思路是按照 [LeetCode 刷题](https://www.bilibili.com/video/av29912609) 视频来的

## 项目说明

```
.
└─src
    ├─_01_datastruct.array
    ├─backtracking
    ├─binarysearch
    ├─bitmanipulation
    ├─_02_algorithm.dp
    ├─easy
    ├─game  -- 包含 LeetCode 竞赛题目
    ├─greedy
    ├─_01_datastruct.hashtable
    ├─_01_datastruct.heap
    ├─_01_datastruct.linkedlist
    ├─search  -- BFS & DFS
    ├─sort
    ├─_01_datastruct.stack
    ├─testdemo  -- 测试类的使用方法
    ├─_01_datastruct._04_tree
    └─util  -- 包含一些需要使用的数据结构类
```

