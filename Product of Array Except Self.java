class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left = 1;
        int right = 1;
        int[] answer = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            answer[i] = left;
            left *= nums[i];
        }

        for(int i=nums.length-1; i>=0; i--) {
            answer[i] *= right;
            right *= nums[i];
        }

        return answer;
    }
}
