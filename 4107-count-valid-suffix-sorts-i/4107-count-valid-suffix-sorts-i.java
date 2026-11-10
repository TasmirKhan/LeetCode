class Solution {
    public int countSuffix(int[] nums, int[] target) {

        int n = nums.length;
        int[] freq = new int[100001];

        int p = n-1;
        int q = 0;
        for(int i = 0 ; i < n ; i++){
            freq[nums[i]]++;
            freq[target[i]]--;

            if(nums[i] != target[i] && p == n-1){
                p = i;
            }

            if(i > 0 && target[i] > target[i-1] ){
                q = i;
            }
        }

        for(int i : freq){
            if(i != 0) return 0;
        }

        return Math.max(0, Math.min(p,n-1) - q + 1);




        // Brute Force Approach 
        // int n = nums.length;
        // if (n == 1)
        //     return 1;
        // int cnt = 0;
        // for (int i = 0; i < n; i++) {
        //     int[] temp = nums.clone();
        //     Arrays.sort(temp, i, n);
        //     int left = i;
        //     int right = n - 1;
        //     while (left < right) {
        //         int swap = temp[left];
        //         temp[left] = temp[right];
        //         temp[right] = swap;
        //         left++;
        //         right--;
        //     }
        //     if (Arrays.equals(temp, target))
        //         cnt++;
        // }
        // return cnt;
    }
}