class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] c = pattern.toCharArray();
        String[] sArray = s.split(" ");
        Map<String, Character> map = new HashMap<>();
        if (c.length != sArray.length) return false;
        for (int i = 0; i < sArray.length; i++) {
            if (map.containsKey(sArray[i])){
                if (map.get(sArray[i]) != c[i]) {
                    return false;
                }
            } else if (map.containsValue(c[i])) {
                 String key = findKey(map, c[i]);
                 if (key != sArray[i]) return false;
            } else {
                map.put(sArray[i], c[i]);
            }
        }
        return true;
    }

    public static <K, V> K findKey(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) { 
                return entry.getKey();
            }
        }
        return null;
    }
}