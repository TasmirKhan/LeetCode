class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] res = new String[n];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int num : score){
            maxHeap.add(num);
        }
        int cnt = 0;
        while(!maxHeap.isEmpty()){
            int tempAns = maxHeap.poll();
            for(int i = 0 ; i<n ; i++){
                if(score[i] == tempAns){
                    cnt++;
                    if(cnt <= 3){
                        switch(cnt){
                            case 1:
                            res[i] = "Gold Medal";
                            break;
                            case 2:
                            res[i] = "Silver Medal";
                            break;
                            case 3:
                            res[i] = "Bronze Medal";
                            break;
                            default:
                            break;
                        }
                    }
                    else{ res[i] = Integer.toString(cnt);}
                }
            }
        }
        return res;

        // BRUTE FORCE APPROACH 
        // int n = score.length;
        // String[] res = new String[n];
        // Set<Integer> st = new HashSet<>();
        // for(int i = 0 ; i<n ; i++){
        //     int cnt = 0;
        //     for(int j = 0 ; j<n ; j++){
        //         if(score[i] <= score[j]){
        //             cnt++;
        //         }
        //     }
        //     if(cnt == 1){ res[i] = "Gold Medal";}
        //     else if(cnt == 2){res[i] = "Silver Medal"; }
        //     else if(cnt == 3){ res[i] = "Bronze Medal";}
        //     else{ res[i] = String.valueOf(cnt); }
        // }

        // return res;
    }
}