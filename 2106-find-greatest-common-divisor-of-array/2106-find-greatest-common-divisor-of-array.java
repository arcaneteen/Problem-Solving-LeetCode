class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min) min=nums[i];
            if(nums[i]>max) max=nums[i];
        }
        int r=1;
        while(r!=0){
            r=max%min;
            max=min;
            min=r; 
        }
        return max;
    }
}