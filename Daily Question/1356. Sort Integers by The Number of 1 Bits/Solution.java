class Solution {
    public int[] sortByBits(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int bits = Integer.bitCount(arr[i]);
            List<Integer> list;
            if (map.containsKey(bits)) {
                list = map.get(bits);
                list.add(arr[i]);
                map.put(bits, list);
            } else {
                list = new ArrayList<>();
                list.add(arr[i]);
                map.put(bits, list);
            }
        }
        int count = 0;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int key = entry.getKey();
            List<Integer> values = entry.getValue();
            Collections.sort(values);
            for (int i = 0; i < values.size(); i++) {
                arr[count] = values.get(i);
                count++;
            }
        }
        return arr;
    }
}