class Solution {
    public int subarraySum(int[] nums, int k) {

//BRUTE FORCE
        // int count = 0;
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         int sum = 0;
        //         for(int l=i;l<=j;l++){
        //             sum += nums[l];
        //         }
        //         if(sum==k){
        //             count++;
        //         }
        //     }
        // }

        // return count;

// BETTER
        // int n = nums.length;
        // int count = 0;

        // for (int i = 0; i < n; i++) {
        //     int sum = 0;
        //     for (int j = i; j < n; j++) {
        //         sum += nums[j];
        //         if (sum == k) {
        //             count++;
        //         }
        //     }
        // }
        // return count;

// OPTIMAL
        int n = nums.length;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        int preSum = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            preSum += nums[i];
            int remove = preSum - k;
            
            if (mpp.containsKey(remove)) {
                count += mpp.get(remove);
            }

            mpp.put(preSum,mpp.getOrDefault(preSum,0)+1);            
        }
        return count;
    }
}