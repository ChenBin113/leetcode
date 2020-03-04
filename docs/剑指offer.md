

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

# 







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

# 





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

# 





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

# 







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

# 







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

# 





