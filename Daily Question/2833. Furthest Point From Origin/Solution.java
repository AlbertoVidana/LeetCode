class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int r = 0, l = 0, s = 0;
        int n = moves.length();
        for (int i = 0; i < n; i++) {
            if (moves.charAt(i) == 'R') {
                r++;
            } else if (moves.charAt(i) == 'L') {
                l++;
            } else {
                s++;
            }
        }
        return Math.abs(r - l) + s;
    }
}