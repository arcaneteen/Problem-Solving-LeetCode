class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> comb=new ArrayList<>();
        Arrays.sort(candidates);
        combination(candidates,0,comb,new ArrayList<>(),target);
        return comb;
    }
    void combination(int[] nums,int i,List<List<Integer>> comb,List<Integer> ans,int target){
        if(target==0){
            comb.add(new ArrayList<>(ans));
            return;
        }
        if(i==nums.length || target<0) return;
        for(int j=i;j<nums.length;j++){
            if(j>i && nums[j]==nums[j-1]) continue;
        if(nums[j]<=target){
        ans.add(nums[j]);
        combination(nums,j+1,comb,ans,target-nums[j]);
        ans.remove(ans.size()-1);//giving last element index and removing it;
        }
        }

    }
}