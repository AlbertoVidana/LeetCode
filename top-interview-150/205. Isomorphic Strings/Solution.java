class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> charMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (charMap.containsKey(sc)) {
                if (charMap.get(sc) != tc) {
                    return false;
                }
            } else if (charMap.containsValue(tc)) {
                return false;
            }
            System.out.println(sc + " " + tc);
            charMap.put(sc, tc);
        }

        return true;        
    }
}