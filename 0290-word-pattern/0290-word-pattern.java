class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(pattern.length() ==0 && s.length() == 0) return true;
        if(pattern.length() ==0 || s.length() == 0) return false;
        
        char[] carr = pattern.toCharArray();
        String[] sarr = s.trim().split("\\s+");

        if(sarr.length != carr.length) return false;

        HashMap<Character, String> map = new HashMap<>();
        
        HashMap<String, Character> map2 = new HashMap<>();
        int n = sarr.length;
        for(int i = 0 ; i<n ; i++){
            if(!map.containsKey(carr[i])){map.put(carr[i], sarr[i]);}
            else if(!map.get(carr[i]).equals(sarr[i])){return false;}
            

            
            if(!map2.containsKey(sarr[i])){map2.put(sarr[i], carr[i]);}
            else if(!map2.get(sarr[i]).equals(carr[i])){return false;} 
            

        }


        return true;
    }
}