class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : gifts){
            pq.add(num);
        }

        while( k-- > 0){
            pq.add((int)Math.sqrt(pq.poll()));
                // int x = pq.poll();
                // x = (int) Math.sqrt(x);
                // if(x != 0){pq.add(x);}
                // k--;
            
        }

        long sum = 0;
        while(!pq.isEmpty()){
            sum += pq.poll();
        }

        return sum;

        // Failed Sorting Algo. 
        // Arrays.sort(gifts);
        // int n = gifts.length;
        // int i = n-1;
        // int sum = 0;
        // while(k > 0){
        //     gifts[i] = (int)Math.sqrt(gifts[i]);
        //     sum += gifts[i];
        //     i--;
        //     k--;
        // }
        // return sum;
    }
}