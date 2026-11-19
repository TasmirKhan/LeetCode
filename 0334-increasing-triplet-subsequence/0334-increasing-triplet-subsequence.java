class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int n = nums.length;

        for(int i = 0 ; i < n ; i++){
             if(nums[i] > first && nums[i] > second) return true;

            if(nums[i] <= first){first = nums[i];}
            else if(nums[i] <= second){ second = nums[i];}
           
        }

        return false;

        // brute O(n^2);
        // int n = nums.length;
        // for(int i = 0 ; i < n ; i++){
        //     for(int j = i+1 ; j < n ; j++){
        //         if(nums[j] <= nums[i]) continue;
        //         int cnt = 0;
        //         for(int k = j+1 ; k < n ; k++){
        //             if(nums[k] > nums[j]) return true;
        //         }
        //     }
        // }        
        // return false;

        // Stack<Integer> st = new Stack<>();
        // int cnt = 0;
        // int n = nums.length;
        // for(int i = n - 1 ; i >= 0 ; i--){
        //     if(!st.isEmpty()){
        //         if(nums[i] < st.peek()){
        //             st.pop();
        //             cnt++;
        //         }
        //         if(cnt >= 3) return true;
        //     }
        //     st.push(nums[i]);
        // }
        // return false;
    }

}