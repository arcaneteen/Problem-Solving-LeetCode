class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set=new LinkedHashSet<>();
        for(int i:nums){
            if(!set.contains(i)){
                set.add(i);
            }
        }
        int i=0;
        for(int val:set){
            nums[i++]=val;
        }
        return set.size();
    }
}