class Solution {
    private int digProduct(int n){
      int prod = 1;
      while(n > 0){
        prod *= n%10;
        n/=10;
      }
      return prod;
    }
    private int digSum(int n){
      int sum = 0;
      while(n>0){
        sum += n%10;
        n/=10;
      }
      return sum;
    } 
    public int subtractProductAndSum(int n) {
        int x = digProduct(n);
        int y = digSum(n);
        return x-y;
    }
}