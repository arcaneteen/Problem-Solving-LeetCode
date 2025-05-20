class Solution {
    public int smallestIndex(int[] nums) {
        int j=-1,i=0;
        int flag=0;
        while(i<nums.length){
            if(sumOfDigit(nums[i])==i){
                flag=1;
                break;
            }
            else{
                i++;
            }
        }
        if(flag==1) return i;
        else{return -1;}
    }
    public int sumOfDigit(int n){
        int s=0;
        for(int i=n;i>0;i=i/10){
            int r=i%10;
            s+=r;
        }
        return s;
    }
}