class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> lst = new ArrayList<>();
        String[] arr = text.split(" ");

        for(int i = 1 ; i < arr.length - 1 ; i++){
            if(arr[i].equals(second) && arr[i-1].equals(first)){
                        lst.add(arr[i+1]);
                }
        }
        return lst.toArray(new String[0]);
    }
}