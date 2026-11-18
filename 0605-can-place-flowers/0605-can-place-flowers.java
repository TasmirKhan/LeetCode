class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int x = flowerbed.length;

        if(x == 1 && flowerbed[0] == 0){ n-- ; return n<=0;}
        if(x == 1 && flowerbed[0] == 1) return n == 0;
        if(x <= 0) return false;

        if(flowerbed[0] == 0 && flowerbed[1] == 0){ 
            flowerbed[0] = 1;
            n--;
        } 

        for(int i = 1 ; i < x-1 ; i++){
            if(flowerbed[i] == 0){
                int prev  = i-1;
                int next = i+1;
                if(flowerbed[prev] == 0 && flowerbed[next] == 0){
                    flowerbed[i] = 1;
                    n--;
                    i++;
                }            
            }
        }

        if(flowerbed[x-1] == 0 && flowerbed[x-2] == 0){
            flowerbed[x-1] = 1;
            n--;
        }

        return n <= 0;
    }
}