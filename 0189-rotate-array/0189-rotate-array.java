class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k%len;
        int[] temp = Arrays.copyOf(nums, len-k);

        for(int i=0; i<k; i++) {
            nums[i] = nums[len-k+i];
        }

        for(int i=k; i<len; i++) {
            nums[i] = temp[i-k];
        }
    }
}