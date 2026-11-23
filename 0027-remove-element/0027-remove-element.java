class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 1 && nums[0] == val) return 0;
        int i = 0, j = nums.length -1;
        while(i < j){
            while(i < j && nums[i] != val){ i++; }
            while(j > i && nums[j] == val){ j--; }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
        
        int ans ;
        for(ans = 0 ; ans < nums.length ; ans++){
            if(nums[ans] == val) break;
        }
        return ans;
    }
}