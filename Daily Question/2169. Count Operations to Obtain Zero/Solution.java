class Solution {
    public int countOperations(int num1, int num2) {
        if (num1 == 0) return 0;
        if (num2 == 0) return 0;
        int coun = 0;
        while (num1 >= 0 | num2 >= 0) {
            System.out.println("num1 = " + num1 + " num2 = " + num2);
            if (num1 >= num2) {
                coun++;
                num1 = num1 - num2;
            } else if (num1 < num2) {
                num2 = num2 - num1;
                coun++;
            }
            if (num1 == 0) return coun;
            if (num2 == 0) return coun;
        }
        return coun;
    }
}