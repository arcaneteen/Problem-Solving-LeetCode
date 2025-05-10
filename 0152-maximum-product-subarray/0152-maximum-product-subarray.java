class Solution {
    public int maxProduct(int[] nums) {
        int pre=1,post=1,max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            pre=(pre==0?1:pre)*nums[i];//when 0 encountered product will reset
            post=(post==0?1:post)*nums[n-i-1];//taking last value and will go upto the 1st value
            max=Math.max(max,(pre>post?pre:post));//storing the max value
        }
        return max;
    }
}