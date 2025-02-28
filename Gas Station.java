class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int tempGas = 0;
        int answer = 0;

        for(int i=0; i<gas.length; i++) {
            int diff = gas[i]-cost[i];
            totalGas += diff;
            tempGas += diff;

            if(tempGas < 0) {
                tempGas = 0;
                answer = i+1;
            }
        }

        if(totalGas >= 0) {
            return answer;
        }
        return -1;
    }
}
