class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder sb = new StringBuilder("0");
        for (int i = 1; i < n; i++) {
            sb.append('1' + reverse(invert(sb.toString())));
        }
        return sb.charAt(k - 1);
    }
    
    public String reverse(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public String invert(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        return sb.toString();
    }
}