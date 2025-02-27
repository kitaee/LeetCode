import java.util.*;

class Solution {
    public int hIndex(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for(int i=1; i<=citations[citations.length-1]; i++) {
            int count = 0;
            for(int j=citations.length-1; j>=0; j--) {
                if(citations[j] >= i) {
                    count+=1;
                } else {
                    break;
                }
            }

            if(count >= i) {
                answer = i;
            } else {
                break;
            }
        }

        return answer;
    }
}
