class Solution {
    public int possibleStringCount(String word) {
        int sum = 1;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i -1) == word.charAt(i)) {
                sum++;
            }
        }
        return sum;
    }
}