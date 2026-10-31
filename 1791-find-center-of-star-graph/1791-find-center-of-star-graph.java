class Solution {
    public int findCenter(int[][] edges) {

        // Approach 2. Checking only the common vertex of first two connections. (Star Property of Graph) O(1), 0 ms.
        if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]){
            return edges[0][0];
        }
        return edges[0][1];


        // Approach 1. Checking all the connections. O(n), 3 ms
        // int n = edges.length+1;
        // int[] connection = new int[n+1];

        // for(int[] arr : edges){
        //     connection[arr[0]]++;
        //     connection[arr[1]]++;
        // }

        // for(int i = 1 ; i <= n ; i++){
        //     if(connection[i] == n -1) return i;
        // }

        // return -1;
    }
}