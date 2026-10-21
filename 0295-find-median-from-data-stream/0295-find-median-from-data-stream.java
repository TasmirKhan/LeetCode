class MedianFinder {
    private PriorityQueue<Integer> lowerhalf;
    private PriorityQueue<Integer> upperhalf;

    public MedianFinder() {
        lowerhalf = new PriorityQueue<>(Collections.reverseOrder());
        upperhalf = new PriorityQueue<>();
    }
    
    public void addNum(int num) {

       lowerhalf.add(num);
       upperhalf.add(lowerhalf.poll());

       if(lowerhalf.size() < upperhalf.size()){
        lowerhalf.add(upperhalf.poll());
       }
    }
    
    public double findMedian() {
       if(lowerhalf.size() > upperhalf.size()){
        return (double) lowerhalf.peek();
       }        
       else{
        return ((double) lowerhalf.peek() + upperhalf.peek())/2.0;
       }
    }
    
    // private double topKelement(PriorityQueue<Integer> pq){
    //     int n = pq.size();
    //     int k = (n+1)/2;
    //     PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    //     while(k>0){
    //         maxHeap.add(pq.poll());
    //         k--;
    //     }
    //     double res;
    //     if(n%2 == 1){ res = maxHeap.peek();}
    //     else{ res = ((double) pq.peek() + maxHeap.peek())/2.0;  }

    //     while(!maxHeap.isEmpty()){
    //         pq.add(maxHeap.poll());
    //     }

    //     return res;  
    //     }
        
    }




/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */