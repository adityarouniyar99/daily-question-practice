class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        
        int mini = nums[0];
        int profit = 0;
        for(int i=1;i<n;i++){
            int cost = nums[i] - mini;
            profit = Math.max(profit,cost);
            mini = Math.min(mini,nums[i]);
        }
        if(profit>0){
            return profit;
        }
        return -1;
    }
}