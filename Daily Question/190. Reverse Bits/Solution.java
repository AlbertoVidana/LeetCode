class Solution {
    public int reverseBits(int n) {
        StringBuilder sb = new StringBuilder(
                String.format("%32s", Integer.toBinaryString(n)).
                replaceAll(" ", "0"));
        return Integer.parseInt(sb.reverse().toString(), 2);
    }
}