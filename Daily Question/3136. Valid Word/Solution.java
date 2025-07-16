class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;
        boolean hasVowel = false, hasCons = false;
        String wordLow = word.toLowerCase();
        for (int i = 0; i < wordLow.length(); i++) {
            if (wordLow.charAt(i) == 'a' ||
                wordLow.charAt(i) == 'e' ||
                wordLow.charAt(i) == 'i' ||
                wordLow.charAt(i) == 'o' ||
                wordLow.charAt(i) == 'u') {
                    hasVowel = true;
                    continue;
                } else if (wordLow.charAt(i) >= 'a' &&
                           wordLow.charAt(i) <= 'z') {
                    hasCons = true;
                    continue;
                } else if (wordLow.charAt(i) - '0' >= 0 &&
                           wordLow.charAt(i) - '0' <= 9) {
                    continue;
                } else {
                    return false;
                }
        }
        if (hasVowel && hasCons) return true;
        return false;
    }
}