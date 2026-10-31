class Solution {
    public int findJudge(int n, int[][] trust) {
        int judge = -1;
        int[] trustVotes = new int[n+1];

        for(int[] arr : trust){
            trustVotes[arr[0]]--;
            trustVotes[arr[1]]++;
        }

        for(int i = 1 ; i < n+1 ; i++){
            if(trustVotes[i] == n - 1) return i;
        }

        return judge;



        // HashSet<Integer> set = new HashSet<>();
        // for(int i = 0 ; i < trust.length ; i++){
        //     set.add(trust[i][0]);
        //     set.add(trust[i][1]);
        // }

        // for(int i = 0 ; i < trust.length ; i++){
        //     set.remove(trust[i][0]);
        // }

        // if(set.isEmpty()) return -1;
        // return set.iterator().next();

    }
}