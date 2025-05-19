class Solution {
    public String triangleType(int[] nums) {
        int coun = 0;
        if (nums[0] + nums[1] > nums[2]
        && nums[0] + nums[2] > nums[1]
        && nums[1] + nums[2] > nums[0]) {
            if (nums[0] == nums[1]) coun++;
            if (nums[0] == nums[2]) coun++;
            if (nums[1] == nums[2]) coun++;
        } else {
            return "none";
        }
        if (coun == 0) return "scalene";
        if (coun == 1) return "isosceles";
        if (coun == 3) return "equilateral";
        return "none";
    }
}