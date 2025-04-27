class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> ransomMap = 
            new HashMap<Character, Integer>();
        for (char c : ransomNote.toCharArray()) {
            ransomMap.put(c, ransomMap.getOrDefault(c, 0) +1);
        }

        HashMap<Character, Integer> magazineMap = 
            new HashMap<Character, Integer>();
        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : ransomMap.entrySet()) {
            char key = entry.getKey();
            int value1 = entry.getValue();
            if (!magazineMap.containsKey(key)) {
                return false;
            }
            if (value1 > magazineMap.get(key)) {
                return false;
            }
        }
        return true;
    }
}