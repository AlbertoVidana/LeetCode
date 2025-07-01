class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> listOfList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i + 1; j < nums.length-1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    List<Integer> list = new ArrayList<>();
                    if (map.containsKey(k) || map.containsKey(j) || map.containsKey(i)) {
                     
                    } else if ((nums[i] + nums[j] + nums[k]) == 0) {
                        System.out.println(i + " " + j + " " + k);
                        map.put(i, 0);
                        map.put(j, 0);
                        map.put(k, 0);
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        listOfList.add(list);
                    }
                }
            }
        }
        return listOfList;
    }
}