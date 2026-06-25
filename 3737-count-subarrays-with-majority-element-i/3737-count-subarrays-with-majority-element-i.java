class Solution {
    static class Fenwick {
        int[] bit;
        int n;

        Fenwick(int n) {
            this.n = n;
            bit = new int[n + 1];
        }

        void update(int idx, int val) {
            while (idx <= n) {
                bit[idx] += val;
                idx += idx & -idx;
            }
        }

        int query(int idx) {
            int sum = 0;
            while (idx > 0) {
                sum += bit[idx];
                idx -= idx & -idx;
            }
            return sum;
        }
    }

    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int offset = n + 2;
        int size = 2 * n + 5;

        Fenwick ft = new Fenwick(size);
        int prefix = 0;
        long ans = 0;

        ft.update(offset, 1);

        for (int x : nums) {
            prefix += (x == target) ? 1 : -1;
            int mapped = prefix + offset;
            ans += ft.query(mapped - 1);
            ft.update(mapped, 1);
        }

        return (int) ans;
    }
}