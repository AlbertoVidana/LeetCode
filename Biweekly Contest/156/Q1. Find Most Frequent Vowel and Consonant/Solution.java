class Solution {
    public int maxFreqSum(String s) {
         Map<Character, Integer> charCounts = new HashMap<>();
        Map<Character, Integer> vowelCounts = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
            || ch == 'u') {
                vowelCounts.put(ch, vowelCounts.getOrDefault(ch, 0) + 1);
            } else {
                charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
            }
            
        }
        
        int maxVowel = 0;
        if (!vowelCounts.isEmpty()) { 
            maxVowel = Collections.max(vowelCounts.values());
        }
        int max = 0 ;
         if (!charCounts.isEmpty()) { 
            max = Collections.max(charCounts.values());
        }
        return max+maxVowel;
    }
}