class BusBooking {
    HashMap<String,Integer> bookings ;
    int time = 0;
    public BusBooking(int n) {
        bookings = new HashMap<>();
    }
    
    public void toggle(String seat) {
        if(bookings.containsKey(seat)){
            time -= bookings.get(seat);
            bookings.remove(seat);
        }
        else{
            char label = seat.charAt(0);
            String adjseat = (label == 'A' ? "B" : label == 'D' ? "C" : "")+seat.substring(1);
            bookings.put(seat, bookings.containsKey(adjseat) ? 3 : 1);
            time += bookings.get(seat);
        }
    }
    
    public int getTotalTime() {
        return time;
    }
    
    public int getMinTime() {
        return bookings.size();
    }
}

/**
 * Your BusBooking object will be instantiated and called as such:
 * BusBooking obj = new BusBooking(n);
 * obj.toggle(seat);
 * int param_2 = obj.getTotalTime();
 * int param_3 = obj.getMinTime();
 */