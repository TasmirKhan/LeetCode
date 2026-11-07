class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        if(n <= 8) return n;
        int[] arr = new int[26];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(b[1],a[1]));

        for(char c : word.toCharArray()){
            arr[c - 'a']++;
        }
        int dist = 0;
        for(int i = 0; i < 26; i++){
            if(arr[i] > 0) {
                dist++;                
                pq.add(new int[]{i,arr[i]});
            }
        }


        if(dist <= 8) return n;
        int res = 0;
        int cnt = 0;
        int mult = 1;
        while(!pq.isEmpty()){
            int [] temp = pq.poll();
            int charVal = temp[0];
            int val = temp[1];
            mult = cnt/8;
            res += val*(mult+1);
            cnt++;
        }
        return res;


    }
}