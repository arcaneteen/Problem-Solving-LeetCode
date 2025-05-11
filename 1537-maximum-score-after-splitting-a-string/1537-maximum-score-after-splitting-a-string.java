class Solution {
    public int maxScore(String s) {
        String l="",r="";
        int max=0;
        for(int i=0;i<s.length()-1;i++){
            l=l+s.charAt(i);
            r=s.substring(i+1);
            max=Math.max(max,(count(l,'0')+count(r,'1')));
        }
        return max;
    }
    int count(String r,char p){
        int c=0;
        for(int i=0;i<r.length();i++){
            if(r.charAt(i)==p)  c++;
        }
        return c;
    }
}