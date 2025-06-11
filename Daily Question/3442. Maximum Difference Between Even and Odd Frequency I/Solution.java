class Solution {
    public int maxDifference(String s) {
        char[] charS = s.toCharArray();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < charS.length; i++) {
            map.put((int) charS[i], map.getOrDefault((int) charS[i], 0) + 1);
        }
        int a1 = 90000, a2 = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value % 2 == 0 && value < a1) {
                a1 = value;
            } else if (value % 2 != 0 && value > a2) {
                a2 = value;
            }
        }
        return a2 - a1;
    }
}