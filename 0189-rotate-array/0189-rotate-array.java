import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Ensure k is within bounds

        // Reverse the entire array
        reverse(nums, 0, n - 1);

        // Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Reverse the remaining n - k elements
        reverse(nums, k, n - 1);
    }

    // Helper function to reverse elements between two indices
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // Swap nums[start] and nums[end]
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
