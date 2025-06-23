class Solution {
    public String[] divideString(String s, int k, char fill) {
        int div = 0;
        if (s.length() % k == 0){
            div = s.length() / k;
        } else {
            div = (s.length() / k) + 1;
        }
        String[] sArr = new String[div];
        int sk = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < div; i++) {
            if (sk + k <= s.length()) {
                sArr[i] = s.substring(sk, sk + k);
            } else {
                sb.append(s.substring(sk));
                while (sb.length() < k) {
                    sb.append(Character.toString(fill));
                }
                sArr[i] = sb.toString();
            }
            sk = sk + k;
        }
        return sArr;
    }
}