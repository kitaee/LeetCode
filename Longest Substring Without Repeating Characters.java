import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int head = 0;
        int tail = 0;
        int answer = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        while(head < s.length()) {
            Character target = s.charAt(head);
            if(!map.containsKey(target)) {
                map.put(target, 1);
                answer = Math.max(answer, head-tail+1);
                head+=1;
            } else {
                while(map.containsKey(target)) {
                    map.remove(s.charAt(tail));
                    tail+=1;
                }
            }
        }

        return answer;
    }
}
