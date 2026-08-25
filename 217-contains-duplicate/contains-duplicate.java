class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;

        HashMap<Integer,Integer> mpp = new HashMap<>();

        for(int i=0;i<n;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }

        for(int key : mpp.keySet()){
            if(mpp.get(key)>1){
                return true;
            }
        }
        return false;
    }
}