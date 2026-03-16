import java.math.BigInteger;
//class Fancy
class Solution {
    final long MOD = 1000000007L;
    ArrayList<Long> arr = new ArrayList<>();
    public Solution() {
        
    }
    
    public void append(int val) {
        arr.add((long) val);
    }
    
    public void addAll(int inc) {
        for (int i = 0; i < arr.size(); i++) {
            long val = arr.get(i) + inc;
            arr.set(i, val);
        }
    }
    
    public void multAll(int m) {
        for (int i = 0; i < arr.size(); i++) {
            long val = arr.get(i) * m;
            arr.set(i, val);
        }
    }
    
    public int getIndex(int idx) {
        if (idx >= arr.size()) {
            return -1;
        }
        long val = arr.get(idx);
        BigInteger bi = BigInteger.valueOf((int)val);
        BigInteger bigInt = BigInteger.valueOf(MOD);
        return bi.modInverse(bigInt).intValue();
    }
}

/**
 * Your Fancy object will be instantiated and called as such:
 * Fancy obj = new Fancy();
 * obj.append(val);
 * obj.addAll(inc);
 * obj.multAll(m);
 * int param_4 = obj.getIndex(idx);
 */