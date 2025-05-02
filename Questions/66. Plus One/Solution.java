import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        String s = "";
    
        for (int digit : digits) {
            s += digit;
        }
        BigInteger b1 = new BigInteger(s);
        BigInteger b2 = new BigInteger("1");
        s = String.valueOf(b1.add(b2));
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = Character.getNumericValue(s.charAt(i));
        }
        return arr;
    }
}