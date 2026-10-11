class Solution {
    public int maxProduct(int[] nums) {
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       for(int num : nums){
        pq.add(num);
        }
        int max = pq.poll();
        int max2 = pq.poll();
        return (max-1)*(max2-1);
    }
}