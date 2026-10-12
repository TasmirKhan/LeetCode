class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] x = arr.clone();
        Arrays.sort(x);
        int cnt = 1;
        for(int i = 0 ; i<n ; i++){
            if(!map.containsKey(x[i])){
            map.put(x[i], cnt); cnt += 1; }
        }

        for(int i = 0 ; i<n ; i++){
            x[i] = map.get(arr[i]);
        }

        return x;

    }
}