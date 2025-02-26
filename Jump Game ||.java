import java.util.*;

class Solution {

    static class Node {
        int index;
        int count;

        public Node(int index, int count) {
            this.index = index;
            this.count = count;
        }
    }

    static boolean[] visited;
    static Queue<Node> queue = new LinkedList<>();

    public int jump(int[] nums) {
        visited = new boolean[nums.length];
        visited[0] = true;
        queue.offer(new Node(0, 0));
        
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            if(node.index == nums.length-1) {
                return node.count;
            }

            for(int i=1; i<=nums[node.index]; i++) {
                if(node.index+i<nums.length && !visited[node.index+i]) {
                    visited[node.index+i] = true;
                    queue.offer(new Node(node.index+i, node.count+1));
                }
            }
        }

        return -1;
    }
}
