
class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {

        int q = queries.length;
        int[] ans = new int[q];

        // Sort logs according to request time.
        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));

        // Store query time along with original index.
        int[][] order = new int[q][2];

        for (int i = 0; i < q; i++) {
            order[i][0] = queries[i];
            order[i][1] = i;
        }

        // Sort queries by time.
        Arrays.sort(order, (a, b) -> Integer.compare(a[0], b[0]));

        int[] freq = new int[n + 1];

        int left = 0;
        int right = 0;
        int active = 0;

        for (int i = 0; i < q; i++) {

            int high = order[i][0];
            int low = high - x;
            int idx = order[i][1];

            // Expand window: Add logs up to high.
            while (right < logs.length &&
                   logs[right][1] <= high) {

                int server = logs[right][0];

                if (freq[server] == 0) {
                    active++;
                }

                freq[server]++;
                right++;
            }

            // Shrink window: Remove logs before low.
            while (left < right &&
                   logs[left][1] < low) {

                int server = logs[left][0];

                freq[server]--;

                if (freq[server] == 0) {
                    active--;
                }

                left++;
            }

            ans[idx] = n - active;
        }

        return ans;
    }
}
