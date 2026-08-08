class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int size = m+n;
        int newarr[] = new int[size];
        for(int i=0;i<m;i++){
            newarr[i] = nums1[i];
        }
        for(int i=0;i<n;i++){
            newarr[m+i] = nums2[i];
        }
        int low = 0;
        int high = size-1;
        int mid = m-1;
        int left = low;
        int right = mid+1;
        int temp[] = new int[high-low+1];
        int k=0;
        while(left<=mid && right<=high){
            if(newarr[left]<=newarr[right]){
                temp[k] = newarr[left];
                k++;
                left++;
            }
            else{
                temp[k] = newarr[right];
                k++;
                right++;
            }
        }

        while(left<=mid){
            temp[k] = newarr[left];
            k++;
            left++;
        }

        while(right<=high){
            temp[k] = newarr[right];
            k++;
            right++;
        }

        for(int i=0;i<size;i++){
            nums1[i] = temp[i];
        }
    }
}