class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(a,b)-> Integer.compare(a[0], b[0]));
        ArrayList<int[]> lst = new ArrayList<>();
        int n = arr.length;
        int start = arr[0][0];
        int end = arr[0][1];
        for(int i = 1; i<n ; i++){
            int currStart = arr[i][0];
            int currEnd = arr[i][1];

            if(currStart <= end){
                end = Math.max(end,currEnd);
            }
            else {
                lst.add(new int[]{start, end});
                start = currStart;
                end = currEnd;
            }
        }
        lst.add(new int[]{ start, end});
        return lst.toArray(new int[lst.size()][]);
    //     int n = intervals.length;
    //     int m = intervals[0].length;
    //    Arrays.sort(intervals, (a,b)-> Integer.compare(a[0], b[0]));
    //    List<int[]> lst = new ArrayList<>();
    //    int temp[]  = new int[2]; 
    //    int i = 0;
    //    while(i<n-1){
    //     int x = i;
    //         if(intervals[i][1] >= intervals[i+1][0]){
    //             while(i<n-1 && intervals[i][1] >= intervals[i+1][0]){
    //                 i++;
    //             }
    //             temp[0] = intervals[x][0];
    //             temp[1] = intervals[i-1][1];
    //             lst.add(temp);
    //             continue;
    //         }
    //         i++;
        
    //    }
    //    return lst.toArray(new int[lst.size()][]);
        
    }
}