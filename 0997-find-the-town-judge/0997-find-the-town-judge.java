class Solution {
    public int findJudge(int n, int[][] trust) {

        // conventional graph approach
        int[] in = new int[n+1];
        int[] out = new int[n+1];

        for(int[] arr : trust){
            out[arr[0]]++;
            in[arr[1]]++;
        }

        for(int i = 1; i <= n ; i++){
            if(in[i] == n-1 && out[i] == 0) return i;
        }

        return -1;


        // Mathematic approach
        // int judge = -1;
        // int[] trustVotes = new int[n+1];

        // for(int[] arr : trust){
        //     trustVotes[arr[0]]--; // if any person trust another his votes will be subtracted.
        //     trustVotes[arr[1]]++; // the person gains vote trusted by another person 
        // }

        // for(int i = 1 ; i < n+1 ; i++){
        //     if(trustVotes[i] == n - 1) return i; // Judge has votes of all the persons.
        // }

        // return judge;
    }
}