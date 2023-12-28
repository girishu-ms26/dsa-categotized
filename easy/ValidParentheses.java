package easy;

import java.util.Stack;
//https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {
    public static void main(String[]args) {
        String s = "()";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i ++) {
            if(s.charAt(i) == '(') {
                stack.push(')');
            }
            else if(s.charAt(i) == '{') {
                stack.push('}');
            }
            else if(s.charAt(i) == '[') {
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop() != s.charAt(i)) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
