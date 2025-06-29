class Solution {
    public List<String> partitionString(String s) {
        List<String> list = new ArrayList<>();
        list.add(s.substring(0, 1));
        for (int i = 1; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (!list.contains(s.substring(i, j))) {
                    list.add(s.substring(i, j));
                    i = j - 1;
                    break;
                }
            }
        }
        return list;
    }
}