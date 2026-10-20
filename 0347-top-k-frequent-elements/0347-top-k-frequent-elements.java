class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> Integer.compare(b[1],a[1]));
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int number = entry.getKey();
            int freq = entry.getValue();
            maxHeap.add(new int[]{number,freq});
        }

        int[] arr = new int[k];
        int i = 0;
        while(i < k){
            arr[i] = maxHeap.poll()[0];
            i++;
        }
        return arr;
    }
}