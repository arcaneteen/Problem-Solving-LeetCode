class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        arr[0]=0;
        for(int i=1;i<=n;i++){
            int cnt=0;
            int p=i;
            while(p!=0){
                p=p&(p-1);
                cnt++;
            }
            arr[i]=cnt;
        }
        return arr;
    }
}