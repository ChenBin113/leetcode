

# 03.数组中重复的数字

## 一

```java
public class Solution {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (numbers == null || numbers.length == 0) {
			return false;
		}
		for (int i = 0; i  numbers.length; i++) {
			int tmp = numbers[i];
			if (tmp == i) {
				continue;
			} else {
				if (tmp == numbers[tmp]) {
                    duplication[0] = tmp;
					return true;
				} else {
					swap(tmp, numbers[tmp], numbers);
					continue;
				}
			}
		}
		return false;
    
    }
    
    public void swap(int i, int j, int[] numbers) {
		int tmp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = tmp;
	}
}
```

## 二

```java
public class Solution {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (numbers == null || numbers.length == 0) {
			return false;
		}
		for (int i = 0; i < numbers.length; i++) {
            while (i != numbers[i]) {
                if (numbers[numbers[i]] == numbers[i]) {
                    duplication[0] = numbers[i];
                    return true;
                }
                swap(i, numbers[i], numbers);
            }
		}
		return false;
    
    }
    
    public void swap(int i, int j, int[] numbers) {
		int tmp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = tmp;
	}
}
```



# 04. 二维数组中的查找

## 一

```java
public class Solution {
    public boolean Find(int target, int [][] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        int row_index = array.length - 1;
        int col_index = array[0].length - 1;
        int col_start_index = 0;
        
        while (row_index >= 0 && col_start_index <= col_index) {
            if (array[row_index][col_start_index] == target) {
                return true;
            } else if (array[row_index][col_start_index] > target) {
                row_index--;
            } else {
                col_start_index++;
            }
        }
        return false;
    }
}
```

## 二

```java
public class Solution {
    public boolean Find(int target, int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int rows = matrix.length, cols = matrix[0].length;
        int r = 0, c = cols - 1; // 从右上角开始
        while (r <= rows - 1 && c >= 0) {
            if (target == matrix[r][c])
                return true;
            else if (target > matrix[r][c])
                r++;
            else
                c--;
        }
        return false;
    }
}
```



# 05. 替换空格

## 一

```java
public class Solution {
    public static String replaceSpace(StringBuffer str) {
        return str.toString().replace(" ", "%20");
    }
}
```

## 二

```java
public class Solution {
    public static String replaceSpace(StringBuffer str) {
        StringBuffer sb = new StringBuffer();
        String s = str.toString();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
```

## 三

```java
public class Solution {
    public static String replaceSpace(StringBuffer str) {
        int p1 = str.length() - 1;
        for (int i = 0; i <= p1; i++) {
            if (str.charAt(i) == ' ') {
                str.append("  ");
            }
        }
        int p2 = str.length() - 1;
        while (p1 >= 0 && p1 < p2) {
            char c = str.charAt(p1--);
            if (c == ' ') {
                str.setCharAt(p2--, '0');
                str.setCharAt(p2--, '2');
                str.setCharAt(p2--, '%');
            } else {
                str.setCharAt(p2--, c);
            }
        }
        return str.toString();
    }
}
```



# 06. 从尾到头打印链表

## 一

```java
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode != null) {
            ret.addAll(printListFromTailToHead(listNode.next));
            ret.add(listNode.val);
        }
        return ret;
    }

```

## 二

```java
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode head  = new ListNode(0);
        while (listNode != null) {
            ListNode memo = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = memo;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        while (head.next != null) {
            ret.add(head.next.val);
            head = head.next;
        }
        return ret;
    }
}
```

## 三

```java
import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        while (!stack.isEmpty()) {
            ret.add(stack.pop());
        }
        return ret;
    }
}
```



# 07. 重建二叉树

## 一

```java
import java.util.Arrays;
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre.length == 0 || in.length == 0) return null;
        TreeNode root = new TreeNode(pre[0]);
        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]) {
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i + 1), Arrays.copyOfRange(in, 0, i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length), Arrays.copyOfRange(in, i+1, in.length));
                break;
            }
        }
        return root;
    }
}
```



# 08. 二叉树的下一个结点

## 一

```java
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if (pNode.right != null) {
            pNode = pNode.right;
            while(pNode.left != null) {
                pNode = pNode.left;
            }
            return pNode;
        }
        if (pNode.next != null && pNode.next.left == pNode) {
            return pNode.next;
        }
        if (pNode.next != null && pNode.next.right == pNode) {
            while (pNode.next != null && pNode.next.right == pNode) {
                pNode = pNode.next;
            }
            return pNode.next;
        }
        return null;
    }
}
```

## 二

```java
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {   
        //有右子树
        if (pNode.right != null) {
            TreeLinkNode node = pNode.right;
            while (node.left != null) {
                node = node.left;
            }
            return node;
        } else {
            while (pNode.next != null) {
                TreeLinkNode parent = pNode.next;
                if (parent.left == pNode) {
                    return parent;
                }
                pNode = pNode.next;
            }
        }
        return null;
    }
}
```



# 09. 用两个栈实现队列

## 一

```java
import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
        }
        return stack2.pop();
    }    
}
```



# 10.1 斐波那契数列

## 一

```java
public class Solution {
    public int Fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
```

## 二

```java
public class Solution {
    public int Fibonacci(int n) {
        if (n <= 1) return n;
        int[] fib = new int[n + 1];
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }
}
```

## 三

```java
public class Solution {
    public int Fibonacci(int n) {
        if (n <= 1) return n;
        int pre1 = 1, pre2 = 0;
        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = pre1 + pre2;
            pre2 = pre1;
            pre1 = fib;
        }
        return fib;
    }
}
```



# 10.2 矩形覆盖

## 一

```java

```

## 二

```java

```



# 10.3 跳台阶

## 一

```java

```

## 二

```java

```



# 10.4 变态跳台阶

## 一

```java
2
```

## 二

```java

```









# 1

## 一

```java

```

## 二

```java

```









# 1

## 一

```java

```

## 二

```java

```









# 1

## 一

```java

```

## 二

```java

```









# 1

## 一

```java

```

## 二

```java

```









# 1

## 一

```java

```

## 二

```java

```









# 1

## 一

```java

```

## 二

```java

```









# 1

## 一

```java

```

## 二

```java

```









# 1

## 一

```java

```

## 二

```java

```









# 1

## 一

```java

```

## 二

```java

```









# 1

## 一

```java

```

## 二

```java

```









# 1

## 一

```java

```

## 二

```java

```









# 1

## 一

```java

```

## 二

```java

```









# 1

## 一

```java

```

## 二

```java

```









# 1

## 一

```java

```

## 二

```java

```









# 1

## 一

```java

```

## 二

```java

```









# 1

## 一

```java

```

## 二

```java

```









# 1

## 一

```java

```

## 二

```java

```









# 1

## 一

```java

```

## 二

```java

```









# 1

## 一

```java

```

## 二

```java

```













