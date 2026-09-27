class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer> lst = new ArrayList<>();
        int n = nums.length;
        for(int x : map.keySet()){
            if(map.get(x) > (n/3)){
                lst.add(x);
            }
        }
        return lst;
    }
}