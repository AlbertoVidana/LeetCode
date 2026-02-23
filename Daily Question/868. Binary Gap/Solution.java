class Solution {
    public int binaryGap(int n) {
        int maxCount = 0;
        String s = Integer.toBinaryString(n);
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == '1' && s.charAt(j) == '1') {
                    count = j - i;
                    break;
                }
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}