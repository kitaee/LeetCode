class Solution {
    public String longestCommonPrefix(String[] strs) {
        String answer = "";
        for(int i=1; i<strs[0].length()+1; i++) {
            String prefix = strs[0].substring(0, i);
            for(int j=1; j<strs.length; j++) {
                String target = strs[j];
                if(!target.startsWith(prefix)) {
                    return answer;
                }
            }
            answer = prefix;
        }
        return answer;
    }
}
