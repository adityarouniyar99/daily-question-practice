class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        Map<Integer,Integer> mpp = new HashMap<>();
        for(int ele : nums){
            mpp.put(ele,mpp.getOrDefault(ele,0)+1);
        }

        for(Map.Entry<Integer,Integer> ent : mpp.entrySet()){
            if(ent.getValue() > 1){
                result.add(ent.getKey());
            }
        }
        return result;
    }
}