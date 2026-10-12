class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // HashMap + PriorityQueue
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(b[1], a[1]));

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            pq.add(new int[]{key, value});
        }

        int[] res = new int[k];
        int i = 0;

        while(k-->0){
            int[] arr = pq.poll();
            res[i++] = arr[0];
        }

        return res ;


        // Set<Integer> set = new HashSet<>();
        // int tempk = k;
        // int j = 0;
        // while(k>0){            
        //     if(set.add(nums[j])){k--;}
        //     j++;
        // }
        // int[] arr = new int[tempk];
        // Iterator<Integer> it = set.iterator();
        // int i = 0;
        // while(it.hasNext()){
        //     int num = it.next();
        //     arr[i++] = num;
        // }

        // return arr;
    }
}