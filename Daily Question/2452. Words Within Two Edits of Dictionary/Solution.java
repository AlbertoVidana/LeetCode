class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> list = new ArrayList<>();
        int n = queries.length;
        int m = dictionary.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int edits = 0;
                for (int k = 0; k < queries[i].length(); k++) {
                    if (queries[i].charAt(k) != dictionary[j].charAt(k)) {
                        edits++;
                    }
                }
                if (edits <= 2) {
                    list.add(queries[i]);
                    break;
                }
            }
        }

        return list;
    }
}