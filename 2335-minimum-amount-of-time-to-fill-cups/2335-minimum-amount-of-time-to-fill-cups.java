class Solution {
    public int fillCups(int[] amount) {
        int sum = amount[0] + amount[1] + amount[2];
        int max = Math.max(amount[0], Math.max(amount[1], amount[2]));

        return Math.max(max, (sum+1)/2);

        // int sec = 0;
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // int i = 0;
        // while(i < amount.length){
        //     if(amount[i] > 0){
        //         pq.add(amount[i]);
        //     }
        //     i++;
        // }
        // while(!pq.isEmpty()){
        //     if(pq.size() >=2){
        //         int x = pq.poll();
        //         int y = pq.poll();
        //         if(--x != 0){pq.add(x);}
        //         if(--y != 0){pq.add(y);}
        //         sec += 1;
        //     }
        //     else{
        //         int x = pq.poll();
        //         sec += x;
        //         break;
        //     }
        // }
        // return sec;
    }
}