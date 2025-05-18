class Solution {
    public int smallestIndex(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            String num = String.valueOf(nums[i]);
            for (int j = 0; j < num.length(); j++) {
                index = index + Character.getNumericValue(num.charAt(j));
            }
            if (index == i) {
                return index;
            }
            index = 0;
        }
        return -1;
    }
}