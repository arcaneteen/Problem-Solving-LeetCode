class Solution {
    public static int leftmost(int nums[],int target){
        int l=0;
        int r =nums.length-1;
        while(l<=r){
            int mid =l+(r-l)/2;
            if(nums[mid]>=target){
                r=mid-1;
            }
            else{
                l =mid+1;
            }
        }
        return l;
    }
    public int maximumCount(int[] nums) {
         int neg =leftmost(nums,0);
       int one =leftmost(nums,1);
       int pos =nums.length -one;
       return Math.max(neg,pos);
    }
}