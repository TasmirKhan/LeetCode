class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String[]> map = new HashMap<>();
        map.put('2',new String[]{"a","b","c"});
        map.put('3',new String[]{"d","e","f"});
        map.put('4',new String[]{"g","h","i"});
        map.put('5',new String[]{"j","k","l"});
        map.put('6',new String[]{"m","n","o"});
        map.put('7',new String[]{"p","q","r","s"});
        map.put('8',new String[]{"t","u","v"});
        map.put('9',new String[]{"w","x","y", "z"});      
        String s = digits;
        List<String> lst = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>(Arrays.asList(map.get(digits.charAt(0))));
        for(int i = 1 ; i < digits.length(); i++){
            char c = s.charAt(i);
            String[] arr = map.get(c);
            ArrayList<String> templst = new ArrayList<>();
            for(int j = 0 ; j < temp.size(); j++){
                for(int k = 0 ; k < arr.length ; k++){
                    StringBuilder sb = new StringBuilder();
                        sb.append(temp.get(j)).append(arr[k]);
                        templst.add(sb.toString());
                }
            }
            temp = templst;
        }
        lst = temp;
return lst;        
    }
}