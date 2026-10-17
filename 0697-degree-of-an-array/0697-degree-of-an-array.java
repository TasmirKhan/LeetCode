class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,int[]> map = new HashMap<>();
        int maxFreq = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            int element = nums[i];
            final int ci = i;
           int[] stats =  map.computeIfAbsent(element, k -> new int[]{ci,ci,0});
           stats[1] = i;
           stats[2] +=1;

           if(stats[2] > maxFreq){
            maxFreq = stats[2];
           }            
        }

        int min = Integer.MAX_VALUE;
        for(Map.Entry<Integer, int[]> entry : map.entrySet()){
            if(entry.getValue()[2] == maxFreq){
                min = Math.min(min, entry.getValue()[1] - entry.getValue()[0] + 1);
            }
        }

        return min;
    }
}