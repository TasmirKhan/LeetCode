class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        int start = 0, end = 0;
        int n = s.length();
        List<List<Integer>> lst  = new ArrayList<>();
        while(end < n){
            if(s.charAt(end) == s.charAt(start)){
                end++;
            }
            else{
                int cnt = end - start;
                if(start == 0 && end == n-1) cnt++;
                if(cnt >= 3){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(start); temp.add(end-1);
                    lst.add(temp);
                }
                start = end;
            }
        }
        if(s.charAt(start) == s.charAt(end-1)){
            int cnt = end - start;
                if(start == 0 && end == n-1) cnt++;
                if(cnt >= 3){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(start); temp.add(end-1);
                    lst.add(temp);
                }
        }
        return lst;
    }
}