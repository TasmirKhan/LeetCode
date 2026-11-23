class Solution {
    public int majorityElement(int[] nums) {
        int key = 0, value = 0;
        for(int num : nums){
            if(key == 0 && value == 0){
                key = num;
                value++;
            }
            else{
                if(num == key){ value++; }
                else{
                    value--;
                    if(value <= 0){ key = 0; }
                }
            }
        }

        return key;


        // HashMap approach
        //  HashMap<Integer,Integer> map = new HashMap<>();
        //  int key = 0;
        //  for(int num : nums){
        //     if(map.isEmpty()){
        //         map.put(num,1);
        //         key = num;
        //     }
        //     else{
        //         if(map.containsKey(num)){
        //             map.put(num,map.getOrDefault(num,0)+1);
        //         }
        //         else{
        //             map.put(key, map.getOrDefault(key,0)-1);
        //             if(map.get(key) == 0) map.remove(key);
        //         }
        //     }
        //  }
        //  return key;
    }
}