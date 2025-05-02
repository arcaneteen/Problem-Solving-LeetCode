class Solution {
    public int smallestNumber(int n) {
        StringBuilder binary=new StringBuilder();
        while(n>0){
            int r=n%2;
            binary.insert(0,r);
            n=n/2;
        }
        String s=binary.toString();
        int c=s.length();
        int sum=0;
        for(int i=0;i<c;i++){
            sum+=Math.pow(2,i);
        }
        return sum;
        
    }
}