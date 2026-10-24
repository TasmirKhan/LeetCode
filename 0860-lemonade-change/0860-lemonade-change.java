class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0 ;
        int ten = 0, twenty = 0;

        for(int num : bills){
            if(num == 5) five++;
            else if(num == 10){
                if(five <= 0) return false;
                else{ five--; ten++;}
            }
            else if(num == 20){
                if(five >= 1 && ten >= 1){
                    five--; ten--;
                    twenty++;
                }
                else if(five >= 3){
                    five -= 3;
                    twenty++;
                }
                else{
                    return false;
                }
            }            
        }
        return true;
    }
}