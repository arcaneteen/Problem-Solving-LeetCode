class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] count=new char[26];
        for(char c:magazine.toCharArray()){
            count[c-'a']+=1;
        }
        for(char ch:ransomNote.toCharArray()){
            if(count[ch-'a']==0) return false;
            count[ch-'a']--;
        }
        return true;
    }
}