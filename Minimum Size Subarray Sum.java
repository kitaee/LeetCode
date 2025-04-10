class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int answer = Integer.MAX_VALUE;
        int tail = 0;
        int head = 0;
        int sum = nums[0];
        
        while(head < nums.length-1) {
            if(sum >= target) {
                answer = Math.min(answer, head-tail+1);
                sum -= nums[tail];
                tail+=1;
            } else {
                head+=1;
                sum += nums[head];
            }
        }

        while(sum >= target) {
            answer = Math.min(answer, head-tail+1);
            sum -= nums[tail];
            tail+=1;
            if(sum >= target && tail <= head) {
                answer = Math.min(answer, head-tail+1);
            } else {
                break;
            }
        }
        
        if(answer == Integer.MAX_VALUE) {
            return 0;
        }
        return answer;
    }
}
