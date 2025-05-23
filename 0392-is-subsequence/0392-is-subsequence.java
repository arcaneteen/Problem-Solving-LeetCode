class Solution {
    public boolean isSubsequence(String s, String t) {
        int len=s.length();int i=0,j=0;
        for(;i<t.length()&&j<len;i++){
            if(s.charAt(j)==t.charAt(i))  {
                j++;
                }
        }
        return j==len;
    }
}