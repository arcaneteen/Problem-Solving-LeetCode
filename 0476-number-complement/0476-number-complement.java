class Solution {
    public int findComplement(int num) {
        if (num==0) return 1;
        long power=1;
        while(power<=num){
            power=power<<1; //Added 1 more 0 to the end ,works Like power *= 2
        }
        return (int)(power-1-num);//all 1's -given number->Complement  (U-A)=A'
    }
}
