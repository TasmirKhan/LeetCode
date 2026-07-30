class Solution {
    public List<Integer> grayCode(int n) {
        int size = 1<<n;
        List<Integer> lst = new ArrayList<>();
        for(int i = 0;i<size;i++){
            lst.add(i^(i>>1));
        }
        return lst;
    }
}