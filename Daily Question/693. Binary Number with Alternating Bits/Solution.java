class Solution {
    public boolean hasAlternatingBits(int n) {
        String sBits = Integer.toBinaryString(n);
        for (int i = 0; i < sBits.length() - 1; i++) {
            if (sBits.charAt(i) == sBits.charAt(i + 1)) return false;
        }
        return true;
    }
}