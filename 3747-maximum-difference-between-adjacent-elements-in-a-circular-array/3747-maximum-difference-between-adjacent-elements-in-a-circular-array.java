class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int first=nums[0],max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int n=Math.abs(nums[i]-nums[i+1]);
            if(n>max) max=n;
        }
        if(Math.abs(nums[nums.length-1]-first)>max) max=Math.abs(nums[nums.length-1]-first);
        return max;

    }
}