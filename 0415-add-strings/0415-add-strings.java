class Solution {
    public String addStrings(String num1, String num2) {
        int n1 = num1.length()-1;
        int n2 = num2.length()-1;

        StringBuilder sb = new StringBuilder();

        int carry = 0;
        while(n1 >= 0 && n2 >= 0){
            int ch1 = num1.charAt(n1--) - '0';
            int ch2 = num2.charAt(n2--) - '0';
            int sum = ch1 + ch2 + carry;

            carry = sum/10;
            sum = sum%10;
            sb.append(sum);
        }

        while(n1 >=0){
            int ch = num1.charAt(n1--) - '0';
            int sum = ch + carry;
            carry = sum/10;
            sum = sum%10;
            sb.append(sum);
        }
        while(n2 >=0){
            int ch = num2.charAt(n2--) - '0';
            int sum = ch + carry;
            carry = sum/10;
            sum = sum%10;
            sb.append(sum);
        }
        if(carry > 0) sb.append(carry);
        sb.reverse();
        return sb.toString();
    }
}