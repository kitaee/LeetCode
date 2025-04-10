import java.util.*;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<magazine.length(); i++) {
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i),0)+1);
        }

        for(int i=0; i<ransomNote.length(); i++) {
            Character target = ransomNote.charAt(i);
            if(map.containsKey(target)) {
                if(map.get(target) == 1) {
                    map.remove(target);
                } else {
                    map.put(target, map.get(target)-1);
                }
            } else {
                return false;
            }
        }

        return true;
    }
}
