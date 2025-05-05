class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int i=0;
        String s="";
        while(i<s1.length() && i<s2.length() && s1.charAt(i)==s2.charAt(i)){
            s+=s1.charAt(i);
            i++;
        }
        return s;
}
}