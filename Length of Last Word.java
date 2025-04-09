class Solution {
    public int lengthOfLastWord(String s) {
        int answer = 0;
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') {
                if(count > 0) {
                    answer = count;
                }
                count = 0;
            } else {
                count+=1;
            }
        }
        if(count > 0) {
            answer = count;
        }
        return answer;
    }
}
