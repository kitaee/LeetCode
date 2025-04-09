class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] splitInfo = s.trim().split(" ");
        for(int i=splitInfo.length-1; i>=0; i--) {
            if(splitInfo[i].length() != 0) {
                sb.append(splitInfo[i]);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}
