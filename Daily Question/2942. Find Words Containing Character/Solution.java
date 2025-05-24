class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                if (x == c) {
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}