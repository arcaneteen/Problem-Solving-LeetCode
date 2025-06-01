class Solution {
    public int compress(char[] chars) {
        int index=0;
        int i=0;
        while(i<chars.length){
            char ch=chars[i];
            int cnt=0;
            while(i<chars.length && chars[i]==ch){
                cnt++;
                i++;
            }
            chars[index++]=ch;//index 0 p "a" then index increase hoke 1 ab waha count
            if (cnt>1) {
                for (char c : String.valueOf(cnt).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        return index;
    }
}