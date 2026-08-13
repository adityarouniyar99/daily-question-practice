class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        // ArrayList<Integer> arr = new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     if(nums[i]!=0){
        //         arr.add(nums[i]);
        //     }
        // }   
        // for(int i=0;i<arr.size();i++){
        //     nums[i] = arr.get(i);
        // }

        // for(int i=arr.size();i<n;i++){
        //     nums[i] = 0;
        // }

        int j=0;
        // for(int i=0;i<n;i++){
        //     if(nums[i]==0){
        //         j=i;
        //         break;
        //     }
        // }
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        
    }
}