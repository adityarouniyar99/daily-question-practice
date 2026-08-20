class Solution {
    public int[] twoSum(int[] nums, int target) {
        TreeMap<Integer,Integer> mpp = new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            int more = target - a;
            if(mpp.containsKey(more)){
                return new int[]{mpp.get(more),i};
            }
            mpp.put(a,i);
        }
        return new int[]{0,0};
    }
}