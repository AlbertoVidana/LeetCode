class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
        }
        int[] ans = new int[sb.length()];
        int cou = 0;
        for (char c : sb.toString().toCharArray()) {
            ans[cou++] = c - '0';
        }
        return ans;
    }
}