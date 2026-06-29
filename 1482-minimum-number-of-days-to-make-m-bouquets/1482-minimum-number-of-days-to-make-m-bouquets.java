class Solution {
    public static boolean isPossible(int[] arr, int m, int k, int day){
        int flower = 0;
        int bouq = m;
        for(int i : arr){
            if(i<=day){
             flower++;
             if(flower >= k){
                bouq--;
                flower =0;
             }
             if(bouq == 0) return true;
            }
            else{ flower = 0; }
        }
        return bouq == 0;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int totalFlowers = m*k;
        int n = bloomDay.length;

        if(totalFlowers > n) return -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int day : bloomDay){
            min = Math.min(min,day);
            max = Math.max(max,day);
        }
        if(totalFlowers == n) return max;
        int result = -1;
       while(min <= max){
        int mid = min + (max-min)/2;
            if(isPossible(bloomDay, m, k ,mid)){
                result = mid;
                max = mid - 1;
            }
            else { min = mid + 1; }
        }
        return result;
    }
}