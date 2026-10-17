class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num, 0) + 1);
        }

        int max = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet() ){
                int key = entry.getKey();
                int val = entry.getValue();

                if(map.containsKey(key+1)){
                    int ans = val + map.get(key+1);
                    max = Math.max(max,ans);
                }
        }

        return max;
    }
}