class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int coun = 0;
        for (int i : arr) {
            if (i % 2 == 0) coun = 0;
            else coun++;

            if (coun == 3) return true;
        }
        return false;
    }
}