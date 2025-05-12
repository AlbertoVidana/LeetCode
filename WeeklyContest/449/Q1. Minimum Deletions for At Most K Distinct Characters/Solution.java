import java.util.Map.Entry;

class Solution {
    public int minDeletion(String s, int k) {
        Map<Character, Integer> mapChars = new HashMap<Character, Integer>();

        for (char c : s.toCharArray()) {
            mapChars.put(c, mapChars.getOrDefault(c, 0) + 1);
        }
        
        Map<Character, Integer> sortedMap = sortByValue(mapChars);
        
        if (mapChars.size() <= k) return 0;

        int coun = 0;
        boolean good = false;
        while (!good) {
            Map.Entry<Character, Integer> minEntry = Collections.min(sortedMap.entrySet(), Comparator.comparing(Map.Entry::getValue));

            coun += minEntry.getValue();
            sortedMap.remove(minEntry.getKey());
            if (sortedMap.size() == k) good = true;
        }
        return coun;
    }

     public static <K, V extends Comparable<? super V>> Map<K, V> 
        sortByValue(Map<K, V> map) {
            List<Entry<K, V>> list = new LinkedList<>(map.entrySet());
            Collections.sort(list, new Comparator<Entry<K, V>>() {
                public int compare(Entry<K, V> o1, Entry<K, V> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }
            });

        Map<K, V> result = new LinkedHashMap<>();
        for (Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
        }
}