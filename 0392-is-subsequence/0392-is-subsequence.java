class Solution {
    public boolean isSubsequence(String s, String t) {
        int len=s.length();int i,j;
        for(i=0,j=0;i<t.length()&&j<len;i++){
            if(s.charAt(j)==t.charAt(i))  {
                j++;
                // System.out.println(t.charAt(i));
                }
            else{System.out.println(t.charAt(i));}
        }
        return j==len;
    }
}