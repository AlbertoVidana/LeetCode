// Source code is decompiled from a .class file using FernFlower decompiler.
package pro;

class RemoveElement {
   RemoveElement() {
   }

   public int removeElement(int[] nums, int val) {
      int l = nums.length;
      int[] r = new int[l];
      int count = 0;

      int j;
      for(j = 0; j < l; ++j) {
         if (nums[j] != val) {
            r[count] = nums[j];
            ++count;
         }
      }

      for(j = 0; j < count; ++j) {
         nums[j] = r[j];
      }

      return count;
   }
}
