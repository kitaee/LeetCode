import java.util.*;

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            int[] word = new int[26];
            for(int i=0; i<str.length(); i++) {
                word[str.charAt(i)-'a']+=1;
            }
            String key = Arrays.toString(word);
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        for(String key : map.keySet()) {
            answer.add(map.get(key));
        }

        return answer;
    }
}
