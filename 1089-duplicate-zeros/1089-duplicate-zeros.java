class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer> lst = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        while(i<arr.length){

            if(arr[i] != 0 ){
                lst.add(arr[i]);
            }
            else{
                lst.add(0);
                lst.add(0);
            }
            if(lst.size() >= n) break;
            i++;
        }

        for(int j = 0 ; j<n ; j++){
            arr[j] = lst.get(j);
        }
    }
}