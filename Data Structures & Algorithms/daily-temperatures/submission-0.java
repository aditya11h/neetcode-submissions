class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;

        int[] result = new int[n];

        for(int i = 0; i < n; i++){
            int cnt = 0;
            int ele = temperatures[i];
            for(int j = i+1; j < n; j++){
                cnt++;
                if(temperatures[j] > ele){
                    result[i] = cnt;
                    break;
                }
            }
        }
        return result;
    }
}
