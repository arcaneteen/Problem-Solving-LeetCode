class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int index, int target, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current)); 
            return;
        }

        if (index == candidates.length || target < 0) {
            return; 
        }

        
        if (candidates[index] <= target) {
            current.add(candidates[index]);
            backtrack(candidates, index, target - candidates[index], current, result); // stay at same index
            current.remove(current.size() - 1); 
        }

    
        backtrack(candidates, index + 1, target, current, result);
    }
}