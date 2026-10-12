class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        //1. Fixed Constraint approach
        int[] arr = new int[101];
        int allZero = nums.length;
        
        int[] res = new int[allZero];
        for(int num : nums){
            arr[num]++;
        }
        int a = 0;
        while(allZero > 0){
            for(int i = 0 ; i<101 ; i++){
               if(arr[i] != 0){
               res[a++] = i;
                arr[i]--;
                allZero--;
               }
            }
        }
        return res;
        //return lst.stream().mapToInt(Integer::intValue).toArray();



        // 2.  HashMap approach
        // HashMap<Integer,Integer> map = new HashMap<>();
        // int max = Integer.MIN_VALUE;
        // int n = nums.length;

        // for(int num : nums){
        //     map.put(num, map.getOrDefault(num,0)+1);
        //     max = Math.max(max,num);
        // }

        // int i = 0;
        // int[] res = new int[n];
        // while(i < n){
        //     for(int j = 1 ; j <= max ; j++){
        //         if(map.containsKey(j)){
        //             res[i++] = j;
        //             if(map.get(j) - 1 == 0){ map.remove(j);}
        //             else{map.put(j, map.get(j) - 1);}
        //         }
        //     }
        // }

        // return res;

        //3.  Priority Queue Approach
        // PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // PriorityQueue<Integer> maxHeap =
        //     new PriorityQueue<>(Collections.reverseOrder());

        // int n = nums.length;

        // for (int num : nums) {
        //     minHeap.offer(num);
        // }

        // int[] res = new int[n];
        // int i = 0;

        // while (!minHeap.isEmpty()) {
        //     int prev = minHeap.poll();
        //     res[i++] = prev;

        //     while (!minHeap.isEmpty()) {
        //         int num = minHeap.poll();

        //         if (num == prev) {
        //             maxHeap.offer(num);
        //         } else {
        //             res[i++] = num;
        //             prev = num;
        //         }
        //     }

        //     while (!maxHeap.isEmpty()) {
        //         minHeap.offer(maxHeap.poll());
        //     }
        // }

        // return res;
    

    }
}