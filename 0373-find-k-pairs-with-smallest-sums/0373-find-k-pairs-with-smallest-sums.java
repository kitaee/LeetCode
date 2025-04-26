import java.util.*;

class Solution {

    static class Node implements Comparable<Node> {
        int num1;
        int num2;
        int sum;
        int index;

        public Node(int num1, int num2, int sum, int index) {
            this.num1 = num1;
            this.num2 = num2;
            this.sum = sum;
            this.index = index;
        }

        @Override
        public int compareTo(Node node) {
            return this.sum - node.sum;
        }
    }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> answer = new ArrayList<>();
        Queue<Node> queue = new PriorityQueue<>();

        for(int i=0; i<nums2.length; i++) {
            queue.offer(new Node(nums1[0], nums2[i], nums1[0]+nums2[i], 0));
        }

        while(!queue.isEmpty() && k>0) {
            Node node = queue.poll();
            answer.add(Arrays.asList(node.num1, node.num2));

            if(node.index +1 < nums1.length) {
                queue.offer(new Node(nums1[node.index+1], node.num2, nums1[node.index+1]+node.num2, node.index+1));
            }

            k-=1;
        }

        return answer;
    }
}