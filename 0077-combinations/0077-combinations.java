import java.util.*;

class Solution {

    static int[] arr;
    static int[] result;
    static int[] visited;
    static List<List<Integer>> answer;

    public List<List<Integer>> combine(int n, int k) {
        arr = new int[n];
        result = new int[k];
        visited = new int[n];
        answer = new ArrayList<>();

        for(int i=0; i<n; i++) {
            arr[i] = i+1;
        }

        combination(0, 0);
        return answer;
    }

    static void combination(int depth, int start) {
        if(depth == result.length) {
            List<Integer> temp = new ArrayList<>();
            for(int i=0; i<result.length; i++) {
                temp.add(result[i]);
            }
            answer.add(temp);
            return;
        }

        for(int i=start; i<arr.length; i++) {
            if(visited[i] == 0) {
                visited[i] = 1;
                result[depth] = arr[i];
                combination(depth+1, i+1);
                visited[i] = 0;
            }
        }
    }
}