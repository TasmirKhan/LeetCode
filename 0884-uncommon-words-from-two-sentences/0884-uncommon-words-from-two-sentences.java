class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> lst = new ArrayList<>();
        String[] str = s1.split(" ");
        Map<String,Integer> map1 = new HashMap<>();

        for(String s : str){
            map1.put(s,map1.getOrDefault(s,0)+1);
        }

        String[] str2 = s2.split(" ");
        Map<String,Integer> map2 = new HashMap<>();
        for(String s : str2){
            map2.put(s,map2.getOrDefault(s,0)+1);
        }

        for(String s : str){
            if(!map2.containsKey(s) && map1.get(s) == 1) lst.add(s);
        }

        for(String s : str2){
            if(!map1.containsKey(s) && map2.get(s) == 1) lst.add(s);
        }

        return lst.toArray(new String[0]);

        
    }
}