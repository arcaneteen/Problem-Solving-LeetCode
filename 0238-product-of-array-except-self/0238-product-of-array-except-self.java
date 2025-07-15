class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=nums.length;
        int[] res=new int[l];
        int product=1;
        for(int i=0;i<l;i++){
            res[i]=product;
            product*=nums[i];
        }
        product=1;
        for(int i=l-1;i>=0;i--){
            res[i]*=product;
            product*=nums[i];
        }
        return res;
    }
}