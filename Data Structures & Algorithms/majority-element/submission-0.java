class Solution {
    public int majorityElement(int[] nums) {
        int ele = 0;
        int res = 0;
        int cnt = 0;
        for(int i : nums){
            if(cnt == 0){
                res = i;
                
            }
            cnt += (i == res) ? 1 : -1;
        }
        return res;
    }
}