class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int count=1;
        for(int num:set){
            if(!set.contains(num-1)){
                 int len=1;
                 while(set.contains(num+len)) len++;
                 count=Math.max(count,len);
            }
        }
        return count;
    }
}