class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1=word1.length();
        int l2=word2.length();
        int len=l1<l2?l1:l2;
        int flag=0,larger;
        if(l1>l2) larger=l1;
        else {
                larger=l2;
                flag=1;
            }
        String s="";
        for(int i=0;i<len;i++){
            s=s+word1.charAt(i)+word2.charAt(i);
        }
        while(len!=larger){
            if(flag==0) s+=word1.charAt(len);
            else s+=word2.charAt(len);
            len++;
        }
        return s.toString();

    }
}