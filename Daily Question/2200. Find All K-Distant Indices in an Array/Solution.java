class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (Math.abs(i - j) <= k) {
                    if (nums[j] == key) {
                        map.put(i, map.getOrDefault(i, 0) +1);
                    }
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(entry.getKey());
        }
        Collections.sort(list);
        return list;
    }
}