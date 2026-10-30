class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        int cnt = 0;
        while (i >= 0) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
                cnt++;
            }
            if (cnt == k) {
                cnt = 0;
                sb.append("-");
            }
            i--;
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '-')
            sb.deleteCharAt(sb.length() - 1);

        //toUpperCase();
        return sb.reverse().toString().toUpperCase();
    }
}