class Solution {

    private int idx ;
    public void helper(int num, int count, int[] res ,int[] freq){
        if(count <= 0){ res[idx++] = num ; return;}

        for(int i = 0 ; i < 10 ; i++){
            if(freq[i] == 0){ continue; }
            if( i == 0 && count == 3){ continue ;}
            if( count == 1 && i % 2 == 1) { continue; }

            freq[i]--;
            helper(num*10+i, count-1, res, freq);
            freq[i]++;
        }

    }

    public int[] findEvenNumbers(int[] digits) {
       // Solution obj = new Solution();
        int[] freq = new int[10];

        for(int digit : digits){
            freq[digit]++;
        }
        int[] res = new int[450];
        idx = 0;
        helper(0,3,res,freq);

        return Arrays.copyOf(res, idx);

        // List<Integer> lst = new ArrayList<>();
        // Set<Integer> set = new HashSet<>();
        // int n = digits.length;
        // for(int i = 0 ; i < n ; i++){
        // if(digits[i] == 0) continue;
        //     for(int j = 0 ; j < n ; j++){
        //         for(int k = 0; k < n ; k++ ){
        //             if(digits[k]%2 == 0 && (i!=j && j!= k && i !=k)){
        //                 int num = digits[i]*100 + digits[j]*10 + digits[k];
        //                 set.add(num);
        //             }
        //         }
        //     }
        // }

        // lst.addAll(set);
        // set.clear();
        
        // lst.sort(Comparator.naturalOrder());
        // int[] res = lst.stream().mapToInt(Integer::intValue).toArray();
        // return res;


    }
}