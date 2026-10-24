class Solution {
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer> lst = new ArrayList<>();
        int n = s.length();

        for(int i = 0 ; i < n ; i++){
            char a = s.charAt(i);
            if(a == c){
                lst.add(i);
            }
        }

        int[] res = new int[n];
        int pt = 0;
        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) == c){
                res[i] = 0;
                pt++;
            }
            else if(s.charAt(i) != c && pt == 0){
                res[i] = lst.get(pt) - i;
            }
            else if(s.charAt(i) != c && pt > 0 && pt < lst.size()){
                res[i] = Math.min(Math.abs(lst.get(pt) - i), Math.abs(lst.get(pt-1) - i));
            }

            else{
                res[i] = i - lst.get(pt -1);
            }
        }

        return res;
    }
}