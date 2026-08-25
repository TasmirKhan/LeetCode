class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] arr = new boolean[100];
        int i = 0;
        for(int idx : nums){
            arr[idx-1] = true;
        }
        for( i = k-1;i<arr.length;i+=k){
            if(arr[i] == false) return i+1;
        }
        return i+1;


        // Arrays.sort(nums);
        // int x  = k;
        // for(int num : nums){
        //     if(num%k == 0 && num > x) return x;
        //     if(num%k ==0 && num == x) x += k;
        // }
        // return x;
    }
}