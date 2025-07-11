class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<Character, Integer>();
        Map<Character, Integer> tMap = new HashMap<Character, Integer>();
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) +1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) +1);
        }

        for(Map.Entry<Character, Integer> entry : sMap.entrySet()) {
            char key = entry.getKey();
            if (tMap.get(key) == null) return false;
            int intS = tMap.get(key);
            int intT = entry.getValue();
            if (intS != intT) return false;
        }
        return true;
    }
}