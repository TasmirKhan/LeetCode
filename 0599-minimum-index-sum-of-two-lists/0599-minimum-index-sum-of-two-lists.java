class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        // Approach 1. Using Single HashMap
        List<String> ans = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();

        for(int i = 0 ; i< list1.length ; i++){
            map.put(list1[i], i);
        }
        
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i< list2.length ; i++){
            if(i > min) break;  
            if(map.containsKey(list2[i])){
                int x = map.get(list2[i]);
                int sum = i + x;
                if(sum < min){
                    ans.clear();
                    ans.add(list2[i]);
                    min = sum;
                }
                else if(sum == min){
                    ans.add(list2[i]);
                }
            }
        }

        return ans.toArray(new String[0]);


        // Approach 2. Using 2 (Double) HashMaps
        // List<String> lst = new ArrayList<>();
        // Map<String, Integer> map = new HashMap<>();
        // for(int i = 0 ; i<list1.length ; i++){
        //     if(!map.containsKey(list1[i])) {map.put(list1[i], i);}
        // }

        // Map<String, Integer> nmap = new HashMap<>();
        // int min = Integer.MAX_VALUE;
        // for(int i = 0 ; i < list2.length ; i++){
        //     if(map.containsKey(list2[i])){
        //         int x = map.get(list2[i]);
        //         int sum = i+x;
        //         min = Math.min(min,sum);
        //         if(!nmap.containsKey(list2[i])){ nmap.put(list2[i], sum);}
        //     }
        // }

        
        // for(Map.Entry<String, Integer> entry : nmap.entrySet()){
        //     String key = entry.getKey();
        //     int val = entry.getValue();
        //     if(val == min) lst.add(key);
        // }

        // return lst.toArray(new String[0]);

    }
}