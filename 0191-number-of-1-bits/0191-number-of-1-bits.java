class Solution {
    public int hammingWeight(int n) {
        String str=Integer.toBinaryString(n);
        // int decimal=Integer.parseInt(str,2);
        // System.out.println(decimal); Binary to decimal
        int cnt=0;
        for(char c:str.toCharArray()){
            if(c=='1') cnt++;
        }
        return cnt;
    }
}