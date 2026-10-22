class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, (a,b) -> {
            int sumA = (a[0]*a[0]) + (a[1]*a[1]);
            int sumB = (b[0]*b[0]) + (b[1]*b[1]);
            return Integer.compare(sumA,sumB);
        });

        int[][] res = new int[k][2];
        for(int i = 0 ; i < k ; i++){
            res[i][0] = points[i][0];
            res[i][1] = points[i][1];
        }

        return res;
    }
}