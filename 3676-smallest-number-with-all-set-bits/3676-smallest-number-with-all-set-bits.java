class Solution {
    public int smallestNumber(int n) {
        if(n==1)  return 1;
        for(int i=0;i<n;i++){
            if(Math.pow(2,i)>n)  return (int)Math.pow(2,i)-1;
        }
        return 0;
    }
}