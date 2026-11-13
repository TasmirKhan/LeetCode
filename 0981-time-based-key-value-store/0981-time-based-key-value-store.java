class TimeMap {
    TreeMap<String,TreeMap<Integer,String>> map;

    public TimeMap() {
        map = new TreeMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new TreeMap<>());

        TreeMap<Integer, String> temp = map.get(key);

        temp.put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        TreeMap<Integer,String> temp = map.get(key);
        if(temp.floorEntry(timestamp) != null) return temp.floorEntry(timestamp).getValue();
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */