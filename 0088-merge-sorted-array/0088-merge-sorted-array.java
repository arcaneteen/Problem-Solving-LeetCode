class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1=nums1.length-n;
        int k=n1;
        for(int i=0;i<nums2.length;i++){
           nums1[k++]=nums2[i];
        }
        Arrays.sort(nums1);
    }
    int count(int[] nums){
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0) c++;
        }
        return c;
    }
}