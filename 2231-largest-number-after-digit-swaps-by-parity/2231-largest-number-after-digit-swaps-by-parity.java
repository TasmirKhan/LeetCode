class Solution {
    public int largestInteger(int num) {
        if (num < 102)
            return num;
        int n = (num == 0) ? 1 : (int) Math.log10(Math.abs(num)) + 1;

        boolean[] evenarr = new boolean[n];
        int temp = num;

        PriorityQueue<Integer> evenpq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> oddpq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = n - 1; i >= 0; i -= 1) {
            int x = temp % 10;
            if (x % 2 == 0) {
                evenarr[i] = true;
                evenpq.add(x);
            } else {
                evenarr[i] = false;
                oddpq.add(x);
            }
            temp = temp / 10;
        }
        int ans = 0;
        for(int i = 0 ; i<n ; i++){
            if(evenarr[i]){
                ans = ans*10 + evenpq.poll();
            }
            else{
                ans = ans*10 + oddpq.poll();
            }
        }
        return ans;
    }
}