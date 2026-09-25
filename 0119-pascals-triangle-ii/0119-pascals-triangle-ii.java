class Solution {
    public List<Integer> getRow(int n) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0 ; i<=n; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j<=i; j++){
                if(j==0 || j==i){ temp.add(1);}
                else{
                    int x = res.get(j-1) + res.get(j);
                    temp.add(x);
                }
            }
            res = temp;
        }

        return res;
    }
}