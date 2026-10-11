class KthLargest {
    //PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap;
    int k ;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.maxHeap =  new PriorityQueue<>();
        for(int num : nums){
            add(num);
        }
    }
    
    public int add(int val) {
        maxHeap.add(val);
        if(maxHeap.size() > k){
            maxHeap.poll();
        }
        return maxHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */