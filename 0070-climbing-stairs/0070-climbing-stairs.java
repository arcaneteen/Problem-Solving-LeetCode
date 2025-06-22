class Solution {
    public int climbStairs(int n) {
        //no. of ways you can climb stairs
        if(n<=1) return 1;
        int[] stair=new int[n+1];
        stair[0]=stair[1]=1;
        for(int i=2;i<=n;i++){
            stair[i]=stair[i-1]+stair[i-2];
        }
        return stair[n];
    }
}