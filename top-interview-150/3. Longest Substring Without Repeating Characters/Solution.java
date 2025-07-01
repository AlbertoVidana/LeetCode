class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> map = new HashMap<>();
            int coun = 0;
            for (int j = i; j < s.length(); j++) {
                if (map.containsKey(s.charAt(j))) {
                    break;
                } else {
                    map.put(s.charAt(j), 1);
                    coun++;
                }
                if (coun > max) max = coun;
            }
        }
        return max;
    }
}