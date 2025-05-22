class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<=Math.ceil(Math.pow(n,0.5));i++){
            if(Math.pow(2,i)==((double)n)) return true;
        }
        return false;
    }
}