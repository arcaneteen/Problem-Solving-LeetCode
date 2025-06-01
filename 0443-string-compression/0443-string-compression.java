class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;
        while (i < chars.length) {
            char ch = chars[i];
            int cnt = 0;
            while (i < chars.length && chars[i] == ch) {
                cnt++;
                i++;
            }
            chars[index++] = ch;
            if (cnt > 1) {
                for (char c : Integer.toString(cnt).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        return index;
    }
}
