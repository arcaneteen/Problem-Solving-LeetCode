class Solution {
    public int mySqrt(int x) {
        // for(int i=1;i<=x/2;i++){
        //     if(x%i==0){
        //         return i;
        //     }
        // }
       return (int)Math.pow(x,0.5); 
    }
}