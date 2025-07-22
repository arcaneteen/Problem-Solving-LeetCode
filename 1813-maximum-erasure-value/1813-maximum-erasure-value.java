class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int ans = 0;                // Stores the maximum sum found
        int[] record = new int[10001]; // To record occurrence of each number
        int sum = 0;                // Current window sum
        int n = nums.length;
        int left = 0;               // Left index of the sliding window

        for (int right = 0; right < n; right++) {
            int cur = nums[right];   // Current number at right end of window
            sum += cur;              // Add to current sum
            record[cur]++;           // Increase occurrence count
            // If this value is now a duplicate, shrink window from the left until unique
            while (record[cur] > 1) {
                sum -= nums[left];       // Remove from sum
                record[nums[left]]--;    // Decrease occurrence count
                left++;                  // Move left forward
            }
            ans = Math.max(ans, sum);   // Update answer if this window is better
        }
        return ans;
    }
}
