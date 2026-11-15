import java.util.*;

class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        // Prefix sums: pre[i] = sum of nums[0..i-1]
        int[] pre = new int[n + 1];
        for (int i = 0; i < n; i++) {
            pre[i + 1] = pre[i] + nums.get(i);
        }

        TreeMap<Integer, Integer> window = new TreeMap<>(); // prefix sum → frequency
        int minSum = Integer.MAX_VALUE;

        for (int end = 0; end < n; end++) {
            // Add the new valid start index (if it exists)
            int addIdx = end - l + 1;
            if (addIdx >= 0) {
                window.merge(pre[addIdx], 1, Integer::sum);
            }
            // Remove the start index that falls out of the window
            int removeIdx = end - r;
            if (removeIdx >= 0) {
                int cnt = window.get(pre[removeIdx]);
                if (cnt == 1) {
                    window.remove(pre[removeIdx]);
                } else {
                    window.put(pre[removeIdx], cnt - 1);
                }
            }

            // Find the greatest prefix sum strictly less than pre[end+1]
            Integer floorKey = window.lowerKey(pre[end + 1]);
            if (floorKey != null) {
                int cand = pre[end + 1] - floorKey;
                if (cand > 0 && cand < minSum) {
                    minSum = cand;
                }
            }
        }

        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}