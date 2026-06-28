class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max =0;

        for(int num : piles){
            max = Math.max(max, num);
        }

       int low = 1 , high = max;
       while(low<= high){
            long hours = 0 ;
            int mid = low + (high-low)/2;
            for(int num : piles){
                hours += (num + mid - 1L)/ mid;
            }
            if(hours <= h){
                high = mid -1;
            }
            else{ low = mid + 1; }
       }
       
       return low;

    }
}