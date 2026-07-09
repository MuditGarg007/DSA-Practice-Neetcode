class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];

        res[0] = nums[0];
        for(int i=1; i<n; i++) {
            res[i] = nums[i]*res[i-1];
        }
        
        res[n-1] = res[n-2];

        int postfix = nums[n-1];
        for(int i=n-2; i>=1; i--) {
            res[i] = postfix*res[i-1];
            postfix= postfix*nums[i];
        }
        res[0] = postfix;
        return res;
    }
}  
