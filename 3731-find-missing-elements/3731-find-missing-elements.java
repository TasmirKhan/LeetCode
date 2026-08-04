// class Solution {
//     public List<Integer> findMissingElements(int[] nums) {
//         List<Integer> lst = new ArrayList<>();
//         Arrays.sort(nums);
//         int min = nums[0];
//         int maz = nums[nums.length-1];
//         for(int i =0;i<nums.length;i++){
//             if(nums[i] != min){
//                 lst.add(min);
//                 min+=1;
//                 i--;
//                 continue;
//             }
//           min+=1;
//         }
//         return lst;
//     }
// }

import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> missing = new ArrayList<>();
        if (nums.length == 0) return missing;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                missing.add(i);
            }
        }

        return missing;
    }
}
