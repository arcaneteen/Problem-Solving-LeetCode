class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        s=" "+s;
        int l=s.length()-1;
        int c=0;
        for(int i=l;i>0;i--){
            if(s.charAt(i)==' '){
                break;
            }
            c++;
        }
        return c;
    }
}