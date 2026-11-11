class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> lst = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int n = digits.length;
        for(int i = 0 ; i < n ; i++){
        if(digits[i] == 0) continue;
            for(int j = 0 ; j < n ; j++){
                for(int k = 0; k < n ; k++ ){
                    if(digits[k]%2 == 0 && (i!=j && j!= k && i !=k)){
                        int num = digits[i]*100 + digits[j]*10 + digits[k];
                        set.add(num);
                    }
                }
            }
        }

        lst.addAll(set);
        set.clear();
        
        lst.sort(Comparator.naturalOrder());
        int[] res = lst.stream().mapToInt(Integer::intValue).toArray();
        return res;


    }
}