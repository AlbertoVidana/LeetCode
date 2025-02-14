package pro;

public class removeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution {
    public int removeElement(int[] nums, int val) {
        int l = nums.length;
        int[] r = new int[l];
        int count = 0;
        for(int i = 0; i < l; i++) {
            if(nums[i] != val) {
                r[count] = nums[i];
                count++;
            } 
        }
        for(int j = 0; j < count; j++) {
            nums[j] = r[j];
        }
        return count;
    }
}