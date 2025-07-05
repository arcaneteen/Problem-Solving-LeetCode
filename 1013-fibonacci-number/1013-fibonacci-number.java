class Solution {
    //memoization :top-down approach ,storing already calculated val
    public int fib(int n) {
        int[] memo=new int[n+1];
        Arrays.fill(memo,-1);
        return fibo(memo,n);
    }
    public int fibo(int[] memo,int n){
        if(n<=1) return n;
        if(memo[n]!=-1){
            return memo[n];
        }
        memo[n]=fibo(memo,n-1)+fibo(memo,n-2);
        return memo[n];
    }
}