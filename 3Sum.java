import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int[] temp;
        Map<String, Integer> map = new HashMap<>();
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-2; i++) {
            int left = i+1;
            int right = nums.length-1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    temp = new int[]{nums[i],nums[left],nums[right]};
                    String key = Arrays.toString(temp);
                    if(!map.containsKey(key)) {
                        answer.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        map.put(key, 1);
                    }
                    left+=1;
                    right-=1;
                } else if(sum < 0) {
                    left+=1;
                } else {
                    right-=1;
                }
            }
        }
        return answer;
    }
}
