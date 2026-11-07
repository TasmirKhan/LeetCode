class Solution {
    public int maxOperations(int[] nums, int k) {

        // HashMap
        int cnt = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            int reqd = k-num;
            if(map.containsKey(reqd)){
                cnt++;
                map.put(reqd, map.get(reqd)-1);
                if(map.get(reqd) == 0) map.remove(reqd);
            }
            else{
            map.put(num, map.getOrDefault(num,0)+1); }
        }

        return cnt;

        // sorting + two pointer;
        // Arrays.sort(nums);
        // int n = nums.length;
        // int i = 0, j = n-1;
        // int cnt = 0;
        // while(i < j){
        //     int sum = nums[i] + nums[j];
        //     if(sum == k){cnt++; i++; j--;}
        //     else if(sum > k){j--;}
        //     else { i++;}
        // }
        // return cnt;
    }
}