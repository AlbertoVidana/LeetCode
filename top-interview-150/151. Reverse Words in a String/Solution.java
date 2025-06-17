class Solution {
    public String reverseWords(String s) {
        String[] word = s.split("\\s+");
        List<String> words = new ArrayList<>();
        StringBuffer sb = new StringBuffer();

        for (String st : word) {
            if (st.isBlank()) {
                System.out.println("Blank" + st);
            } else {
                words.add(st);
            }
        }
        for (int i = words.size() - 1; i >= 0; i--) {
            System.out.println(words.get(i) + " - " + i);
            sb.append(words.get(i));
            if (i != 0) sb.append(" ");
        }
        return sb.toString();
    }
}