class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                // int sum = 0;
                // for(int l=i;l<j;l++){
                //     sum += nums[l];
                // }
                sum += nums[j];
                if(sum==k){
                    count++;
                }
            }
        }

        return count;

    }
}