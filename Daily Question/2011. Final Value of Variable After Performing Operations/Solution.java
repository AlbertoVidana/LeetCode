class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int val = 0;
        for (String s : operations) {
            String sp = s.replace("X", "");
            if(sp.equals("++")) {
                val++;
            } else {
                val--;
            }
        }   
        return val;
    }
}