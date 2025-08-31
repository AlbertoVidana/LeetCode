// Source code is decompiled from a .class file using FernFlower decompiler.
package pro;

class RotateArray {
   RotateArray() {
   }

   public void rotate(int[] nums, int k) {
      int l = nums.length;
      k %= l;
      int[] array = new int[l];

      int n;
      for(n = 0; n < l; ++n) {
         array[(n + k) % l] = nums[n];
      }

      for(n = 0; n < l; ++n) {
         nums[n] = array[n];
      }

   }
}
