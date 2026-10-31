class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length+1;
        int[] connection = new int[n+1];

        for(int[] arr : edges){
            connection[arr[0]]++;
            connection[arr[1]]++;
        }

        for(int i = 1 ; i <= n ; i++){
            if(connection[i] == n -1) return i;
        }

        return -1;
    }
}