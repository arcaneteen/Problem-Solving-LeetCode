class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int arr[]=new int[spells.length];
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            int l=0,r=potions.length-1,index=potions.length;
            while(l<=r){
                int mid=l+(r-l)/2;
                if((long)spells[i]*potions[mid]>=success){
                    index=mid;
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            arr[i]=potions.length-index;
        }
        return arr;
    }
}