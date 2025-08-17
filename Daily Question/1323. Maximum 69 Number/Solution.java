class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        int max = num;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder(s);
            sb.setCharAt(i, '9');
            if (Integer.parseInt(sb.toString()) > max) {
                max = Integer.parseInt(sb.toString());
            }
        }
        return max;
    }
}