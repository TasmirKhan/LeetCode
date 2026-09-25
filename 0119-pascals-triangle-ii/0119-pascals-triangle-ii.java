class Solution {
    public List<Integer> getRow(int n) {
        List<Integer> res = new ArrayList<>();
        
        res.add(1);

        for(int i = 1 ; i <= n ; i++ ){
            long value = (long)(res.get(i-1))*(n-i+1)/i;
            res.add((int)value);
        }
        return res;
        //brute approach
        // for(int i = 0 ; i<=n; i++){
        //     List<Integer> temp = new ArrayList<>();
        //     for(int j = 0; j<=i; j++){
        //         if(j==0 || j==i){ temp.add(1);}
        //         else{
        //             int x = res.get(j-1) + res.get(j);
        //             temp.add(x);
        //         }
        //     }
        //     res = temp;
        // }

        //return res;
    }
}