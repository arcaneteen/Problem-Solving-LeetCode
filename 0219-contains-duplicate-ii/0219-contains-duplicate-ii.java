class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i>k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true; //as set.add returns true for successful insertion(without duplicate) ,and false when fails (means duplicate present) so negation and then return 
        }
        return false;
    }
}