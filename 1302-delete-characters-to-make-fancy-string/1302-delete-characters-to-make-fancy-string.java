class Solution {
    public String makeFancyString(String s) {
        int l=s.length();
        if(l<3) return s;
        StringBuilder p=new StringBuilder();
        p.append(s.charAt(0));
        for(int i=1;i<l;i++){
            if(i<l-1 &&s.charAt(i-1)==s.charAt(i)&&s.charAt(i)==s.charAt(i+1)){
                continue;
            }
            p.append(s.charAt(i));
        }
        return p.toString();
    }
}