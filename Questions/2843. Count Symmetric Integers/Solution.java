class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        String num = "";
        int x = 0, n = 0;
        for (int i = low; i <= high; i++) {
            num = String.valueOf(i);
            int leng = num.length() / 2;
            if (leng == 0) continue;
            if (leng % 2 == 0) continue;

            for (int j = 0; j < leng; j++) {
                x += Integer.valueOf(String.valueOf(num.charAt(j)));
                n += Integer.valueOf(String.valueOf(num.charAt(j + leng)));
            }
            if (x == n) {
                System.out.println(x + " = " + n + " . " + i);
                count++;
            }

            x = 0;
            n = 0;
        }
        return count;
    }
}