class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] arr = new int[2];
        char zero = '0';
        for (int i = 1; i < n; i++) {
            boolean i1 = true;
            boolean i2 = true;
            char[] arrChar = String.valueOf(i).toCharArray();
            for (char c : arrChar) {
                if (c == zero) i1 = false;
            }
            char[] arrChar2 = String.valueOf(n - i).toCharArray();
            for (char c : arrChar2) {
                if (c == zero) i2 = false;
            }
            if (i + (n - i) == n && i1 && i2) {
                arr[0] = i;
                arr[1] = (n - i);
                return arr;
            }
        }
        return arr;
    }
}