class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : stones){
            pq.add(num);
        }

        while(pq.size() > 1){
            int x = pq.poll();
            int y = pq.poll();
            if(x == y){ continue;}
            int z = Math.abs(x-y);
            pq.add(z);
        }
        if(pq.size() == 0) return 0;
        return pq.peek();
    }
}