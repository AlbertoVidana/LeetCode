class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int coun = 0;
        int[][] arr = new int[nums.length / 3][3];
        for (int i = 0; i < nums.length / 3; i++) {
            for (int j = 0; j < 3; j++) {
                //System.out.print(nums[coun] + " ");
                arr[i][j] = nums[coun];
                coun++;
            }
            if (Math.abs(arr[i][0] - arr[i][1]) > k ||
                Math.abs(arr[i][1] - arr[i][2]) > k ||
                Math.abs(arr[i][0] - arr[i][2]) > k) {
                //System.out.println(Math.abs(arr[i][0] - arr[i][2]) > k);
                return new int[0][0];
            }
        }
        return arr;
    }
}