import java.util.*;

class Solution {

    static List<String> answer;

    public List<String> generateParenthesis(int n) {
        answer = new ArrayList<>();
        combination(n-1, n, "(");
        return answer;
    }

    static void combination(int openCount, int closeCount, String temp) {
        if(openCount == 0 && closeCount == 0) {
            answer.add(temp);
            return;
        }

        if(openCount > 0) {
            combination(openCount-1, closeCount, temp+"(");
        }
        if(closeCount > openCount) {
            combination(openCount, closeCount-1, temp+")");
        }
    }
}