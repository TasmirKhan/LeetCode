class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int[] diff = new int[n];

        int maxDiff = 0;
        long total = 0;
        long k = (long) k1 + k2;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            maxDiff = Math.max(maxDiff, diff[i]);
            total += diff[i];
        }

        if (k >= total) return 0L;

        int[] freq = new int[maxDiff + 1];

        for (int d : diff) {
            freq[d]++;
        }

        for (int d = maxDiff; d > 0 && k > 0; d--) {
            long count = freq[d];

            if (count <= k) {
                // Reduce every occurrence of d to d - 1.
                freq[d] = 0;
                freq[d - 1] += count;
                k -= count;
            } else {
                // Only k occurrences need to decrease.
                freq[d] -= (int) k;
                freq[d - 1] += (int) k;
                k = 0;
            }
        }

        long sum = 0;

        for (int d = 1; d < freq.length; d++) {
            sum += (long) d * d * freq[d];
        }

        return sum;
    }
}