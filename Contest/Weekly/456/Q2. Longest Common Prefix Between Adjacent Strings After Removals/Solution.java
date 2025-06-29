class Solution {
    public int[] longestCommonPrefix(String[] words) {
        List<Integer> arr = new ArrayList<>();
        int maxLength = 0;
        for (int i = 0; i < words.length; i++) {
            List<String> list = new ArrayList<>();
            for (int j = 0; j < words.length; j++) {
                if (i == j) break;
                System.out.print(words[j] + " ");
                if (words[j].equals(words[j+1])) {
                    arr.add(words[j].length());
                    break;
                }
            }
            System.out.println();
        }
        int[] intArr = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            intArr[i] = arr.get(i);
        }
        return intArr;
    }
}