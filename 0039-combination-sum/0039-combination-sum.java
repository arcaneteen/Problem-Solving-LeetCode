class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> comb=new ArrayList<>();
        combination(candidates,0,comb,new ArrayList<>(),target);
        return comb;
    }
    void combination(int[] nums,int i,List<List<Integer>> comb,List<Integer> ans,int target){
        if(target==0){
            comb.add(new ArrayList<>(ans));
            return;
        }
        if(i==nums.length || target<0) return;
        ans.add(nums[i]);
        // combination(nums,i+1,comb,ans,target-nums[i]);
        combination(nums,i,comb,ans,target-nums[i]);
        ans.remove(ans.size()-1);//giving last element index and removing it;
        combination(nums,i+1,comb,ans,target);

    }
}