class Solution {
    public String[] findRelativeRanks(int[] score) {

         int n = score.length;
        String[] res = new String[n];
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b)-> Integer.compare(b[0],a[0]));
        

        for(int i = 0 ; i<n ; i++){
            maxHeap.add(new int[]{score[i],i});
        }

        int cnt = 0; 
        while(!maxHeap.isEmpty()){
            int[] keyValue = maxHeap.poll();
            cnt++;
            int key = keyValue[0];
            int idx = keyValue[1];
            if(cnt <= 3){
                switch(cnt){
                    case 1: 
                    res[idx] = "Gold Medal";
                    break;

                    case 2:
                    res[idx] = "Silver Medal";
                    break;

                    case 3:
                    res[idx] = "Bronze Medal";
                    break;

                    default:
                    break;
                }
            }
            else{ res[idx] = Integer.toString(cnt); }
        }
        return res;

        // HASHMAP + PRIORITY QUEUE (15 ms)
        //  int n = score.length;
        // String[] res = new String[n];
        // PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // HashMap<Integer, Integer> map = new HashMap();

        // for(int i = 0 ; i<n ; i++){
        //     maxHeap.add(score[i]);
        //     map.put(score[i], i);
        // }

        // int cnt = 0; 
        // while(!maxHeap.isEmpty()){
        //     int key = maxHeap.poll();
        //     cnt++;
        //     int idx = map.get(key);
        //     if(cnt <= 3){
        //         switch(cnt){
        //             case 1: 
        //             res[idx] = "Gold Medal";
        //             break;

        //             case 2:
        //             res[idx] = "Silver Medal";
        //             break;

        //             case 3:
        //             res[idx] = "Bronze Medal";
        //             break;

        //             default:
        //             break;
        //         }
        //     }
        //     else{ res[idx] = Integer.toString(cnt); }
        // }
        // return res;


        // BETTER APPROACH (88 ms)
        // int n = score.length;
        // String[] res = new String[n];
        // PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        // for(int num : score){
        //     maxHeap.add(num);
        // }
        // int cnt = 0;
        // while(!maxHeap.isEmpty()){
        //     int tempAns = maxHeap.poll();
        //     for(int i = 0 ; i<n ; i++){
        //         if(score[i] == tempAns){
        //             cnt++;
        //             if(cnt <= 3){
        //                 switch(cnt){
        //                     case 1:
        //                     res[i] = "Gold Medal";
        //                     break;
        //                     case 2:
        //                     res[i] = "Silver Medal";
        //                     break;
        //                     case 3:
        //                     res[i] = "Bronze Medal";
        //                     break;
        //                     default:
        //                     break;
        //                 }
        //             }
        //             else{ res[i] = Integer.toString(cnt);}
        //         }
        //     }
        // }
        // return res;

        // BRUTE FORCE APPROACH (126 ms)
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