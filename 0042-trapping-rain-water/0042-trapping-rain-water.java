class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1,leftMax=0,rightMax=0,ans=0;
        while(l<r){
            leftMax=Math.max(leftMax,height[l]);
            rightMax=Math.max(rightMax,height[r]);
            if(leftMax<rightMax){
                ans+=leftMax-height[l];//water can be trapped only on index i to len-1
                l++;
            }
            else{
                ans+=rightMax-height[r];//each time height,max se minus hoga kunki wo part jp height lekar h ,waha water trap nahi ho sakta
                r--;
            }
        }
        return ans;
    }
}