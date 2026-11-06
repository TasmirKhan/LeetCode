class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char sep) {
        List<String> lst = new ArrayList<>();
        for(String word : words){
            StringBuilder sb = new StringBuilder();
            for(char c : word.toCharArray()){
                if(c == sep){
                    if( sb.length() > 0){
                    lst.add(sb.toString());
                    sb = new StringBuilder(); }
                }
                else{
                    sb.append(c);
                }
            }
            if(sb.length() > 0){lst.add(sb.toString());}
        }

        return lst;

    }
}