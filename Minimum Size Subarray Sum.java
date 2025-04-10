class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int answer = Integer.MAX_VALUE;
        int head = 0;
        int tail = 0;
        int sum = 0;

        while(head <= nums.length) {
            if(sum < target) {
                if(head == nums.length) {
                    break;
                }
                sum += nums[head];
                head+=1;
            } else {
                answer = Math.min(answer, head-tail);
                sum -= nums[tail];
                tail+=1;
            }
        }

        return answer == Integer.MAX_VALUE ? 0 : answer;
    }
}
