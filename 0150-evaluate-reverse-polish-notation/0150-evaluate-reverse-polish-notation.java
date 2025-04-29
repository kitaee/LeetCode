import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens) {
            if(isOperation(token)) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int result = operate(num1, num2, token);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    static int operate(int num1, int num2, String target) {
        if(target.equals("+")) {
            return num1 + num2;
        } else if(target.equals("-")) {
            return num1 - num2;
        } else if(target.equals("*")) {
            return num1 * num2;
        }
        return num1 / num2;
    }

    static boolean isOperation(String target) {
        if(target.equals("+") || target.equals("-") || target.equals("*") || target.equals("/")) {
            return true;
        }
        return false;
    }
}