import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);  // Sort potions once
        int[] arr = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {
            int spell = spells[i];

            // Binary search to find first potion where spell * potion >= success
            int low = 0, high = potions.length - 1, index = potions.length;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if ((long)spell * potions[mid] >= success) {
                    index = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            arr[i] = potions.length - index;
        }

        return arr;
    }
}
