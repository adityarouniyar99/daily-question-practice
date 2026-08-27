class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        
        int mini = nums[0];
        int profit = 0;
        for(int i=1;i<n;i++){
            if(nums[i]>mini){
                profit = Math.max(profit,nums[i]-mini);
            }else{
                mini = nums[i];
            }
        }
        if(profit>0){
            return profit;
        }
        return -1;
    }
}