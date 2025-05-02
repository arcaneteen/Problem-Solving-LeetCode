class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums){
            if(set.contains(ele)){
                set.remove(ele);
            }
            else{
                set.add(ele);
            }
        }
        for(int single:set){
            return single;
        }
        return -1;
    }
}