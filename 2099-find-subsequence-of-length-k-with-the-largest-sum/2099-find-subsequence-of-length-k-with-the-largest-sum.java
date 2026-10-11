class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(b[0],a[0]));
        for(int i = 0 ; i < nums.length ; i++){
            pq.add(new int[]{nums[i], i});
        }

        PriorityQueue<int[]> minPq = new PriorityQueue<>((a,b) -> Integer.compare(a[1], b[1]));
        int temp = k;
        while(temp>0){
            int[] arr = pq.poll();
            int val = arr[0];
            int idx = arr[1];

            minPq.add(new int[]{val, idx});
            temp--;
        }
        int[] arr = new int[k];
        for(int i = 0 ; i < k ; i++){
           int temparr[] = minPq.poll();
           arr[i] = temparr[0];
        }
        
        return arr;
    }
}