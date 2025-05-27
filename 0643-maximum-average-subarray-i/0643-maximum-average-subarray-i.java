class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];//pehle k number of elements ka sum nikalo(if k=3 ,i=0-2)
        }
        int maxSum=sum; //starting k sum h isme
        for(int i=k;i<nums.length;i++){//ab k se start krke end tk jao nums[] ka(nums[3] to nums[l-1])
            sum+=nums[i]-nums[i-k]; //sabse piche wala udao (nums[0] bye bye)
            maxSum=Math.max(maxSum,sum);
        }
        return (double)maxSum/k;//for precision
    }
}