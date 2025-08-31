// Source code is decompiled from a .class file using FernFlower decompiler.
package pro;

class RemoveDuplicatesFromSortedArray {
   RemoveDuplicatesFromSortedArray() {
   }

   public int removeDuplicates(int[] nums) {
      if (nums.length == 0) {
         return 0;
      } else {
         int previous = nums[0];
         int lastIndex = 0;

         for(int i = 1; i < nums.length; ++i) {
            if (nums[i] != previous) {
               nums[lastIndex + 1] = nums[i];
               previous = nums[i];
               ++lastIndex;
            }
         }

         return lastIndex + 1;
      }
   }
}
