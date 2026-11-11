class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt = 0;
        //int min = Integer.MAX_VALUE;
        for(int task : tasks){
            map.put(task, map.getOrDefault(task,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet() ){
            int key = entry.getKey();
            int val = entry.getValue();
            if(val == 1) return -1;
            else if(val == 2) cnt++;
            else{
                int rem = val%3;
                cnt += val/3;
                if(rem > 0) cnt+=1;
            }
        }

        return cnt;
    }
}