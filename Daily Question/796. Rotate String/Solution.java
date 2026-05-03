class Solution {
    public boolean rotateString(String s, String goal) {
        if (goal.equals(s)) return true;
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            char c = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);
            if (goal.equals(sb.toString())) {
                return true;
            }
        }
        return false;
    }
}