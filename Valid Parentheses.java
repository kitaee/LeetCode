import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            Character target = s.charAt(i);
            if(target=='(' || target=='{' || target=='[') {
                stack.push(target);
            } else {
                if(stack.isEmpty() || !isValid(target, stack.peek())) {
                    return false;
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()) {
            return false;
        }
        return true;
    }

    static boolean isValid(Character target, Character stackPeek) {
        if(stackPeek == '(' && target == ')') {
            return true;
        }
        if(stackPeek == '{' && target == '}') {
            return true;
        }
        if(stackPeek == '[' && target == ']') {
            return true;
        }
        return false;
    }
}
