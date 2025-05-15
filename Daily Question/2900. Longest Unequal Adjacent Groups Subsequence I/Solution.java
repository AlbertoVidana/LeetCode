class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int group = groups[0];
        List<String> list = new ArrayList<String>();
        list.add(words[0]);
        if (words.length < 1) return list;
        for (int i = 1; i < words.length; i++) {
            if (list.contains(words[i]) || group == groups[i]) {
                continue;
            }
            group = groups[i];
            list.add(words[i]);
        }   
        return list;
    }
}