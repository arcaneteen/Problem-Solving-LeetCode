class Solution {
    public int bitwiseComplement(int n) {
        String binary=Integer.toBinaryString(n);
        String complement="";
        for(char c:binary.toCharArray())
        {
            if(c=='1') complement+="0";
            else complement+="1";
        }
        return Integer.parseInt(complement,2);
    }
}