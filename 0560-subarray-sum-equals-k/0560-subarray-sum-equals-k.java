class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0 ; 
        int sum = 0;
        for(int num : nums){
            sum += num;
            count += map.getOrDefault(sum-k,0);
            map.put(sum, map.getOrDefault(sum,0)+1);
        }

        return count;

        // Failed prefix sum;
        // int n = nums.length;
        // int [] prefix = new int[n];
        // int cnt = 0;
        // prefix[0] = nums[0];
        // for(int i = 1 ; i < n ; i++){
        //     prefix[i] = nums[i] + prefix[i-1] ;
        // }

        // for(int i = 0 ; i<n ; i++){
        //     if(prefix[i] == k || nums[i] == k) cnt++;
        //     else if(i>0){
        //         int x = prefix[i] + nums[i-1];
        //         if(x == k) cnt++;
        //     }
        // }

        // return cnt;

        // Brute Force Approach
        // int n = nums.length;
        // int cnt = 0;
        // for(int i = 0 ; i < n ; i++){
        //     int ans = 0;
        //     for(int j = i ; j < n ; j++){
        //         ans += nums[j];;
        //         if(ans == k && ans != k) {cnt++; break; }
        //         else if(ans == k) cnt++;
        //     }
        // }
        // return cnt;
    }
}