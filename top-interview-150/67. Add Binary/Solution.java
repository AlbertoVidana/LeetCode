class Solution {
    public String addBinary(String a, String b) {
        return addBinaryX(a, b);
    }
    public static String addBinaryX(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0'; // Convert char to int
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0'; // Convert char to int
            }

            result.insert(0, sum % 2); // Prepend the current bit
            carry = sum / 2;           // Calculate the carry
        }
        return result.toString();
    }
}