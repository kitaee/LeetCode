import java.util.*;

class Solution {

    static boolean[] visited;
    static Queue<Integer> queue = new LinkedList<>();

    public boolean canJump(int[] nums) {
        visited = new boolean[nums.length];
        queue.offer(0);
        visited[0] = true;

        while(!queue.isEmpty()) {
            int index = queue.poll();
            if(index == nums.length-1) {
                return true;
            }

            for(int i=1; i<=nums[index]; i++) {
                int jumpIndex = index+i;
                if(jumpIndex<nums.length && !visited[jumpIndex]) {
                    visited[jumpIndex] = true;
                    queue.offer(jumpIndex);
                }
            }
        }

        return false;
    }
}
