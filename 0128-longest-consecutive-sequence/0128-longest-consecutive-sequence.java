import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }

        for(int num : set) {
            if(!set.contains(num-1)) {
                int length = 1;
                int targetNum = num+1;
                while(set.contains(targetNum)) {
                    length+=1;
                    targetNum+=1;
                }
                answer = Math.max(answer, length);
            }
        }

        return answer;
    }
}