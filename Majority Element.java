import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        int answer = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int tempCount = map.getOrDefault(nums[i],0)+1;
            if(tempCount >= count) {
                count = tempCount;
                answer = nums[i];
            }
            map.put(nums[i], tempCount);
        }
        
        return answer;
    }
}
