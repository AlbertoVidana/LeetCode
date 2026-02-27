import java.math.BigInteger;

class Solution {
    public int numSteps(String s) {
        BigInteger bi = new BigInteger(s, 2);
        BigInteger zero = BigInteger.ZERO;
        BigInteger one = new BigInteger("1");
        BigInteger two = new BigInteger("2");
        int count = 0;
        while (bi.compareTo(one) > 0) {
            if (bi.mod(two).equals(zero)) {
                bi = bi.divide(two);
            } else {
                bi = bi.add(one);
            }
            count++;
        }
        return count;
    }
}