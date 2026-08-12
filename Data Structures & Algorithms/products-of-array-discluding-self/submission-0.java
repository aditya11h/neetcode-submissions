class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] lCount = new int[n];
        lCount[0] = 1;
        for(int i = 1; i < n; i++){
            lCount[i] = lCount[i-1] * nums[i-1];
        }

        int[] res = new int[n];

        int rightProduct = 1;

        for (int i = n - 1; i >= 0; i--) {
            res[i] = lCount[i] * rightProduct;

            rightProduct *= nums[i];
        }

        return res;
    }
}  
