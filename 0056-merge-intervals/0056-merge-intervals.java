class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        ArrayList<int[]> lst = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i = 1;  i<intervals.length ; i++){
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];

            if(currStart <= end){
                end = Math.max(end, currEnd);
            }
            else{
                lst.add( new int[]{start, end});
                start = currStart;
                end = currEnd;
            }
        }
        lst.add(new int[]{start, end});
        return lst.toArray(new int[lst.size()][]);
    }
}