import java.util.*;

class Solution {

    static Map<Character, Integer> map = new HashMap<>();

    public int romanToInt(String s) {
        int answer = 0;
        setMap();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'I') {
                if(i!=s.length()-1 && s.charAt(i+1)=='V') {
                    answer += 4;
                    i+=1;
                } else if(i!=s.length()-1 && s.charAt(i+1)=='X') {
                    answer += 9;
                    i+=1;
                } else {
                    answer += map.get(s.charAt(i));
                }
            } else if(s.charAt(i) == 'X') {
                if(i!=s.length()-1 && s.charAt(i+1)=='L') {
                    answer += 40;
                    i+=1;
                } else if(i!=s.length()-1 && s.charAt(i+1)=='C') {
                    answer += 90;
                    i+=1;
                } else {
                    answer += map.get(s.charAt(i));
                }
            } else if(s.charAt(i) == 'C') {
                if(i!=s.length()-1 && s.charAt(i+1)=='D') {
                    answer += 400;
                    i+=1;
                } else if(i!=s.length()-1 && s.charAt(i+1)=='M') {
                    answer += 900;
                    i+=1;
                } else {
                    answer += map.get(s.charAt(i));
                }
            } else {
                answer += map.get(s.charAt(i));
            }
       }

       return answer;
    }

    static void setMap() {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }
}
