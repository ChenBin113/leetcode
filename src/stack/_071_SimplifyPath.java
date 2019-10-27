package stack;

import java.util.Stack;

public class _071_SimplifyPath {
    /*
    1.定义一个辅助栈
    2.将字符串分割成为数组，数组有四种可能："", "path", ".", ".."
    3.遍历数组
        如果字符为 ".." 且栈不空，则 pop 一个元素
        如果字符为 "paht"，则 push 一个元素
    4.栈空，返回 /；栈不空，由底部开始遍历栈，使用 StringBuffer 拼接字符串
     */
    public String simplifyPath(String path) {
        if (path == null || path.length() == 0) return "/";
        String[] strings = path.split("/");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < strings.length; i++) {
            //if (strings[i].equals("..") && !stack.isEmpty()) stack.pop();
            //if (!strings[i].equals("..") && !strings[i].equals(".") && !strings[i].equals("")) stack.push(strings[i]);
            switch (strings[i]) {
                case "..":
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    break;
                case ".":
                case "":
                    break;
                default:
                    stack.push(strings[i]);
            }
        }
        if (stack.isEmpty()) return "/";
        else {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < stack.size(); i++) {
                sb.append("/");
                sb.append(stack.get(i));
            }
            return sb.toString();
        }
    }
}
