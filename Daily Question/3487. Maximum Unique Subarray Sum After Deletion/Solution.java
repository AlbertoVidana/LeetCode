class Solution {
    public int maxSum(int[] nums) {
        if (nums.length == 1) return nums[0];
        Arrays.sort(nums);
        int negativeMax = -2147483648;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            } else {
                if (nums[i] > negativeMax) negativeMax = nums[i];
            }
        }
        //System.out.println(" " + map.isEmpty());
        if (map.isEmpty()) return negativeMax;
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            max += entry.getKey();
        }
        return max;
    }
}