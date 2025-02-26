class Solution {
    public void rotate(int[] nums, int k) {
        int[] tempNums = nums.clone();
        for(int i=0; i<nums.length; i++) {
            int swapIndex = (i+k)%nums.length;
            nums[swapIndex] = tempNums[i];
        }
    }
}
