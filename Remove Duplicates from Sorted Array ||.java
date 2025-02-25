class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        int count = 1;
        int compareTarget = nums[0];

        for(int i=1; i<nums.length; i++) {
            if(nums[i] == compareTarget) {
                count+=1;
                if(count <= 2) {
                    nums[index] = nums[i];
                    index+=1;
                }
            } else {
                count = 1;
                compareTarget = nums[i];
                nums[index] = nums[i];
                index+=1;
            }
        }

        return index;
    }
}
