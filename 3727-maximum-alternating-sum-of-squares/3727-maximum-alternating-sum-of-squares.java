class Solution {
    public long maxAlternatingSum(int[] nums) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            maxHeap.add(Math.abs(num));
        }

        int n = nums.length;
        int k = Math.ceilDiv(n,2);
        long sum = 0;
        while(n>0){
            if(k>0){
                sum +=(long) Math.pow(maxHeap.poll(),2);
                k--;
            }
            else{
                sum -=(long) Math.pow(maxHeap.poll(), 2);
            }
            n--;
        }

        return sum;


    }
}