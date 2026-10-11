class KthLargest {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public KthLargest(int k, int[] nums) {
        for(int num : nums){
            maxHeap.add(num);
        }
        int temp = k;
        while(temp > 1){
            minHeap.add(maxHeap.poll());
            temp-=1;
        }
    }
    
    public int add(int val) {
        if(!maxHeap.isEmpty() && val <= maxHeap.peek()){
            maxHeap.add(val);
            return maxHeap.peek();
        }

        else{
            minHeap.add(val);
            maxHeap.add(minHeap.poll());
            return maxHeap.peek();
        }
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */