class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> result = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            if(search(nums2,nums1[i])){
                result.add(nums1[i]);
            }
        }
        int res[] = result.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        return res;
    }

    public static boolean search(int[] arr,int target){
        for(int ele : arr){
            if(ele == target){
                return true;
            }
        }
            return false;
    }
}
