class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxCoun = 0;
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> map = new HashMap();
            int coun = 0;
            for (int j = i; j < s.length(); j++) {
                map.put(s.charAt(j), 1);
                if (!map.containsKey(s.charAt(j))) {
                    coun++;
                    if (coun >= maxCoun) maxCoun = coun; 
                } else {
                    coun = 0;
                }
            }
        }
        return maxCoun;
    }
}