class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        
        int max  = 0;
        for(int x : set){
            if(set.contains(x-1)) continue;
            else{
                int ans = 0;
                while(set.contains(x)){
                    ans++;
                    x++;
                }
                max = Math.max(ans,max);
            }
        }

        return max;

        // if(nums.length == 0) return 0;
        // Set<Integer> set = new HashSet();
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int num : nums){
        //     set.add(num);
        // }

        // int max = 1;
        // for(int num : nums){
        //     if(!set.contains(num)) continue;
        //     int x = num-1;
        //     int inc = 1;
        //     while(x > Integer.MIN_VALUE && x < Integer.MAX_VALUE){
        //         if(map.containsKey(x)){
        //             inc += map.get(x); break;
        //         }
        //         else if(set.contains(x)){
        //             inc++;
        //             set.remove(x);
        //             x-=1;
        //         }
        //         else{ break; }
        //     } 
        //     map.put(num, inc);
        //     max = Math.max(max,inc);
        // }
        //return max;
        // if(nums.length == 0) return 0;
        // boolean[] arr = new boolean[100001];
        // int max = 0;
        // for(int num : nums ){
        //     max = Math.max(max,num);
        //     arr[num] = true;
        // }
        
        // int inc = 1;
        // int maxLen = 1;
        // for(int i = 1 ; i <= max ; i++){
        //     if(arr[i]){
        //         if(arr[i-1]) inc++;
        //     }
        //     else{
        //         inc = 1;
        //     }
        //     maxLen = Math.max(maxLen,inc);

        // }
        // return maxLen;
    }
}