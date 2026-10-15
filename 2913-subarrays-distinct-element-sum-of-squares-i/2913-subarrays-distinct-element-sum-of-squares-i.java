import java.util.*;

class Solution {
    private static final int MOD = 1_000_000_007;

    class SegmentTree {
        int n;
        long[] tree, lazy;

        SegmentTree(int n) {
            this.n = n;
            this.tree = new long[4 * n];
            this.lazy = new long[4 * n];
        }

        private void push(int node, int start, int end) {
            if (lazy[node] != 0) {
                int mid = start + (end - start) / 2;
                lazy[2 * node] += lazy[node];
                tree[2 * node] = (tree[2 * node] + lazy[node] * (mid - start + 1)) % MOD;

                lazy[2 * node + 1] += lazy[node];
                tree[2 * node + 1] = (tree[2 * node + 1] + lazy[node] * (end - mid)) % MOD;

                lazy[node] = 0;
            }
        }

        public void update(int node, int start, int end, int l, int r, long val) {
            if (r < start || end < l) return;
            if (l <= start && end <= r) {
                lazy[node] += val;
                tree[node] = (tree[node] + val * (end - start + 1)) % MOD;
                return;
            }
            push(node, start, end);
            int mid = start + (end - start) / 2;
            update(2 * node, start, mid, l, r, val);
            update(2 * node + 1, mid + 1, end, l, r, val);
            tree[node] = (tree[2 * node] + tree[2 * node + 1]) % MOD;
        }

        public long query(int node, int start, int end, int l, int r) {
            if (r < start || end < l) return 0;
            if (l <= start && end <= r) return tree[node];
            push(node, start, end);
            int mid = start + (end - start) / 2;
            return (query(2 * node, start, mid, l, r) + query(2 * node + 1, mid + 1, end, l, r)) % MOD;
        }
    }

    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        SegmentTree st = new SegmentTree(n);
        Map<Integer, Integer> lastSeen = new HashMap<>();

        long totalSum = 0;
        long currentSumOfSquares = 0;

        for (int i = 0; i < n; i++) {
            int val = nums.get(i);
            int prevIdx = lastSeen.getOrDefault(val, -1);

            int l = prevIdx + 1;
            int r = i;

            long rangeSum = st.query(1, 0, n - 1, l, r);
            long len = r - l + 1;

            // Delta = 2 * sum(d[j]) + len
            long delta = (2 * rangeSum + len) % MOD;
            currentSumOfSquares = (currentSumOfSquares + delta) % MOD;

            totalSum = (totalSum + currentSumOfSquares) % MOD;

            st.update(1, 0, n - 1, l, r, 1);
            lastSeen.put(val, i);
        }

        return (int) totalSum;
    }
}