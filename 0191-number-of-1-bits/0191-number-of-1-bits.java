class Solution {
    public int hammingWeight(int n) {
        String str=Integer.toBinaryString(n);
        int cnt=0;
        for(char c:str.toCharArray()){
            if(c=='1') cnt++;
        }
        return cnt;
    }
}