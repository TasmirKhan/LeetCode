class Solution {
    public List<List<Integer>> generate(int num) {
        List<List<Integer>> lst = new ArrayList<>();
        for(int i = 0 ; i<num; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0 ; j<=i; j++){

                if(j == 0 || j== i){ temp.add(1);}
                else{
                    int x = lst.get(i-1).get(j-1) + lst.get(i-1).get(j);
                    temp.add(x);
                }                
            }
            lst.add(temp);
        }
        return lst;
    }
}