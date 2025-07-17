class Solution {
    public List<List<Integer>> combinationSum3(int k,int n) {
        int[] candidates={1,2,3,4,5,6,7,8,9};
        List<List<Integer>> comb=new ArrayList<>();
        combination(candidates,0,comb,new ArrayList<>(),n,k);
        return comb;
    }
    void combination(int[] nums,int i,List<List<Integer>> comb,List<Integer> ans,int target,int k){
        if(target==0&&k==0){
            comb.add(new ArrayList<>(ans));
            return;
        }
        if(i==nums.length || target<0||k<0) return;
        
        ans.add(nums[i]);
        combination(nums,i+1,comb,ans,target-nums[i],k-1);
        ans.remove(ans.size()-1);//giving last element index and removing it;
        combination(nums, i + 1, comb, ans, target, k);
    }
}