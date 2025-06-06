class Solution {
    public int maxVowels(String s, int k) {
        // s=s.toLowerCase();
        int count=0,max=0;
        for(int i=0;i<s.length();i++){
            if(checkVowel(s.charAt(i))) count++;
            if(i>=k){ //window se jyada ho gya to piche wale ko remove krdo(agar vowel hua to count--)
              if(checkVowel(s.charAt(i-k))) count--;

            }
            max=Math.max(max,count);
        }
        return max;
    }
    boolean checkVowel(char ch){
        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
    }
}