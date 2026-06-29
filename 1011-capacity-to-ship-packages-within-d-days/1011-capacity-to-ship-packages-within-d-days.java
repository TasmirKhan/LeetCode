class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int num : weights){
            low = Math.max(low,num);
            high+= num;
        }
        int res  = -1;
        while(low <= high){
            int load = 0;
            int requiredDays = 1;
            int mid = low + (high-low)/2;
            for(int w : weights){
                if(load + w <= mid){
                    load += w;
                }
                else{
                    requiredDays++;
                    load = w;
                }
            }
            if(requiredDays <= days){res = mid ; high = mid - 1;}
            else { low = mid + 1;}
        }
        return res;
    }
}