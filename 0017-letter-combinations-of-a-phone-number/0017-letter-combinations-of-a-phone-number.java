import java.util.*;

class Solution {

    public List<String> letterCombinations(String digits) {
        List<String> answer = new ArrayList<>();
        Map<Integer, String[]> map = setDigits();
        if(digits.length() == 0) {
            return answer;
        }
        combination(0, "", answer, map, digits);
        return answer;
    }

    static void combination(int depth, String temp, List<String> answer, Map<Integer, String[]> map, String digits) {
        if(depth == digits.length()) {
            answer.add(temp.toString());
            return;
        }

        int digit = Character.getNumericValue(digits.charAt(depth));
        String[] targetDigits = map.get(digit);
        for(int i=0; i<targetDigits.length; i++) {
            combination(depth+1, temp + targetDigits[i], answer, map, digits);
        }
    }

    static Map<Integer, String[]> setDigits() {
        Map<Integer, String[]> map = new HashMap<>();
        map.put(2, new String[]{"a","b","c"});
        map.put(3, new String[]{"d","e","f"});
        map.put(4, new String[]{"g","h","i"});
        map.put(5, new String[]{"j","k","l"});
        map.put(6, new String[]{"m","n","o"});
        map.put(7, new String[]{"p","q","r", "s"});
        map.put(8, new String[]{"t","u","v"});
        map.put(9, new String[]{"w","x","y", "z"});
        return map;
    }
}