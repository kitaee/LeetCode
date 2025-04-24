import java.util.*;

class Solution {

    static int[] visited;
    static int[] result;
    static List<List<Integer>> answer;

    public List<List<Integer>> permute(int[] nums) {
        visited = new int[nums.length];
        result = new int[nums.length];
        answer = new ArrayList<>();
        permutation(0, nums);
        return answer;
    }

    static void permutation(int depth, int[] nums) {
        if(depth == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for(int i=0; i<result.length; i++) {
                temp.add(result[i]);
            }
            answer.add(temp);
            return;
        }

        for(int i=0; i<nums.length; i++) {
            if(visited[i] == 0) {
                visited[i] = 1;
                result[depth] = nums[i];
                permutation(depth+1, nums);
                visited[i] = 0;
            }
        }
    }
}