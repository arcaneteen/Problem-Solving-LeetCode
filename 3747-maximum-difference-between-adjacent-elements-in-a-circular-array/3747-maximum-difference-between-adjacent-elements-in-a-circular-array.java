class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int n=Math.abs(nums[i]-nums[i+1]);
            if(n>max) max=n;
        }
        int again=Math.abs(nums[nums.length-1]-nums[0]);
        if(again>max) max=again;
        return max;

    }
}