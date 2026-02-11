class Solution {
    public int longestBalanced(int[] nums) {
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> evenSet = new HashSet<>();
            Set<Integer> oddSet = new HashSet<>();
            for (int j = i; j < nums.length; j++) {
                if (nums[j] % 2 == 0) {
                    if (!evenSet.contains(nums[j])) {
                        evenSet.add(nums[j]);
                    }
                } else {
                    if (!oddSet.contains(nums[j])) {
                        oddSet.add(nums[j]);
                    }
                }
                if (evenSet.size() == oddSet.size()) {
                    maxCount = Math.max(maxCount, j - i + 1);
                }
            }
        }
        return maxCount;
    }
}