class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        String x = "";
        for (int i = s.length(); i > 0; i--) {
            x = x+s.charAt(i-1);
        }
        return s.equals(x);
    }
}